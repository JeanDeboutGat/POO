package battleship;
import battleship.util.Position;
/**
*A Game class to enable opponent play  to the game
*
* @author Jean Debout Gatari
* @version 1.0
*/
import java.util.Scanner;
//import java.io.Input;
public class Game{
  private Sea board;

  public Game(Sea board){
    this.board=board;

  }

  public void play(){
    //quit value initialisation
    boolean quit=false;
    //create a keyboard  input scanner
    Scanner scanner= new Scanner(System.in);

    while (!(this.board.RemainingLP()==0 || quit)){
      //call of the board display
      this.board.display(false);
      //demand of inputs
      System.out.println("please provide the cell to shoot; X and Y position:");
      System.out.print("X position:");
      int xPos=scanner.nextInt();
      System.out.print("Y position:");
      int yPos=scanner.nextInt();
      // creation of position to shoot
      Position pos= new Position(xPos,yPos);

      //Shoot the position cell in the Sea

      Answer afterShot= this.board.shoot(pos);
      //display board after the shoot
      this.board.display(false);

      System.out.print("\n the ship is ");
      System.out.println(afterShot.toString());
      //ask the user their option , to continue or quit
      System.out.println("\nDo you want to continue the game? yes or no");
      String option=scanner.nextLine();

      while (!(option.equals(new String("no"))||option.equals(new String("yes")))){
        System.out.print("\nInput error, please verify your input!!!!!\nDo you want to continue the game? yes or no: ");
        option=scanner.nextLine();
      }
      if (option.equals(new String("no"))){
        quit=true;
      }

    }

  }


}
