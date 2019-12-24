/**
* A class that describes item properties
* @author Phil 
* @author Brian
* @date 12/4/2019
*/
public class Item {
  private String name;
  private int atk,def;


/**
* A constructor that makes the Item object
* @param name Item name
* @param atk Item damage
* @param def Item defense
* @author Phil
* @author Brian
*/
  public Item(String name,int atk,int def){
    this.atk=atk;
    this.def=def;
    this.name=name;
  }

  public Item(){
    this.name="key";
  }

/**
* A method that identifies the key
* @param name Name of the key
* @author Phil
* @author Brian
*/
  public void isKey(String name){
    if(name.equals("key")){
      // door = open
    }
  }

/**
* A method that returns the attack the item does
* @return Returns the attack
* @author Phil
* @author Brian
*/
  public int getItemAttack(){
    return atk;
  }

/**
* A method that returns the defense
* @return defense Returns the defense
* @author Phil
* @author Brian
*/
  public int getItemDefense(){
    return def;
  }

/**
* A method that returns the name
* @return name Returns the name
* @author Phil
* @author Brian
*/
  public String getItemName(){
    return name;
  }

}