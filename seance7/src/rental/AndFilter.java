package rental;
import java.util.*;
import rental.*;
/**
 * An AndFilter performs the intersection of filters. It accepts a vehicle if each of its filter accepts it.
*/
public class  AndFilter implements VehicleFilter {

    private List<VehicleFilter> theFilters;

    /** creates an InterFilter with no filter */
    public AndFilter() {
		  this.theFilters = new ArrayList<VehicleFilter>();
    }

    /** adds a new filter
    * @param f the added filter
    */
    public void addFilter(VehicleFilter f) {
      this.theFilters.add(f);
    }

    /** Accept the vehicle if each of its filters accepts it
     * @see VehicleFilter#accept(Vehicle) */
    public boolean accept(Vehicle v) {
      boolean accepted = true;

      int i = 0;

      while(i<this.theFilters.size() && accepted){
        VehicleFilter filter = this.theFilters.get(i);
        if(filter.accept(v) == false){
          accepted = false;
        }
        i = i+1;
      }
      return accepted;
    }
}
