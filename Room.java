/**
* The class Room creates a Room with several spaces
* @author Phil 
* @author Brian
* @date 12/5/2019
*/
public class Room extends Game{
  private Space[][] space;
  private int x,y;
  private Character c;

/**
* A constructor that creates a room
* @param x the x dimension of the room
* @param y the y dimension of the room
* @author Phil
* @author Brian
*/
  public Room(int x, int y, String id, String description){
    super(id, description);
    space = new Space[x][y];
    for(int i=0;i<x;i++){
      for(int j=0;j<y;j++){
        space[i][j]=new Space(true,false,false);
      }
    }
    for(int i=0;i<y;i++){
      space[0][i] = new Wall(false);
      space[x-1][i] = new Wall(false);
    }
    for(int i =1; i < x-1; i++){
      space[i][0] = new Wall(false);
      space[i][y-1] = new Wall(false);
    } 
    space[x/2][0] = new Space(false,false,true);
    this.x=x-1;
    this.y=y-1;
  }

/**
* A method that sets the character's position
* @param c The character
* @param x X value of the array
* @param y Y value of the array
* @author Phil
* @author Brian
*/
  public void setChar(Character c, int x, int y){
    space[this.x][this.y] = new Space(true,false,false);
    space[x-1][y-1].haveChar(c);
    this.x=x-1;
    this.y=y-1;
    this.c=c;
  }

/**
* A method that sets the enemy
* @param e The enemy
* @param x the X value of the enemy
* @param y the Y value of the enemy
* @author Phil
* @author Brian

  public void setEnemy(Enemy e, int x, int y){
    space[this.x][this.y] = new Space(false,false,false);
    space[x-1][y-1].haveEnemy(e);
    this.x=x-1;
    this.y=y-1;
  }*/

/**
* A method that moves the character
* @param dir The direction the character is moving
* @author Phil
* @author Brian
*/
  public void move(String dir){

    if(dir.equals("n")){
      if(space[x][this.y+1].canPass() == true){
        this.y+=2;
        this.x+=1;
        setChar(c,x,y);
      }
      else if(space[x][this.y+1].haveDoor()==true){
        System.out.println("There is a door. You must have a key to access.");
      }
      else if(space[x][this.y+1].canPass() == false){
        System.out.println("There is a wall. You cannot pass.");
      }
    }

    if(dir.equals("s")){
      if(space[x][this.y-1].canPass() == true){
        this.x+=1;
        setChar(c,x,y);
      }
      else if(space[x][this.y-1].haveDoor()==true){
        System.out.println("There is a door. You must have a key to access.");
      }
      else if(space[x][this.y-1].canPass() == false){
        System.out.println("There is a wall. You cannot pass.");
      }
    }

    if(dir.equals("e")){
      if(space[this.x+1][y].canPass() == true){
        this.x+=2;
        this.y+=1;
        setChar(c,x,y);
      }
      else if(space[this.x+1][y].haveDoor()==true){
        System.out.println("There is a door. You must have a key to access.");
      }
      else if(space[this.x+1][y].canPass() == false){
        System.out.println("There is a wall. You cannot pass.");
      }
    }

    if(dir.equals("w")){
      if(space[this.x-1][y].canPass()==true){
        this.y+=1;
        setChar(c,x,y);
      }
      else if(space[this.x-1][y].haveDoor()==true){
        System.out.println("There is a door. You must have a key to access.");
      }
      else if(space[this.x-1][y].canPass() == false){
        System.out.println("There is a wall. You cannot pass.");
      }
    }
  }

/**
* A method that returns the character's coordinate
* @return toString return the character's coordinate
* @author Phil
* @author Brian
*/
  public String toString(){
    return c.getCharName() + " is at (" + x + "," + y + ") in " + super.getID();
  }

/**
* A method that returns the space
* @return space[x][y] Returns the space
* @author Phil
* @author Brian
*/
  public Space getSpace(){
    return space[x][y];
  }

/**
* A method that opens the door with a key
* @param key The item used to open the door
* @author Phil
* @author Brian
*/
  public void openDoor(){
    for(int i=x-1;i<x+2;i++){
      for(int j=y-1;j<y+2;j++){
        if(space[i][j].haveDoor()==true){
          space[i][j].changeAccess(true);
          break;
        }
      }
    }
  }

  

}