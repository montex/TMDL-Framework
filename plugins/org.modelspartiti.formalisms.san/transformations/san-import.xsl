<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">

	<xsl:output indent="yes" />

	<!-- These variables control the parsing of cases.
		 As of Mobius 2.5 ".san" format, the case to which an arc is connected is stored
		 only in terms of the (x,y) coordinates of the initial vertex of the arc.
		 The same holds for output gates -->
	<xsl:variable name="casespacing">11</xsl:variable>
	<xsl:variable name="caseoffset">0</xsl:variable>

	<!-- This template generates a san:ExpressionTest element from a string value
	     and it is used in several parts of the transformation -->
	<xsl:template name="stringtoexpression" match="string">
		<segments xsi:type="san:ExpressionText">
			<text><xsl:value-of select="."/></text>
		</segments>
	</xsl:template>

	<!-- Finds the name attribute of a SAN element -->
	<xsl:template name="findname">
		<xsl:attribute name="name">
			<xsl:value-of select="descendant::class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name']"/>
		</xsl:attribute>
	</xsl:template>

	<!-- Transform cases of activities. Used both in timed and in instantaneous activities -->
	<xsl:template name="cases">
		<xsl:for-each select="descendant::vector[@id='CaseDistributions']/string">
			<cases>
				<xsl:attribute name="ID"><xsl:value-of select="@id" /></xsl:attribute>
				<p><xsl:call-template name="stringtoexpression"/></p>
			</cases>
		</xsl:for-each>
	</xsl:template>

	<!-- Main transformation code -->
	<xsl:template match="class[@id='Mobius.AtomicModels.San.SanInterface']">
<xsl:text>&#10;</xsl:text>
<san:SAN xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:san="http://www.modelspartiti.org/templates/san/san">
	<xsl:attribute name="name">
		<xsl:value-of select="class/string[@id='ModelName']"/>
	</xsl:attribute>

	<!-- Normal places -->
	<xsl:for-each select="//class[@id='Mobius.AtomicModels.San.PlacePanelObject']">
	<xsl:variable name="myname">
		<xsl:value-of select="descendant::class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name']" />
	</xsl:variable>
	<xsl:choose>
		<!-- If it is an ExtendedPlace -->
		<xsl:when test="ancestor::class[@id='Mobius.AtomicModels.San.ExtendedPlacePanelObject']">
			<places xsi:type="san:ExtendedPlace" name="{$myname}">
				<xsl:attribute name="type"><xsl:value-of select="../string[@id='type']"/></xsl:attribute>
				<xsl:variable name="initialMarking"><xsl:value-of select="../string[@id='initialMarking']"/></xsl:variable>
		 		<xsl:choose>
					<xsl:when test="//vector[@id='LocalGlobalNamesList']/string[.=$initialMarking]">
						<marking xsi:type="san:MarkingVariableExtended">
							<xsl:attribute name="variable"><xsl:value-of select="../string[@id=0]"/></xsl:attribute>
						</marking>
					</xsl:when>
					<xsl:otherwise>
						<marking xsi:type="san:MarkingString">
							<xsl:attribute name="value"><xsl:value-of select="../string[@id=0]"/></xsl:attribute>
						</marking>
					</xsl:otherwise>
				</xsl:choose>
			</places>
		</xsl:when>
		<!-- Otherwise: it is a normal place -->
		<xsl:otherwise>
			<places xsi:type="san:NormalPlace" name="{$myname}">
		 		<xsl:choose>
					<xsl:when test="boolean[@id='ConstantMarking']='true'">
						<marking xsi:type="san:MarkingInteger">
							<xsl:attribute name="value"><xsl:value-of select="int[@id='InitialState']"/></xsl:attribute>
						</marking>
					</xsl:when>
					<xsl:otherwise>
						<marking xsi:type="san:MarkingVariableSimple">
							<xsl:attribute name="variable"><xsl:value-of select="string[@id='InitialState']"/></xsl:attribute>
						</marking>
					</xsl:otherwise>
				</xsl:choose>
			</places>
		</xsl:otherwise>
	</xsl:choose>
	</xsl:for-each>

	<!-- Timed activities -->
	<xsl:for-each select="//class[@id='Mobius.AtomicModels.San.TimedActivityPanelObject']">
	<activities xsi:type="san:TimedActivity">
 		<xsl:call-template name="findname"/>
 		<xsl:call-template name="distribution"/>
 		<xsl:call-template name="cases"/>
	</activities>
	</xsl:for-each>

	<!-- Instantaneous activities -->
	<xsl:for-each select="//class[@id='Mobius.AtomicModels.San.InstantaneousActivityPanelObject']">
	<activities xsi:type="san:InstantaneousActivity">
 		<xsl:call-template name="findname"/>
 		<xsl:call-template name="cases"/>
	</activities>
	</xsl:for-each>

	<!-- Input and output arcs -->
	<xsl:for-each select="//class[@id='Mobius.AtomicModels.San.ActivityPanelObject']">
		<xsl:variable name="myname"><xsl:value-of select="descendant::class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name']" /></xsl:variable>
		<xsl:variable name="numcases"><xsl:value-of select="int[@id='NumberOfCases']"/></xsl:variable>
		<xsl:variable name="mycenter"><xsl:value-of select="descendant::point[@id='CenterPoint']/int[@id='y']"/></xsl:variable>

		<!-- Input arcs -->
		<xsl:for-each select="//class[@id='Mobius.BaseClasses.BaseEdgeClass']/string[@id='FinishVertex'][.=$myname]">
			<xsl:variable name="start"><xsl:value-of select="../string[@id='StartVertex']"/></xsl:variable>
			<xsl:if test="//class[@id='Mobius.AtomicModels.San.PlacePanelObject']//class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name'][.=$start]">
				<arcs xsi:type="san:InputArc"
					source="{$start}"
					target="{$myname}" />
			</xsl:if>
		</xsl:for-each>

		<!-- Output arcs
		     For output arcs it is necessary to determine to which case they are connected.
		     As of Mobius 2.5, this can only done by comparing the (x,y) coordinates of initial vertex of the arc
		     with the (x,y) coordinates of the activity. -->
		<xsl:for-each select="//class[@id='Mobius.BaseClasses.BaseEdgeClass']/string[@id='StartVertex'][.=$myname]">
			<xsl:variable name="finish"><xsl:value-of select="../string[@id='FinishVertex']"/></xsl:variable>
			<xsl:variable name="arcposition"><xsl:value-of select="../vector[@id='PointList']/point[@id='0']/int[@id='y']"/></xsl:variable>
			<!-- Find the case to which the arc is connected.
			     This is obtained by assuming a spacing of $casespacing pixels between cases and an offset of $caseoffset,
			     and comparing the position of the initial vertex of the arc ($arcposition) with the center point of the activity -->
			<xsl:variable name="caseid">
				<xsl:value-of select="floor(($arcposition - ($mycenter + $caseoffset - ($numcases * $casespacing div 2))) div $casespacing)"></xsl:value-of>
			</xsl:variable>
			<!-- The identified case number is fixed if it results to be < 0 or > than $numcases-1 -->
			<xsl:variable name="caseidfixed">
				<xsl:choose>
					<xsl:when test="$caseid > $numcases - 1"><xsl:value-of select="$numcases - 1"/></xsl:when>
					<xsl:when test="$caseid &lt; 0"><xsl:value-of select="0"/></xsl:when>
					<xsl:otherwise><xsl:value-of select="$caseid"/></xsl:otherwise>
				</xsl:choose>
			</xsl:variable>
			<xsl:if test="//class[@id='Mobius.AtomicModels.San.PlacePanelObject']//class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name'][.=$finish]">
				<arcs xsi:type="san:OutputArc"
					source="//@activities[name='{$myname}']/@cases[ID='{$caseidfixed}']"
					target="{$finish}"
				/>
			</xsl:if>
		</xsl:for-each>
	</xsl:for-each>

	<!-- Input gates -->
	<xsl:for-each select="//class[@id='Mobius.AtomicModels.San.InputGatePanelObject']">
		<xsl:variable name="myname">
			<xsl:value-of select="descendant::class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name']" />
		</xsl:variable>
		<gates xsi:type="san:InputGate" name="{$myname}">
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

	<!-- Output gates.
	     As for output arcs, for output gates we need to determine the case to which they are connected. -->
	<xsl:for-each select="//class[@id='Mobius.AtomicModels.San.OutputGatePanelObject']">
 		<xsl:variable name="myname">
			<xsl:value-of select="descendant::class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name']" />
		</xsl:variable>
		<xsl:variable name="myactivity">
			<xsl:value-of select="//class[@id='Mobius.BaseClasses.BaseEdgeClass']/string[@id='FinishVertex'][.=$myname]/../string[@id='StartVertex']"/>
		</xsl:variable>
		<xsl:variable name="mycenter">
			<xsl:value-of select="//class[@id='Mobius.AtomicModels.San.ActivityPanelObject']//class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name'][.=$myactivity]/../..//point[@id='CenterPoint']/int[@id='y']"/>
		</xsl:variable>
		<xsl:variable name="numcases"><xsl:value-of select="//class[@id='Mobius.AtomicModels.San.ActivityPanelObject']//class[@id='Mobius.BaseClasses.BasePanelObjectClass']/string[@id='Name'][.=$myactivity]/../../../../int[@id='NumberOfCases']"/></xsl:variable>
		<xsl:variable name="arcposition"><xsl:value-of select="//class[@id='Mobius.BaseClasses.BaseEdgeClass']/string[@id='FinishVertex'][.=$myname]/../vector[@id='PointList']/point[@id='0']/int[@id='y']"/></xsl:variable>

		<xsl:variable name="caseid">
			<xsl:value-of select="floor(($arcposition - ($mycenter + $caseoffset - ($numcases * $casespacing div 2))) div $casespacing)"></xsl:value-of>
		</xsl:variable>
		<!-- The identified case number is fixed if it results to be < 0 or > than $numcases-1 -->
		<xsl:variable name="caseidfixed">
			<xsl:choose>
				<xsl:when test="$caseid > $numcases - 1"><xsl:value-of select="$numcases - 1"/></xsl:when>
				<xsl:when test="$caseid &lt; 0"><xsl:value-of select="0"/></xsl:when>
				<xsl:otherwise><xsl:value-of select="$caseid"/></xsl:otherwise>
			</xsl:choose>
		</xsl:variable>

		<gates xsi:type="san:OutputGate" name="{$myname}"
			activityCase="//@activities[name='{$myactivity}']/@cases[ID='{$caseidfixed}']">
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

	<!-- Global variables -->
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

	<!-- Custom initialization -->
	<xsl:for-each select="//class[@id='Mobius.AtomicModels.San.SanInfoClass']">
	<initialization>
		<xsl:apply-templates select="string[@id='CustomInitialization']" />
	</initialization>
	</xsl:for-each>

</san:SAN>
	</xsl:template>

	<!-- Transform firing time distributions of timed activities  -->
	<xsl:template name="distribution">
		<xsl:for-each select="descendant::class[@id='Mobius.BaseClasses.Distributions.DistributionFunction']">
			<timeDistribution>
			<xsl:variable name="distkind"><xsl:value-of select="string[@id='Name']"/></xsl:variable>
			<xsl:choose>
				<xsl:when test="$distkind='Exponential'">
					<xsl:attribute name="xsi:type">san:Exponential</xsl:attribute>
					<rate><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></rate>
				</xsl:when>
				<xsl:when test="$distkind='Normal'">
					<xsl:attribute name="xsi:type">san:Normal</xsl:attribute>
					<mean><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></mean>
					<variance><xsl:apply-templates select="vector[@id='Parameters']/string[@id=1]"/></variance>
				</xsl:when>
				<xsl:when test="$distkind='Gamma'">
					<xsl:attribute name="xsi:type">san:Gamma</xsl:attribute>
					<alpha><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></alpha>
					<beta><xsl:apply-templates select="vector[@id='Parameters']/string[@id=1]"/></beta>
				</xsl:when>
				<xsl:when test="$distkind='Binomial'">
					<xsl:attribute name="xsi:type">san:Binomial</xsl:attribute>
					<t><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></t>
					<p><xsl:apply-templates select="vector[@id='Parameters']/string[@id=1]"/></p>
				</xsl:when>
				<xsl:when test="$distkind='Deterministic'">
					<xsl:attribute name="xsi:type">san:Deterministic</xsl:attribute>
					<value><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></value>
				</xsl:when>
				<xsl:when test="$distkind='Lognormal'">
					<xsl:attribute name="xsi:type">san:Lognormal</xsl:attribute>
					<mu><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></mu>
					<alphaSquared><xsl:apply-templates select="vector[@id='Parameters']/string[@id=1]"/></alphaSquared>
				</xsl:when>
				<xsl:when test="$distkind='Beta'">
					<xsl:attribute name="xsi:type">san:Beta</xsl:attribute>
					<alpha1><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></alpha1>
					<beta1><xsl:apply-templates select="vector[@id='Parameters']/string[@id=1]"/></beta1>
				</xsl:when>
				<xsl:when test="$distkind='NegativeBinomial'">
					<xsl:attribute name="xsi:type">san:NegativeBinomial</xsl:attribute>
					<s><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></s>
					<p><xsl:apply-templates select="vector[@id='Parameters']/string[@id=1]"/></p>
				</xsl:when>
				<xsl:when test="$distkind='Geometric'">
					<xsl:attribute name="xsi:type">san:Geometric</xsl:attribute>
					<p><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></p>
				</xsl:when>
				<xsl:when test="$distkind='Erlang'">
					<xsl:attribute name="xsi:type">san:Erlang</xsl:attribute>
					<m><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></m>
					<beta><xsl:apply-templates select="vector[@id='Parameters']/string[@id=1]"/></beta>
				</xsl:when>
				<xsl:when test="$distkind='Uniform'">
					<xsl:attribute name="xsi:type">san:Uniform</xsl:attribute>
					<lowerBound><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></lowerBound>
					<upperBound><xsl:apply-templates select="vector[@id='Parameters']/string[@id=1]"/></upperBound>
				</xsl:when>
				<xsl:when test="$distkind='HyperExponential'">
					<xsl:attribute name="xsi:type">san:HyperExponential</xsl:attribute>
					<rate0><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></rate0>
					<p0><xsl:apply-templates select="vector[@id='Parameters']/string[@id=1]"/></p0>
				</xsl:when>
				<xsl:when test="$distkind='Weibull'">
					<xsl:attribute name="xsi:type">san:Weibull</xsl:attribute>
					<alpha><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></alpha>
					<beta><xsl:apply-templates select="vector[@id='Parameters']/string[@id=1]"/></beta>
				</xsl:when>
				<xsl:when test="$distkind='Triangular'">
					<xsl:attribute name="xsi:type">san:Triangular</xsl:attribute>
					<min><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></min>
					<middle><xsl:apply-templates select="vector[@id='Parameters']/string[@id=1]"/></middle>
					<max><xsl:apply-templates select="vector[@id='Parameters']/string[@id=2]"/></max>
				</xsl:when>
				<xsl:when test="$distkind='ConditionalWeibull'">
					<xsl:attribute name="xsi:type">san:ConditionalWeibull</xsl:attribute>
					<alpha><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></alpha>
					<beta><xsl:apply-templates select="vector[@id='Parameters']/string[@id=1]"/></beta>
					<t><xsl:apply-templates select="vector[@id='Parameters']/string[@id=2]"/></t>
				</xsl:when>
				<xsl:when test="$distkind='HypoExponential'">
					<xsl:attribute name="xsi:type">san:HypoExponential</xsl:attribute>
					<rate0><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></rate0>
				</xsl:when>
				<xsl:when test="$distkind='Pareto'">
					<xsl:attribute name="xsi:type">san:Pareto</xsl:attribute>
					<lowerbound><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></lowerbound>
					<shape><xsl:apply-templates select="vector[@id='Parameters']/string[@id=1]"/></shape>
				</xsl:when>
				<xsl:when test="$distkind='ConditionalWeibull'">
					<xsl:attribute name="xsi:type">san:ConditionalWeibull</xsl:attribute>
					<alpha><xsl:apply-templates select="vector[@id='Parameters']/string[@id=0]"/></alpha>
					<beta><xsl:apply-templates select="vector[@id='Parameters']/string[@id=1]"/></beta>
					<t><xsl:apply-templates select="vector[@id='Parameters']/string[@id=2]"/></t>
				</xsl:when>
			</xsl:choose>
			</timeDistribution>
		</xsl:for-each>
	</xsl:template>

</xsl:stylesheet>