package pfc.strategy;
import pfc.Shape;
import java.util.ArrayList;
import java.util.Scanner;

/**
* A class to implement interface Strategy functions
* with the HUman choice strategy output
*
* @author Jean Debout Gatari
* @version 1.0
*/
public class HumanStrategy implements Strategy{
  //declaration of liste of shapes

  public Shape getShape(){
      //initialising shape
      Shape choosen= Shape.PAPER;
      //scan shape
      Scanner scan = new Scanner(System.in);
      System.out.println("\nYour turn, please choose the Shape to play : ex:PAPER");
      try{
         choosen=Shape.valueOf(scan.next());

      }
      catch(Exception e){
        System.out.println("Wrong input,verify input cases");
        this.getShape();
      }
      return choosen;
  }


}
