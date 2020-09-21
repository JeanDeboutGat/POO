package pfc.strategy;
import pfc.Shape;
/**
* A class to implement interface Strategy functions
*
* @author Jean Debout Gatari
* @version 1.0
*/
public class RockStrategy implements Strategy{

  public Shape getShape(){
    return Shape.ROCK;
  }

}
