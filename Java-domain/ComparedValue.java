
import java.util.*;


/**
 * Class ComparedValue
 */
public class ComparedValue {

  //
  // Fields
  //

  private String value;
  private ArrayList<Attribute> appliesToAttribute;
  
  //
  // Constructors
  //
  public ComparedValue () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of value
   * @param newVar the new value of value
   */
  private void setValue (String newVar) {
    value = newVar;
  }

  /**
   * Get the value of value
   * @return the value of value
   */
  private String getValue () {
    return value;
  }

  /**
   * Set the value of appliesToAttribute
   * @param newVar the new value of appliesToAttribute
   */
  private void setAppliesToAttribute (ArrayList<Attribute> newVar) {
    appliesToAttribute = newVar;
  }

  /**
   * Get the value of appliesToAttribute
   * @return the value of appliesToAttribute
   */
  private ArrayList<Attribute> getAppliesToAttribute () {
    return appliesToAttribute;
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
   * @return       boolean
   * @param        theAttribute
   */
  public boolean removeAttribute(Attribute theAttribute)
  {
  }


}
