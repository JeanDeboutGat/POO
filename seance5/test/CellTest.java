import org.junit.*;
import static  org.junit.Assert.*;

//import Cell;
//import Ship;
//import Answer;

public class CellTest{

  @Test
  public void hasBeenShotTest(){
    Cell c=new Cell();
    assertFalse(c.hasBeenShot());

    Ship ship1=new Ship(2);
    c.setShip(ship1);
    c.shot();
    assertTrue(c.hasBeenShot());
  }

  @Test
  public void shotTest(){
    Cell c=new Cell();
    assertSame(Answer.MISSED,c.shot());

    Ship ship1=new Ship(2);
    c.setShip(ship1);
    assertSame(Answer.HIT,c.shot());

  }
  @Test
  public void constructorTest(){
    Cell c=new Cell();
    assertTrue(c.isEmpty());
  }


  public static junit.framework.Test suite() {
          return new junit.framework.JUnit4TestAdapter(CellTest.class);
      }


}
