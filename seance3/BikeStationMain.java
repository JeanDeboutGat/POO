/**
*A class to design  main function of BikeStation
*
*@author Jean Debout Gatari
*/
public class BikeStationMain{
  /**
  *main function for executing BikeStation instances
  * @param index of the bike in the Location Station
  */
  public static void main (String[] args){
    //creation of BikeStation instance
    BikeStation timo= new BikeStation("Timoleon",10);
    //creation of bike instances
    Bike b001= new Bike("b001",BikeModel.CLASSICAL);
    Bike b002= new Bike("b002",BikeModel.CLASSICAL);
    //Dropping two created bikes in the bike station
    timo.dropBike(b001);
    timo.dropBike(b002);

    //verification of empty argument
    if (args.length==0){
      System.out.println("No choice made, please enter the index of the bike");
      System.exit(0);
    }
    /**
    getting the bike which index's entered
    */

    //get back an index argument in int type
    int index= Integer.parseInt(args[0].trim());

    Bike bike=timo.takeBike(index);
    if (bike!=null){
      System.out.println(bike.toString());
    }
    else{
      System.out.println("No bike on place"+args[0]);
    }
  }
  }
