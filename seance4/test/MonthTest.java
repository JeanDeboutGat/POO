
import org.junit.*;
import static org.junit.Assert.*;

import date.util.Month;

public class MonthTest{

  @Test
  public void testMonthExistence(){
    Month jan = Month.january;
   Month janNew=Month.valueOf("january");

    assertSame(true,jan.equals(janNew));

  }
  @Test
  public void testNbDays(){
    Month jan = Month.january;
    assertEquals(31,jan.nbDays(2020));
    Month feb = Month.february;
    assertEquals(29,jan.nbDays(2020));

    assertEquals(28,jan.nbDays(2021));

  }

  @Test
  public void testNext(){
    Month jan = Month.january;
    assertEquals(Month.february,jan.next());

    Month dec = Month.december;
    assertEquals(Month.january,dec.next());


  }



  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(DateTest.class);
  }
}
