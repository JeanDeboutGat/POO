package pfc;
import pfc.strategy.Strategy;
/**
* A class Player to create player instance
* and manipulate Player actions
*
* @author Jean Debout Gatari
* @version 1.0
*/

public class Player{

  private String name;
  private Strategy strat;
  private int nbPoints;
  /*
  * Player class instance creation
  *
  */
  public Player(String name,Strategy strat){
    this.name=name;
    this.strat=strat;
    this.nbPoints=0;

  }
  /** return name of player
  * @return  name of player
  */

  public String getName(){
   return this.name;
  }
  /** return points of player
  * @return  return points of player
   */

  public int getPoints(){
    return this.nbPoints;
  }

  /**add poiints of player
  * @param points
   */
   public void addPoints(int points){
    this.nbPoints+=points;
  }
  /**
  * return a player shape
  * @return a shape played by a player
  */
  public Shape play(){
    return this.strat.getShape();
  }
}
