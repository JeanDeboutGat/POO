package pfc.strategy;
import pfc.Shape;
import java.util.Random;
import java.util.ArrayList;
/**
* A class to implement interface Strategy functions
* with the random strategy output
*
* @author Jean Debout Gatari
* @version 1.0
*/
public class RandomStrategy implements Strategy{
  //declaration of liste of shapes
  private ArrayList<Shape> shapes=new ArrayList<Shape>(3);

  public RandomStrategy(){
    this.shapes.add(Shape.ROCK);
    this.shapes.add(Shape.SCISSOR);
    this.shapes.add(Shape.PAPER);

  }
  //initialisation of lists of shapes


  public int randomStrat(){
    int shapesLength=this.shapes.size();
    //random instance
    Random rand=new Random();
    int index= rand.nextInt(shapesLength);
    return index;
  }

  public Shape getShape(){
      int index= this.randomStrat();
      return this.shapes.get(index);
  }

}
