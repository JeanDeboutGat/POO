package battleship.util;

/**
*A class Position which determines the coordinations
*in the Board ship
*
* @author Jean Debout Gatari
* @version 1.0
*/

public class Position{

  private int x;
  private int y;

  public Position(int x, int y){
    this.x=x;
    this.y=y;
  }
  public int getX(){
    return this.x;
  }
  public int getY(){
    return this.y;
  }

  public boolean equal(Object o){

    if (o instanceof Position){
      Position pos=(Position) o;
      return this.x==pos.x &&this.y==pos.y;
    }
    return false;
  }
  public String toString() {
		return "the x coordinat of the cell is "+this.x + "and the y is " + this.y;
	}
}
