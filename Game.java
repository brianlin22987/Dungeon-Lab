/**
* The class game describes the function of rooms and characters
* @author Phil 
* @author Brian
* @date 12/4/2019
*/
public class Game{
  private Item i;
  private String id, description;

  private Item[] inventory = new Item[6]; 

/**
* Constructor to create the game object
* @param id the id of characters
* @author Phil
* @author Brian
*/
  public Game(String id){
    for(int i=0;i<inventory.length;i++){
      inventory[i]=new Item("None",0,0);
    }
    this.id=id;
  }
/**
* A method that gives id to a room
* @param id the Id
* @param description the description
*/
  public Game(String id, String description){
    this.i = new Item("None",0,0);
    this.id = id;
    this.description = description;
  }

/**
* A method that allows game object to pick up an item
* @param item The item that the game object wants to pick up
* @author Phil
* @author Brian
*/
  public void pickItem(Item i1){
    for(int i = 0; i < inventory.length; i++){
      if(inventory[i].getItemName().equals("None")){
        inventory[i] = i1;
        break;
      }
    }
  }

/**
* A method that allows game object to drop Item
* @param Item The item the game object wants to drop
* @author Phil
* @author Brian
*/
  public void dropItem(Item i2){
    for(int i = 0; i < inventory.length; i++){
      if(inventory[i].equals(i2)){
        inventory[i]=null;
        break;
      }
    }
  }

/**
* A method that calls in the array of items
* @return Returns the array of items
* @author Phil
* @author Brian
*/
  public String callItem(){
    String temp = "";
    for(int i=1;i<inventory.length-1;i++){
      temp += inventory[i-1].getItemName() + ", ";
    }
    return "Inventory: " + temp + inventory[5].getItemName();
  }

/**
* A method that returns the inventory
* @param order The order of the inventory
* @return Returns the order of the inventory
* @author Phil
* @author Brian
*/
  public Item getItem(int order){
    return inventory[order];
  }
  
/**
* A method that gets the id
* @return id Returns the id
* @author Phil
* @author Brian
*/
  public String getID(){
    return id;
  }

}