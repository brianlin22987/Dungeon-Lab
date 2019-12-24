public class Sword extends Item{
  
  private final static int atk = 15 , def = 0;
  public Sword(){
    super("Sword", atk, def);
  }

  public String toString(){
    return "This is a sword with atk 15.";
  }
}