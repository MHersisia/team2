
import java.util.*;


/**
 * Class Table
 */
public class Table {

  //
  // Fields
  //

  private String name;
  private ArrayList<Attribute> hasAttributes;
  
  //
  // Constructors
  //
  public Table () { };
  
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
   * Set the value of hasAttributes
   * @param newVar the new value of hasAttributes
   */
  private void setHasAttributes (ArrayList<Attribute> newVar) {
    hasAttributes = newVar;
  }

  /**
   * Get the value of hasAttributes
   * @return the value of hasAttributes
   */
  private ArrayList<Attribute> getHasAttributes () {
    return hasAttributes;
  }

  //
  // Other methods
  //

  /**
   * @return       boolean
   * @param        theAttribute
   */
  public boolean addAttribute(Attribute theAttribute)
  {
  }


  /**
   * @return       Boolean
   * @param        theAttribute
   */
  public Boolean removeAttribute(Attribute theAttribute)
  {
  }


}
