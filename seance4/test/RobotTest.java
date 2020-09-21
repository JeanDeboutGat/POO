import org.junit.*;
import static org.junit.Assert.*;


import example.Robot;

import example.util.Box;
import example.util.ConveyerBelt;


public class RobotTest{

  @Test
  public void testTake(){

    Robot myRobot= new Robot();

    Box myBox=new Box(5);
    myRobot.take(myBox);
    assertEquals(myBox,myRobot.getCarriedBox());

    Box secondBox= new Box(7);
    myRobot.take(secondBox);
    assertEquals(myBox,myRobot.getCarriedBox());
  }


  @Test
  public void testCarryBox(){

    Robot myRobot= new Robot();
    assertSame(false,myRobot.carryBox());
    Box myBox=new Box(5);
    myRobot.take(myBox);
    assertSame(true,myRobot.carryBox());

  }

  @Test
  public void testPutOn(){
    Robot myRobot= new Robot();
    ConveyerBelt belt= new ConveyerBelt(10);
    Box myBox=new Box(5);
    myRobot.take(myBox);

    if (belt.accept(myRobot.getCarriedBox())){
      myRobot.putOn(belt);
      assertFalse(myRobot.carryBox());
    }
    else{
      myRobot.putOn(belt);
      assertEquals(myBox,myRobot.getCarriedBox());

    }


  }

  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(RobotTest.class);
  }


}
