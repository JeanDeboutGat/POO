import org.junit.*;
import static org.junit.Assert.*;

import date.util.Month;
import date.util.Date;


public class DateTest{

  @Test
  public void testDateCreation(){

    Date currentDate= new Date(1,Month.march,2010);
    assertNotNull(currentDate);
    assertSame(currentDate.getDay(),1);
    assertSame(currentDate.getMonth(),Month.march);
    assertSame(currentDate.getYear(),2010);
  }


  @Test
  public void testNDaysLater(){

   Date currentDate= new Date(1,Month.march,2010);


   assertEquals(currentDate.nDaysLater(5),new Date(6,Month.march,2020));
   assertEquals(currentDate.nDaysLater(31),new Date(6,Month.april,2020));
   assertEquals(currentDate.nDaysLater(365),new Date(1,Month.march,2020));

 }

 @Test (expected=IllegalArgumentException.class)
  public void testNDaysLaterExpt(){

  Date currentDate= new Date(1,Month.march,2010);
  currentDate.nDaysLater(-2);
 }


 @Test
 public void testDifferenceInDays(){

  Date currentDate= new Date(1,Month.march,2010);
  Date nextDate=new Date(6,Month.march,2020);

  assertEquals(5,currentDate.differenceInDays(nextDate));
}



  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(DateTest.class);
  }
}
