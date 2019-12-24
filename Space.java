/**
* A class that describes the space in the room
* @author Phil 
* @author Brian
* @date 12/4/2019
*/
public class Space{
  private boolean haveDoor, haveWindow, canPass;
  private Character c;
  private Item store;

/**
* Constuctor to create a Room object
* @param haveDoor determines if the space has a door
* @param haveWindow determines if the space has a window
* @param haveChar determines if the space has a character
* @author Phil
* @author Brian
*/
  public Space(boolean canPass, boolean haveWindow, boolean haveDoor){
    this.canPass = canPass;
    this.haveWindow = haveWindow;
    this.haveDoor = haveDoor;
  }

/**
* A method that returns whether the character can pass the space
* @return Returns canPass
* @author Phil
* @author Brian
*/
  public boolean canPass(){
    return canPass;
  }

/**
* A method that stores an item
* @param store The item storing
* @author Phil
* @author Brian
*/
  public void placeItem(Item store){
    this.store = store;
  }
/**
* A method that determines if the space has a door
* @return Returns haveDoor
* @author Phil
* @author Brian
*/
  public boolean haveDoor(){
    return haveDoor;
  }

/**
* A method changes the accessability of a space
* @param b changes the canPass boolean
* @author Phil
* @author Brian
*/
  public void changeAccess(boolean b){
    canPass=b;
  }

/**
* A method that sets the character
* @param c The character
* @author Phil
* @author Brian
*/
  public void haveChar(Character c){
    this.c=c;
  }

/**
* A method that returns the character
* @return c Returns the character
* @author Phil
* @author Brian
*/
  public Character getChar(){
    return c;
  }
  

}