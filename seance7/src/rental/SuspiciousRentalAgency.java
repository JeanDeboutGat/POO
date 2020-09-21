package rental;
import rental.*;

public class SuspiciousRentalAgency extends RentalAgency{
    public SuspiciousRentalAgency(){
        super();
    } 

    public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException{
        if(client.getAge() < 25){
            return super.rentVehicle(client, v)+(v.getDailyPrice()/10);
        }else{
            return super.rentVehicle(client, v);
        }
    }
}
