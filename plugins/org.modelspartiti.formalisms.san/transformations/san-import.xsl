<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">

	<xsl:output indent="yes" />

	<xsl:template name="stringtoexpression" match="string">
		<segments xsi:type="san:ExpressionText">
			<text><xsl:value-of select="."/></text>
		</segments>
	</xsl:template>

	<xsl:template name="findname">
		<xsl:attribute name="name">
			<xsl:value-of select="descendant::class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name']"/>
		</xsl:attribute>
	</xsl:template>
	
	<xsl:template name="cases">
		<xsl:for-each select="descendant::vector[@id='CaseDistributions']/string">
			<cases>
				<xsl:attribute name="ID"><xsl:value-of select="@id" /></xsl:attribute>
				<p><xsl:call-template name="stringtoexpression"/></p>
			</cases>
		</xsl:for-each>
	</xsl:template>

	<xsl:template match="class[@id='Mobius.AtomicModels.San.SanInterface']">
<xsl:text>&#10;</xsl:text>
<san:SAN xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:san="http://www.modelspartiti.org/templates/san/san">
	<xsl:attribute name="name">
		<xsl:value-of select="class/string[@id='ModelName']"/>
	</xsl:attribute>
	
	<xsl:for-each select="//class[@id='Mobius.AtomicModels.San.PlacePanelObject']">
	<xsl:variable name="myname">
		<xsl:value-of select="descendant::class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name']" />
	</xsl:variable>
	<places xsi:type="san:NormalPlace">
 		<xsl:call-template name="findname"/>
		<xsl:choose>
			<xsl:when test="boolean[@id='ConstantMarking']='true'">
				<marking xsi:type="san:MarkingInteger">
					<xsl:attribute name="value"><xsl:value-of select="int[@id='InitialState']"/></xsl:attribute>
				</marking>
			</xsl:when>
			<xsl:otherwise>
				<marking xsi:type="san:MarkingVariable">
					<xsl:attribute name="variable"><xsl:value-of select="string[@id='InitialState']"/></xsl:attribute>
				</marking>
			</xsl:otherwise>
		</xsl:choose>
	</places>
	</xsl:for-each>
	
	<xsl:for-each select="//class[@id='Mobius.AtomicModels.San.TimedActivityPanelObject']">
	<activities xsi:type="san:TimedActivity">
 		<xsl:call-template name="findname"/>
 		<xsl:call-template name="cases"/>
	</activities>
	</xsl:for-each>
	
	<xsl:for-each select="//class[@id='Mobius.AtomicModels.San.InstantaneousActivityPanelObject']">
	<activities xsi:type="san:InstantaneousActivity">
 		<xsl:call-template name="findname"/>
	</activities>
	</xsl:for-each>
	
	<xsl:for-each select="//class[@id='Mobius.BaseClasses.BaseEdgeClass']">
		<xsl:variable name="start"><xsl:value-of select="string[@id='StartVertex']"/></xsl:variable>
		<xsl:variable name="finish"><xsl:value-of select="string[@id='FinishVertex']"/></xsl:variable>
		
		<xsl:choose>
			<xsl:when test="//class[@id='Mobius.AtomicModels.San.PlacePanelObject']//class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name'][.=$start]">
				<!-- There is a Place named like $start -->
				<xsl:if test="//class[@id='Mobius.AtomicModels.San.ActivityPanelObject']//class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name'][.=$finish]">
					<!-- If $finish is an Activity then create an InputArc, otherwise do nothing (it is a gate) -->
					<arcs xsi:type="san:InputArc">
						<xsl:attribute name="source"><xsl:value-of select="$start" /></xsl:attribute>
						<xsl:attribute name="target"><xsl:value-of select="$finish" /></xsl:attribute>
					</arcs>
				</xsl:if>
			</xsl:when>
			<xsl:when test="//class[@id='Mobius.AtomicModels.San.PlacePanelObject']//class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name'][.=$finish]">
				<!-- There is a Place named like $finish -->
				<xsl:if test="//class[@id='Mobius.AtomicModels.San.ActivityPanelObject']//class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name'][.=$start]">
					<!-- If $start is an Activity then create an OutputArc, otherwise do nothing (it is a gate) -->
					<arcs xsi:type="san:OutputArc">
						<xsl:attribute name="source"><xsl:value-of select="$start" /></xsl:attribute>
						<xsl:attribute name="target"><xsl:value-of select="$finish" /></xsl:attribute>
					</arcs>
				</xsl:if>
			</xsl:when>
		</xsl:choose>
	</xsl:for-each>
	
	<xsl:for-each select="//class[@id='Mobius.AtomicModels.San.InputGatePanelObject']">
	<gates xsi:type="san:InputGate">
 		<xsl:call-template name="findname"/>
		<xsl:variable name="myname">
			<xsl:value-of select="descendant::class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name']" />
		</xsl:variable>
 		<xsl:attribute name="activity">
			<xsl:for-each select="//class[@id='Mobius.BaseClasses.BaseEdgeClass']">
				<xsl:if test="string[@id='StartVertex']=$myname">
					<xsl:value-of select="string[@id='FinishVertex']"/>
				</xsl:if>
			</xsl:for-each>
 		</xsl:attribute>
 		<xsl:attribute name="places">
			<xsl:for-each select="//class[@id='Mobius.BaseClasses.BaseEdgeClass']">
				<xsl:if test="string[@id='FinishVertex']=$myname">
					<xsl:value-of select="concat(string[@id='StartVertex'],' ')"/>
				</xsl:if>
			</xsl:for-each>
		</xsl:attribute>
		<predicate>
			<xsl:apply-templates select="string[@id='Predicate']" />
		</predicate>
		<function>
			<xsl:apply-templates select="string[@id='Function']" />
		</function>
	</gates>
	</xsl:for-each>
	
	<xsl:for-each select="//class[@id='Mobius.AtomicModels.San.OutputGatePanelObject']">
	<gates xsi:type="san:OutputGate">
 		<xsl:call-template name="findname"/>
		<xsl:variable name="myname">
			<xsl:value-of select="descendant::class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name']" />
		</xsl:variable>
 		<xsl:attribute name="activity">
			<xsl:for-each select="//class[@id='Mobius.BaseClasses.BaseEdgeClass']">
				<xsl:if test="string[@id='FinishVertex']=$myname">
					<xsl:value-of select="string[@id='StartVertex']"/>
				</xsl:if>
			</xsl:for-each>
 		</xsl:attribute>
 		<xsl:attribute name="places">
			<xsl:for-each select="//class[@id='Mobius.BaseClasses.BaseEdgeClass']">
				<xsl:if test="string[@id='StartVertex']=$myname">
					<xsl:value-of select="concat(string[@id='FinishVertex'],' ')"/>
				</xsl:if>
			</xsl:for-each>
		</xsl:attribute>
		<function>
			<xsl:apply-templates select="string[@id='Function']" />
		</function>
	</gates>
	</xsl:for-each>
	
	<xsl:for-each select="//vector[@id='LocalGlobalNamesList']">
		<xsl:for-each select="string">
			<globalVariables>
			<xsl:attribute name="name"><xsl:value-of select="."/></xsl:attribute>
			<xsl:attribute name="type">
				<xsl:variable name="currid"><xsl:value-of select="@id" /></xsl:variable>
				<xsl:value-of select="../../vector[@id='LocalGlobalTypesList']/string[@id=$currid]"/>
			</xsl:attribute>
			</globalVariables>
		</xsl:for-each>
	</xsl:for-each>

	<xsl:for-each select="//class[@id='Mobius.AtomicModels.San.SanInfoClass']">
	<initialization>
		<xsl:apply-templates select="string[@id='CustomInitialization']" />
	</initialization>
	</xsl:for-each>
	
</san:SAN>
	</xsl:template>
</xsl:stylesheet>