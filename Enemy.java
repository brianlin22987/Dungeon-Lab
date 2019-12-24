/**
* The class Character describes the function a character does
* @author Phil
* @author Brian
* @date 12/5/2019
*/
public class Enemy extends Character{

/**
* A constructor that sets up the enemy
* @param name Name of the enemy
* @param attack Attack of the enemy
* @param health Health of the enemy
* @param defense Defense of the enemy
* @author Phil
* @author Brian
*/
  public Enemy(String name, int attack, int health, int defense, String id){
    super(name, attack, health, defense, id);
  }

/**
* A method that returns the type of the enemy and its properties
* @ return Returns the type of the enemy and its properties
* @author Phil
* @author Brian
*/
  public String toString(){
    return "Enemy " + super.toString();
  }


  
}