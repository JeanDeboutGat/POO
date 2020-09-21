import org.junit.*;
import static  org.junit.Assert.*;

//import Sea;
//import Position;
public class SeaTest{

  @Test
  public void shootTest(){

    Sea atlantic= new Sea(14,20);
    Position pos= new Position(13,19);

    assertTrue(atlantic.theCells[19][13].isEmpty());
    assertSame(Answer.MISSED, atlantic.shoot(pos));


  }

  @Test (expected=ArrayIndexOutOfBoundsException.class)
  public void shootTestException(){

    Sea atlantic= new Sea(14,20);
    Position pos= new Position(14,2);
     atlantic.shoot(pos);
   }

   @Test
   public void shootTestException(){

     Sea atlantic= new Sea(14,20);
     Position pos= new Position(14,2);
      atlantic.shoot(pos);
    }

  public static junit.framework.Test suite() {
          return new junit.framework.JUnit4TestAdapter(SeaTest.class);
      }


  }
