package pfc.strategy;
import pfc.Shape;
/**
* A class to implement interface Strategy functions
* with  sequence defined strategy
*byNow we consider PAPER and ROCK
*
* @author Jean Debout Gatari
* @version 1.0
*/
public class SequenceStrategy implements Strategy{
  //declaration of liste of shapes
  private  Shape [] shapes=new Shape [2];
  private static int index=0;

  public SequenceStrategy(){
    this.shapes[0]=Shape.PAPER;
    this.shapes[1]=Shape.ROCK;
  }
  public Shape getShape(){
      int res=0;
      if(index/2==0){
        res=1;
      }
      index+=1;
      return shapes[res];

  }

}
