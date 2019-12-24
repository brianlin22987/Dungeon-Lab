/**
* A class that describes space objects that cannot pass
* @author Phil 
* @author Brian
* @date 12/4/2019
*/
public class Wall extends Space{

/**
* A constructor that makes the wall object
* @param haveWindow If the room have window
* @author Phil
* @author Brian
*/
  public Wall(boolean haveWindow){
    super(false,haveWindow,false);
  }

  
}