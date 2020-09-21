/**
*A class to design BikeStation that will holds Bikes and
*manipulates their arrangemesnts
*
*@author Jean Debout Gatari
*/


public class BikeStation {
    /** the Bikestation free slots  */
		private Bike [] freeSlots;

    private int stationCapacity;
		private String stationName;

    /**
     * create BikeStation with it's name and location capacity
		 * @param name this station's name
		 *@param capacity this station's location capacity
     */
	public BikeStation(String name, int capacity) {
	     this.stationName=name;
			 this.stationCapacity=capacity;
			 this.freeSlots=new Bike [capacity];

	}

    /**
     * return the name of this station
		 * @return the name of this station
     */
	public String getName() {
		return this.stationName;
	}

    /**
     * return the Capacity of this station
		 * @return the Capacity of this station
     */
	public int getCapacity() {

		return this.stationCapacity;
	}

    /**
     * return the number of Bikes set in this station
		 * @return current number of Bikes set in this station
     */
	public int getNumberOfBikes() {
	    int res=0;

			for (Bike bike:this.freeSlots){
				if (bike!=null){
					res+=1;
				}
			}

			return res;

 }
    /**
     * return the lowest free slot of the bike station
		 * @return the lowest  Free Slot in the bike station
     */
	public int firstFreeSlot() {
	    int count=0;
			for (Bike bike:this.freeSlots){
				if (bike==null){
					return count;
				}
			count+=1;
		   }
		return -1;
	}

    /**
     * Placing the bike after checking if there is free space
		 * @param bike to be placed
		 * @return True if it's placed or False if not
     */
	public boolean dropBike(Bike bike) {
		  int slot=firstFreeSlot();
	    if (slot!=-1){
				this.freeSlots[slot]=bike;
				return true;
			}
	    return false;
	}



    /**
     * take a bike from bikestation
		 * @param index of the bike in BikeStation
		 * @return the bike took if there is one,otherwise null
     */
	public Bike takeBike(int i) {
	    if (i>=0 && i<this.getCapacity() && this.freeSlots[i]!=null ){
			  Bike bike= this.freeSlots[i];
				this.freeSlots[i]=null;
				return  bike;
			}
	    return null;
	}




}
