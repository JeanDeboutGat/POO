package date;
import date.util.*;
/**
 * A dateMain  must be able to  produce various date infomation
 * as an executing helper
 *
 * @author jean Debout Gatari
 * @version 1.0
 */
public class DateMain{

  public static void main(String[] args) {

        System.out.println("beginning of main from date.Datemain");



       Month currentMonth=Month.february;
       Date currentDate= new Date(22,currentMonth,2020);
       System.out.println(currentDate.toString());

       //on what day tomorrow we will be on?
       Date nextDate=new Date(23,currentMonth,2020);

       System.out.println("\nTomorrow we will be on \t ");
       System.out.println(nextDate.toString());

       //future days counting

        Date DateAfter5Days=currentDate.nDaysLater(5);
        System.out.println("\nFrom now on 22th, in 5 days we will be on \t ");
        System.out.println( DateAfter5Days.toString()) ;

        //differenceInDays
        System.out.println("\nwhich means that the difference in those three days is  \t ");
        System.out.println(currentDate.differenceInDays(DateAfter5Days));

        //checking if it's equals
        if (DateAfter5Days.equals(currentDate)){
          System.out.println("\nAs we conclude  the dates are the same \t ");
        }
        else{
          System.out.println("\nAs we conclude  the dates are not the same \t ");
        }

    }



}
