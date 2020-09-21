package rental;

public class Car extends Vehicle{
    private int passangers;

    public Car (String brand, String model, int productionYear, float dailyRentalPRice, int passangers){
        super(brand, model, productionYear, dailyRentalPRice);
        this.passangers = passangers;
    }

    public int getPassangers(){
        return this.passangers;
    }

    public String toString(){
        return super.toString()+" "+String.valueOf(this.passangers);
    }
}
