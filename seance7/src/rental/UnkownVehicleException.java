package rental;

public class UnknownVehicleException extends Exception{

    public UnknownVehicleException() {
        super();
    }

    public UnknownVehicleException(String message){
        super(message);
    }
}
