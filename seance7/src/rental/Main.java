package rental;
import rental.*;

public class Main{
    public static void main(String[] args){

        //instanciation
        SuspiciousRentalAgency agency = new SuspiciousRentalAgency();
        Vehicle vehicule = new Vehicle("Toyota","Carina", 2016, 10000);
        MotorBike moto = new MotorBike("Yamaha","scooter",2010,124,50);
        Car voiture = new Car("Renault","Clio",2012,450,5);

        agency.addVehicle(vehicule);
        agency.addVehicle(moto);
        agency.addVehicle(voiture);

        Client client1 = new Client("Client 1", 21);
        Client client2 = new Client("Client 2", 45);

        System.out.println("");
        //affichage
        System.out.println("Vehicle info: " + vehicule.toString());
        System.out.println("Moto info: " + moto.toString());
        System.out.println("Car info: " + voiture.toString());
        System.out.println("Brand and Model of the car is: " + voiture.getBrand()+" " + voiture.getModel());
        System.out.println("Daily rental price : " + voiture.getDailyPrice());
        System.out.println("\n");

        System.out.println("Client :");
        System.out.println(" name : " + client1.getName() + ", " + client1.getAge()+ " years old");
        System.out.println(" name : " + client2.getName() + ", " + client2.getAge()+ " years old \n");

        try {
            System.out.println(client2.getName()+" rented a car at: " + agency.rentVehicle(client2,voiture));
            agency.returnVehicle(client2);
            System.out.println(client2.getName()+" returned the car \n");

            System.out.println(client1.getName()+" rented a car at: " + agency.rentVehicle(client1,voiture));
            agency.returnVehicle(client1);
            System.out.println(client1.getName()+" returned the car \n");
        }
        catch(IllegalStateException e){
            System.out.println("Voiture deja loué");
        }
        catch(UnknownVehicleException e1){
            System.out.println("Voiture non présente");
        }
    }
}
