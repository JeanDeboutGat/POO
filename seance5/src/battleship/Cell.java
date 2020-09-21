package battleship;
/**
*A cell objects will be presenting ll the cases of the sea(plateau)
*which allow the cell to contain a ship and do some manipulations on
*the ship and on cases
*
* @author Jean Debout Gatari
* @version 1.0
*/

 public class Cell{

  private boolean hitted;
  private Ship theShip;

  /**
  * Cell constructing object
  */
  public Cell(){

    this.theShip=null;
    this.hitted= false;

  }
  /** set ship on the board cell
  * @param ship
  */
 public void setShip(Ship ship){
   this.theShip=ship;
 }

 /** return ship on the board cell
 * @return  ship on the cell
 */

 public Ship getShip(Ship ship){
   return this.theShip;
 }

 /** return the cell state after the attack
 * @return  answer of the attack
 */

 public Answer shot(){
    Answer res;
    if (this.isEmpty()||this.hasBeenShot()){
      res=Answer.MISSED;
    }
    else{
      this.hitted=true;
      res=Answer.HIT;

    }
    return res;
 }


/** return the cell state
* @return  true if it has been shot and the opposite if not
*/
 public boolean hasBeenShot(){
   return this.hitted==true;
 }

 /** determines whether the cell is occupied or not
 * @return  true it is not occupied, false for the opposite
 */
  public boolean isEmpty(){
    return this.theShip==null;
  }

  /**get a character representing the cell(case)
  * @return the character representing the cell
  **/
  public char getCharacter(boolean defender){
      char res;
      if (this.isEmpty()){
        res='~';
      }
      else if(!this.hasBeenShot()){
         res=(defender)?'B':'.';
      }
      else{
        res='*';
      }

      return res;
  }


}
