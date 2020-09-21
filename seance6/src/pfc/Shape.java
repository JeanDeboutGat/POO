package pfc;
/**
* A class Player to create player instance
* and manipulate Player actions
*
* @author Jean Debout Gatari
* @version 1.0
*/

public enum Shape{
  PAPER,SCISSOR,ROCK;
  /**
  * method to compare Shape
  * @param Shape;
  *@return number; 
  */
  public int toCompare(Shape other){
    int res=0;
    if (this.ordinal()==other.ordinal()){
      res=1;
    }
    else{
      if ( (this.ordinal()-other.ordinal())==1 ||(this.ordinal()-other.ordinal())==-2 ){
         res=2;
        }
      else{
        res=0;
      }
    }
    return res;
  }
}
