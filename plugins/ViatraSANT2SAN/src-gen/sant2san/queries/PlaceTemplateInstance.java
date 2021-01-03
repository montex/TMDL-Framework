/**
 * Generated from platform:/resource/ViatraSANT2SAN/src/sant2san/queries/Sant2SanQueries.vql
 */
package sant2san.queries;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.modelspartiti.formalisms.san.sant.PlaceTemplate;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern PlaceTemplateInstance ( place: PlaceTemplate){
 *         	PlaceTemplate(place);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class PlaceTemplateInstance extends BaseGeneratedEMFQuerySpecification<PlaceTemplateInstance.Matcher> {
  /**
   * Pattern-specific match representation of the sant2san.queries.PlaceTemplateInstance pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private PlaceTemplate fPlace;
    
    private static List<String> parameterNames = makeImmutableList("place");
    
    private Match(final PlaceTemplate pPlace) {
      this.fPlace = pPlace;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "place": return this.fPlace;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fPlace;
          default: return null;
      }
    }
    
    public PlaceTemplate getPlace() {
      return this.fPlace;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("place".equals(parameterName) ) {
          this.fPlace = (PlaceTemplate) newValue;
          return true;
      }
      return false;
    }
    
    public void setPlace(final PlaceTemplate pPlace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPlace = pPlace;
    }
    
    @Override
    public String patternName() {
      return "sant2san.queries.PlaceTemplateInstance";
    }
    
    @Override
    public List<String> parameterNames() {
      return PlaceTemplateInstance.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fPlace};
    }
    
    @Override
    public PlaceTemplateInstance.Match toImmutable() {
      return isMutable() ? newMatch(fPlace) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"place\"=" + prettyPrintValue(fPlace));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fPlace);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof PlaceTemplateInstance.Match)) {
          PlaceTemplateInstance.Match other = (PlaceTemplateInstance.Match) obj;
          return Objects.equals(fPlace, other.fPlace);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public PlaceTemplateInstance specification() {
      return PlaceTemplateInstance.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static PlaceTemplateInstance.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPlace the fixed value of pattern parameter place, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static PlaceTemplateInstance.Match newMutableMatch(final PlaceTemplate pPlace) {
      return new Mutable(pPlace);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPlace the fixed value of pattern parameter place, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static PlaceTemplateInstance.Match newMatch(final PlaceTemplate pPlace) {
      return new Immutable(pPlace);
    }
    
    private static final class Mutable extends PlaceTemplateInstance.Match {
      Mutable(final PlaceTemplate pPlace) {
        super(pPlace);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends PlaceTemplateInstance.Match {
      Immutable(final PlaceTemplate pPlace) {
        super(pPlace);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the sant2san.queries.PlaceTemplateInstance pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern PlaceTemplateInstance ( place: PlaceTemplate){
   * 	PlaceTemplate(place);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see PlaceTemplateInstance
   * 
   */
  public static class Matcher extends BaseMatcher<PlaceTemplateInstance.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static PlaceTemplateInstance.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static PlaceTemplateInstance.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PLACE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PlaceTemplateInstance.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPlace the fixed value of pattern parameter place, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<PlaceTemplateInstance.Match> getAllMatches(final PlaceTemplate pPlace) {
      return rawStreamAllMatches(new Object[]{pPlace}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pPlace the fixed value of pattern parameter place, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<PlaceTemplateInstance.Match> streamAllMatches(final PlaceTemplate pPlace) {
      return rawStreamAllMatches(new Object[]{pPlace});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPlace the fixed value of pattern parameter place, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<PlaceTemplateInstance.Match> getOneArbitraryMatch(final PlaceTemplate pPlace) {
      return rawGetOneArbitraryMatch(new Object[]{pPlace});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPlace the fixed value of pattern parameter place, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final PlaceTemplate pPlace) {
      return rawHasMatch(new Object[]{pPlace});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPlace the fixed value of pattern parameter place, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final PlaceTemplate pPlace) {
      return rawCountMatches(new Object[]{pPlace});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPlace the fixed value of pattern parameter place, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final PlaceTemplate pPlace, final Consumer<? super PlaceTemplateInstance.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPlace}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPlace the fixed value of pattern parameter place, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public PlaceTemplateInstance.Match newMatch(final PlaceTemplate pPlace) {
      return PlaceTemplateInstance.Match.newMatch(pPlace);
    }
    
    /**
     * Retrieve the set of values that occur in matches for place.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<PlaceTemplate> rawStreamAllValuesOfplace(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PLACE, parameters).map(PlaceTemplate.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for place.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PlaceTemplate> getAllValuesOfplace() {
      return rawStreamAllValuesOfplace(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for place.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<PlaceTemplate> streamAllValuesOfplace() {
      return rawStreamAllValuesOfplace(emptyArray());
    }
    
    @Override
    protected PlaceTemplateInstance.Match tupleToMatch(final Tuple t) {
      try {
          return PlaceTemplateInstance.Match.newMatch((PlaceTemplate) t.get(POSITION_PLACE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PlaceTemplateInstance.Match arrayToMatch(final Object[] match) {
      try {
          return PlaceTemplateInstance.Match.newMatch((PlaceTemplate) match[POSITION_PLACE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PlaceTemplateInstance.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PlaceTemplateInstance.Match.newMutableMatch((PlaceTemplate) match[POSITION_PLACE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<PlaceTemplateInstance.Matcher> querySpecification() {
      return PlaceTemplateInstance.instance();
    }
  }
  
  private PlaceTemplateInstance() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static PlaceTemplateInstance instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected PlaceTemplateInstance.Matcher instantiate(final ViatraQueryEngine engine) {
    return PlaceTemplateInstance.Matcher.on(engine);
  }
  
  @Override
  public PlaceTemplateInstance.Matcher instantiate() {
    return PlaceTemplateInstance.Matcher.create();
  }
  
  @Override
  public PlaceTemplateInstance.Match newEmptyMatch() {
    return PlaceTemplateInstance.Match.newEmptyMatch();
  }
  
  @Override
  public PlaceTemplateInstance.Match newMatch(final Object... parameters) {
    return PlaceTemplateInstance.Match.newMatch((org.modelspartiti.formalisms.san.sant.PlaceTemplate) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link PlaceTemplateInstance} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link PlaceTemplateInstance#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final PlaceTemplateInstance INSTANCE = new PlaceTemplateInstance();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final PlaceTemplateInstance.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_place = new PParameter("place", "org.modelspartiti.formalisms.san.sant.PlaceTemplate", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.modelspartiti.org/templates/san/sant", "PlaceTemplate")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_place);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "sant2san.queries.PlaceTemplateInstance";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("place");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_place = body.getOrCreateVariableByName("place");
          new TypeConstraint(body, Tuples.flatTupleOf(var_place), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.modelspartiti.org/templates/san/sant", "PlaceTemplate")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_place, parameter_place)
          ));
          // 	PlaceTemplate(place)
          new TypeConstraint(body, Tuples.flatTupleOf(var_place), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.modelspartiti.org/templates/san/sant", "PlaceTemplate")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
