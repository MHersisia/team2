
import java.util.*;


/**
 * Class Category
 */
public class Category {

  //
  // Fields
  //

  private String name;
  private ArrayList<BusinessRuleType> types;
  
  //
  // Constructors
  //
  public Category () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

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
   * Set the value of types
   * @param newVar the new value of types
   */
  private void setTypes (ArrayList<BusinessRuleType> newVar) {
    types = newVar;
  }

  /**
   * Get the value of types
   * @return the value of types
   */
  private ArrayList<BusinessRuleType> getTypes () {
    return types;
  }

  //
  // Other methods
  //

}
