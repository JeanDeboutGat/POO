package pfc;
import  pfc.strategy.PaperStrategy;
import  pfc.strategy.HumanStrategy;
import  pfc.strategy.RandomStrategy;

import java.util.Scanner;
/**
* A class Main de PFC (Pierre, Feuille et Cisseaux)
* to launch the game
*
* @author Jean Debout Gatari
* @version 1.0
*/
public class MainPFC{

public static void main(String[] args){
  //first test, ==2
  /**Shape a= Shape.PAPER;
  Shape b= Shape.ROCK;
  System.out.println(a.toCompare(b));*/
  //second test==1
/**  Shape a= Shape.PAPER;
  Shape b= Shape.PAPER;
  System.out.println(a.toCompare(b));
*/
  //THIRD test==0
  //
  /**Shape a= Shape.PAPER;
  Shape b= Shape.SCISSOR;
  System.out.println(a.toCompare(b));

*/
/*HumanStrategy human= new HumanStrategy();
System.out.println( Shape.PAPER==human.getShape());*/

//initialising Strategy instance
RandomStrategy robotStrat= new RandomStrategy();
HumanStrategy  humanStrat=new HumanStrategy();
//choosing a name
Scanner scan = new Scanner(System.in);
System.out.println("\nchoose the name to be called in the game!!!!!!!!!");
String name =scan.next();
//initialising players instance
Player robotPlayer= new Player("Robot",robotStrat);
Player humanPlayer=new Player(name,humanStrat);

//number of rounds to playe
int nbRounds=4;
//initialising game

Game theGame= new Game(robotPlayer,humanPlayer,nbRounds);

//launching theGame

theGame.play(nbRounds);

}

}
