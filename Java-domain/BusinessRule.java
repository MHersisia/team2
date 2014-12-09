
import java.util.*;


/**
 * Class BusinessRule
 */
public class BusinessRule {

  //
  // Fields
  //

  private String Code;
  private String name;
  private String triggering_event;
  private String trigger_code;
  private String constraint_statement;
  private String id_altered_aspect;
  private String failure_severity;
  private String failure_message;
  private Operator theOperator;
  private Attribute theAttribute;
  private ComparedValue comparedValue;
  private BusinessRuleType businessRuleType;
  private ArrayList<RuleStack> theRuleStack;
  
  //
  // Constructors
  //
  public BusinessRule () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Code
   * @param newVar the new value of Code
   */
  private void setCode (String newVar) {
    Code = newVar;
  }

  /**
   * Get the value of Code
   * @return the value of Code
   */
  private String getCode () {
    return Code;
  }

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  private void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  private String getName () {
    return name;
  }

  /**
   * Set the value of triggering_event
   * @param newVar the new value of triggering_event
   */
  private void setTriggering_event (String newVar) {
    triggering_event = newVar;
  }

  /**
   * Get the value of triggering_event
   * @return the value of triggering_event
   */
  private String getTriggering_event () {
    return triggering_event;
  }

  /**
   * Set the value of trigger_code
   * @param newVar the new value of trigger_code
   */
  private void setTrigger_code (String newVar) {
    trigger_code = newVar;
  }

  /**
   * Get the value of trigger_code
   * @return the value of trigger_code
   */
  private String getTrigger_code () {
    return trigger_code;
  }

  /**
   * Set the value of constraint_statement
   * @param newVar the new value of constraint_statement
   */
  private void setConstraint_statement (String newVar) {
    constraint_statement = newVar;
  }

  /**
   * Get the value of constraint_statement
   * @return the value of constraint_statement
   */
  private String getConstraint_statement () {
    return constraint_statement;
  }

  /**
   * Set the value of id_altered_aspect
   * @param newVar the new value of id_altered_aspect
   */
  private void setId_altered_aspect (String newVar) {
    id_altered_aspect = newVar;
  }

  /**
   * Get the value of id_altered_aspect
   * @return the value of id_altered_aspect
   */
  private String getId_altered_aspect () {
    return id_altered_aspect;
  }

  /**
   * Set the value of failure_severity
   * @param newVar the new value of failure_severity
   */
  private void setFailure_severity (String newVar) {
    failure_severity = newVar;
  }

  /**
   * Get the value of failure_severity
   * @return the value of failure_severity
   */
  private String getFailure_severity () {
    return failure_severity;
  }

  /**
   * Set the value of failure_message
   * @param newVar the new value of failure_message
   */
  private void setFailure_message (String newVar) {
    failure_message = newVar;
  }

  /**
   * Get the value of failure_message
   * @return the value of failure_message
   */
  private String getFailure_message () {
    return failure_message;
  }

  /**
   * Set the value of theOperator
   * @param newVar the new value of theOperator
   */
  private void setTheOperator (Operator newVar) {
    theOperator = newVar;
  }

  /**
   * Get the value of theOperator
   * @return the value of theOperator
   */
  private Operator getTheOperator () {
    return theOperator;
  }

  /**
   * Set the value of theAttribute
   * @param newVar the new value of theAttribute
   */
  private void setTheAttribute (Attribute newVar) {
    theAttribute = newVar;
  }

  /**
   * Get the value of theAttribute
   * @return the value of theAttribute
   */
  private Attribute getTheAttribute () {
    return theAttribute;
  }

  /**
   * Set the value of comparedValue
   * @param newVar the new value of comparedValue
   */
  private void setComparedValue (ComparedValue newVar) {
    comparedValue = newVar;
  }

  /**
   * Get the value of comparedValue
   * @return the value of comparedValue
   */
  private ComparedValue getComparedValue () {
    return comparedValue;
  }

  /**
   * Set the value of businessRuleType
   * @param newVar the new value of businessRuleType
   */
  private void setBusinessRuleType (BusinessRuleType newVar) {
    businessRuleType = newVar;
  }

  /**
   * Get the value of businessRuleType
   * @return the value of businessRuleType
   */
  private BusinessRuleType getBusinessRuleType () {
    return businessRuleType;
  }

  /**
   * Set the value of theRuleStack
   * @param newVar the new value of theRuleStack
   */
  private void setTheRuleStack (ArrayList<RuleStack> newVar) {
    theRuleStack = newVar;
  }

  /**
   * Get the value of theRuleStack
   * @return the value of theRuleStack
   */
  private ArrayList<RuleStack> getTheRuleStack () {
    return theRuleStack;
  }

  //
  // Other methods
  //

}
