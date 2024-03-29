/**
 * A class to design bike that can be rent in a bike station.
 * Bikes have a unique id.
 *
 * @author JC
 *
 */
public class Bike {

	/** the rental price for every Bike */
	public static int locationPrice =10;

	private String id;
	private BikeModel model;

	/** create a Bike with given id and model
	 * @param id this bike's id
	 * @param model this bike's model
	 */
	public Bike(String id, BikeModel model) {
		this.id = id;
		this.model = model;
	}

	/** return this bike's id
	 * @return the id of this bike
	 */
	public String getId() {
		return this.id;
	}

	/** return the model of this bike
	 * @return the model of this bike
	 */
	public BikeModel getModel() {
		return this.model;
	}

	/** two bikes are equals if they have the same id
	 * @param o the object to test equality with
	 * @return <code>true</code> iff o is a bike with the same id than this object
	 */
	public boolean equals(Object o) {
		if (o instanceof Bike) {
			Bike other = (Bike) o;
			return this.id.equals(other.id);
		}
		else {
			return false;
		}
	}


	/**
	 * @return a string description of this bike
	 */
	public String toString() {
		return "bike id: "+this.id+", model : "+ this.model;
	}

	/**
	*main function for executing the program
	*
	*/

	public static void main(String[] args){

		Bike first= new Bike("b001",BikeModel.CLASSICAL);
		Bike second= new Bike("b002",BikeModel.ELECTRIC);
    //testing the equality of two bikes
		if (first.equals(second)){
		  System.out.println("Bikes are the same");}
		else{
			System.out.println("Bikes are not the same");


		}
    //print out first bike description
    System.out.println(first.toString()+", locationPrice: "+Bike.locationPrice );
	}
}
