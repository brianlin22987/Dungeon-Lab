public class Shield extends Item{

  private final static int atk = 0 , def = 10;
  public Shield(){
    super("Shield", atk, def);
  }

  public String toString(){
    return "This is a shield with def 10.";
  }
}