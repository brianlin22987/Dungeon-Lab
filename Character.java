/**
* The class Character describes the function a character does
* @author Phil 
* @author Brian
* @date 12/5/2019
*/
public class Character extends Game{
  private String name;
  private int attack, health, defense;

/**
* A constructor that sets up the character
* @param name Name of the character
* @param attack Attack the character does
* @param health Health of the character
* @param defense Defense of the character
* @author Phil 
* @author Brian
*/
  public Character(String name, int attack, int health, int defense, String id){
    super(id);
    this.name=name;
    this.health=health;
    this.attack=attack;
    this.defense=defense;
  }
/**
* A method that calls the character's name
* @return Returns the character's name
* @author Phil 
* @author Brian
*/
  public String getCharName(){
    return name;
  }

/**
* A method that sets the name of the character
* @param name Name of the character
* @author Phil 
* @author Brian
*/
  public void setCharName(String name){
    this.name=name;
  }

/**
* A method that calls the character's attack
* @return Returns the character's attack
* @author Phil 
* @author Brian
*/
  public int getCharAttack(){
    return attack;
  }
  
/**
* A method that sets the attack
* @param attack The attack of the character
* @author Phil 
* @author Brian
*/
  public void setAttack(int attack){
    this.attack=attack;
  }

/**
* A method that calls the character's health
* @return Returns the character's health
* @author Phil 
* @author Brian
*/
  public int getCharHealth(){
    return health;
  }

/**
* A method that sets the health of the character
* @param health Health of the character
* @author Phil 
* @author Brian
*/
  public void setCharHealth(int health){
    this.health=health;
  }

/**
* A method that calls the character's defense
* @return Returns the character's defense
* @author Phil 
* @author Brian
*/
  public int getCharDefense(){
    return defense;
  }

/**
* A method that sets the defense of the character
* @ param defense Defense of the character
* @author Phil 
* @author Brian
*/
  public void setCharDefense(int defense){
    this.defense = defense;
  }

/**
* A method that attacks an enemy with weapon
* @param bad The enemy
* @param weapon The weapon the character has
* @author Phil 
* @author Brian
*/
  public void attack(Character bad, Item weapon){
    bad.setCharHealth(bad.getCharHealth()-weapon.getItemAttack()+bad.getCharDefense());
    if(bad.getCharHealth()<1){
      bad = null;
    }
  }

/**
* A method that attacks an enemy
* @param bad Enemy character
* @return true Returns if the enemy is dead
* @author Phil 
* @author Brian
*/
  public boolean attack(Character bad){
    bad.setCharHealth(bad.getCharHealth()-getCharAttack()+bad.getCharDefense());
    if(bad.getCharHealth()<1){
      return true;
    }
    return false;
  }

/**
A method that returns the character's attack, health, and defense
* @return return the character's attack, health, and defense
* @author Phil
* @author Brian
*/
  public String toString(){
    return "Type" + super.getID() + "\nName: " + name + "\nATK: " + attack + "\nHP: " + health + "\nDEF: " + defense;
  }

  
}