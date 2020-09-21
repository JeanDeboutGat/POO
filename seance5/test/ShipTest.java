import org.junit.*;
import static  org.junit.Assert.*;

//import Ship;
public class ShipTest{

  @Test
  public void hittedTest(){
    Ship ship1=new Ship(2);
    ship1.hitted();
    assertSame(1,ship1.getLifePoints());

  }
  @Test
  public void hasBeenSunkedTest(){
    Ship ship2=new Ship(1);
    ship2.hitted();
    assertTrue(ship2.hasBeenSunked());

  }
  public static junit.framework.Test suite() {
          return new junit.framework.JUnit4TestAdapter(ShipTest.class);
      }


}
