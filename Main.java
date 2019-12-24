/**
Please can one of you multiplay your repl

@author Phil
@author Brian
*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Character main = new Character("123",15,100,5,"Main char");
    Enemy e = new Enemy("Dragon", 12, 8, 6, "Monster");
    Room mainroom = new Room(7,7,"Start room","The starting room");
    Room r1 = new Room(7,7,"Room 1","The room with potion.");
    Room r2 = new Room(6,8,"Room 2","The room with sword.");
    Room r3 = new Room(5,5,"Room 3","The room with shield.");
    Room bossroom = new Room(10,10,"Boss room","The room with boss.");

    
    /*System.out.println(e);
    System.out.println(main);
    if (main.attack(e))
    {
      System.out.println("e is dead");
      e = null;
    }
    System.out.println(e);
    System.out.println(main);
    */

    System.out.println("Welcome to the dungeon\nYou move, you attack, you find things!\n-----\ncommands in the commands.txt file\n-----");
    Item key = new Item();
    
    mainroom.setChar(main,3,2);
    main.pickItem(key);
    
    
    while(true){
      String input = sc.nextLine();
      if(input.equals("n")||input.equals("s")||input.equals("w")||input.equals("e")){
        mainroom.move(input);
        System.out.println(mainroom);
      }

      else if(input.equals("u key")){
        for(int i=0;i<6;i++){
          if(main.getItem(i).equals(key)){
            mainroom.openDoor();
            System.out.println("The door is open.");
          }
        }
      }

      /*else if(input.equals("t sword")){

      }*/
    }
    
    

  }
}