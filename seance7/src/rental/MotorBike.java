package rental;

public class MotorBike extends Vehicle{
    private int cylindree;

    public MotorBike(String brand, String model, int productionYear, float dailyRentalPRice, int cylindree){
        super(brand, model, productionYear, dailyRentalPRice);
        this.cylindree = cylindree;
    }

    public int getCylindree(){
        return this.cylindree;
    }

    public String toString(){
        return super.toString()+" "+String.valueOf(this.cylindree);
    }

}
