package battleship;
/**
*A ship constructing object
*
* @author Jean Debout Gatari
* @version 1.0
*/
public class Ship{

  private int lifePoints;

  public Ship(int lifePoints){
    this.lifePoints=lifePoints;

  }

  /** return ship lifePoints
  * @return lifePoints
  */
  public int  getLifePoints(){
    return this.lifePoints;
  }
  /** reduce lifePoints when is the ship is hitted
  */
  public void hitted(){

    this.lifePoints-=1;
  }
  /** reveal whether the ship has has Been Sunked after the end of
  * it's lifePoints or not
  * @return true iff this ship has been Sunked and not oppositely
  */
  public boolean hasBeenSunked(){
    return this.lifePoints==0;
  }

}
