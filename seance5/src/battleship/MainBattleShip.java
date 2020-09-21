package battleship;
import battleship.util.Position;
/**
*A main battleShip class for starting the game by initialising and
* manipulating it
*
* @author Jean Debout Gatari
* @version 1.0
*/
public class MainBattleShip{
  /*A main battlefield class for initialising and
  * manipulating game
  */
  public static void main(String[] args){

    //creation of the sea
    Sea theSea = new Sea (10,15);
    //creation of the ships
    Ship ship1= new Ship(3);
    Ship ship2= new Ship(1);
    Ship ship3= new Ship(4);
    Ship ship4= new Ship(3);
    //creation of positions
    Position pos1= new Position(0,0);
    Position pos2= new Position(5,9);
    Position pos3= new Position(5,0);
    Position pos4= new Position(9,11);
    //placements of the ships in the sea
    theSea.addShipHorizontally(ship1,pos1);
    theSea.addShipHorizontally(ship2,pos2);
    theSea.addShipHorizontally(ship3,pos3);
    theSea.addShipVertically(ship4,pos4);
    //creation of the Game objects
    Game game=new Game(theSea);
    game.play();


  }
}
