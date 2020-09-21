package battleship;
import battleship.util.Position;
/**
*A board class to represent the battleship
*
* @author Jean Debout Gatari
* @version 1.0
*/
//import Cell;
//import Answer;
public class Sea{

  private int width;
  private int height;
  public Cell [][] theCells;

  public Sea (int width,int height){
    this.width=width;
    this.height=height;
    this.theCells=new Cell[height][width];

    for (int lig=0;lig<this.height;lig++){
      for (int col =0; col<this.width;col++){
        this.theCells[lig][col]=new Cell();
      }
    }
  }
  public int getWidth(){
    return this.width;
  }
  public int getHeight(){
    return this.height;
  }
  /**shoot on a board cell by the ennemy
  * @return An answer when the ennemy succeed the shot
  * otherwise the ArrayIndexOutOfBoundException is raised
  */
  public Answer shoot(Position pos){
    int x=pos.getX();
    int y=pos.getY();
    if (x>this.width  || x<0 || y>this.height|| y<0){
      throw new ArrayIndexOutOfBoundsException("the position provided  is not validate\n");
      }
    return this.theCells[y][x].shot();
  }
/**display the board line by line and cell by cell ,
* the display vhangesfor the defender or the opponent, defined
*by the <code>defender </code >argument
* @param defender <code>true</code > if display is for defender
*<code>false </code > if for opponent
*/
 public void display(boolean defender){
     String res="";
     for (int lig=0;lig<this.height;lig++){
       for (int col =0; col<this.width;col++){
         res+=this.theCells[lig][col].getCharacter(defender);
       }
       System.out.println(res);
       res="";
     }
}



/**add the ship b vertically down  from position p. the number of
* cells is determined bye the ship length
* @param shipToPlace the ship to add
* @param position the position of the first (top) cell occupied by the ship

*/
  public void addShipVertically(Ship shipToPlace,Position pos){
    int posX=pos.getX();
    int posY=pos.getY();
     int   cLen=shipToPlace.getLifePoints();
   //verifying errors
    for (int i=0 ; i<cLen;i++){
      if (!this.theCells[posY+i][posX].isEmpty()){
        throw new IllegalAccessError("The Cell to access is occupied by another ship!!!!!!");
      }
      if (posY+i>this.height){
        throw new ArrayIndexOutOfBoundsException("The coordinate out of range...\n");
        }
    }
   //placing ship in case of non errors
    for (int i=0 ; i<cLen;i++){
      this.theCells[posY+i][posX].setShip(shipToPlace);
    }

  }


  /**add the ship b horiontaly right  from position p. the number of
  * cells is determined bye the ship length
  * @param shipToPlace the ship to add
  * @param position the position of the first (top) cell occupied by the ship

  */
    public void addShipHorizontally(Ship shipToPlace,Position pos){
      int posX=pos.getX();
      int posY=pos.getY();
      int cLen=shipToPlace.getLifePoints();
     //verifying errors
      for (int i=0 ; i<cLen;i++){
        if (!this.theCells[posY][posX+i].isEmpty()){
          throw new IllegalAccessError("The Cell to access is occupied by another ship!!!!!!");
        }
        if (posX+i>this.width){
          throw new ArrayIndexOutOfBoundsException("The coordinate is out of range...\n");
          }
      }
     //placing ship in case of non errors
      for (int i=0 ; i<cLen;i++){
        this.theCells[posX+i][posY].setShip(shipToPlace);
      }

    }

    /**return all the lifePoints of the ships in the sea
    * @param sea the sea which contains ships
    * @return lifePoints return all the lifePoints of the ships in the sea
    */
      public int RemainingLP(){

        int res=0;
        for (int lig=0;lig<this.height;lig++){
          for (int col =0; col<this.width;col++){
            if (!(this.theCells[lig][col].isEmpty()||this.theCells[lig][col].hasBeenShot()))
              res+=1;
            }
          }

        return res;
        }



 }
