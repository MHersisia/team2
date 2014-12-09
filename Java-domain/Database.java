
import java.util.*;


/**
 * Class Database
 */
public class Database {

  //
  // Fields
  //

  private String type;
  private String name;
  private ArrayList<Table> hasTables;
  
  //
  // Constructors
  //
  public Database () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of type
   * @param newVar the new value of type
   */
  private void setType (String newVar) {
    type = newVar;
  }

  /**
   * Get the value of type
   * @return the value of type
   */
  private String getType () {
    return type;
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
   * Set the value of hasTables
   * @param newVar the new value of hasTables
   */
  private void setHasTables (ArrayList<Table> newVar) {
    hasTables = newVar;
  }

  /**
   * Get the value of hasTables
   * @return the value of hasTables
   */
  private ArrayList<Table> getHasTables () {
    return hasTables;
  }

  //
  // Other methods
  //

  /**
   * @return       boolean
   * @param        theTable
   */
  public boolean addTable(Table theTable)
  {
  }


  /**
   * @return       boolean
   * @param        theTable
   */
  public boolean removeTable(Table theTable)
  {
  }


}
