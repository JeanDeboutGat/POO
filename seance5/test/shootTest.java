import org.junit.*;
import static  org.junit.Assert;

import Sea;

public void hittedTest(){
  
  Ship ship1=new Ship(2);
  ship1.hitted();
  assertSame(1,ship1.getLifePoints());

}
public void hasBeenSunkedTest(){
  Ship ship1=new Ship(1);
  ship1.hitted();
  assertSame(0,ship1.hasBeenSunked());

}
public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(ShipTest.class);
    }
