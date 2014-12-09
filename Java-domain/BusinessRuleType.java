
import java.util.*;


/**
 * Class BusinessRuleType
 */
public class BusinessRuleType {

  //
  // Fields
  //

  private String code;
  private String name;
  private String definition;
  private String example;
  private CodeGenerator associatedGenerator;
  
  //
  // Constructors
  //
  public BusinessRuleType () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of code
   * @param newVar the new value of code
   */
  private void setCode (String newVar) {
    code = newVar;
  }

  /**
   * Get the value of code
   * @return the value of code
   */
  private String getCode () {
    return code;
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
   * Set the value of definition
   * @param newVar the new value of definition
   */
  private void setDefinition (String newVar) {
    definition = newVar;
  }

  /**
   * Get the value of definition
   * @return the value of definition
   */
  private String getDefinition () {
    return definition;
  }

  /**
   * Set the value of example
   * @param newVar the new value of example
   */
  private void setExample (String newVar) {
    example = newVar;
  }

  /**
   * Get the value of example
   * @return the value of example
   */
  private String getExample () {
    return example;
  }

  /**
   * Set the value of associatedGenerator
   * @param newVar the new value of associatedGenerator
   */
  private void setAssociatedGenerator (CodeGenerator newVar) {
    associatedGenerator = newVar;
  }

  /**
   * Get the value of associatedGenerator
   * @return the value of associatedGenerator
   */
  private CodeGenerator getAssociatedGenerator () {
    return associatedGenerator;
  }

  //
  // Other methods
  //

}
