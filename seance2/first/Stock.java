
/**
 * Write a description of class Stock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stock
{
    // instance variables - replace the example below with your own
    private int quantity;
    
    /** returns this stock quantity
     * 
     * @return this Stock quantity
     * 
     */
    public int getQuantity()
    {
        return this.quantity;
    }
    
    public Stock(){
        this.quantity=0;
    }   
    
    public Stock(int quantity){
        this.quantity=quantity;
    }

    /** returns current stock quantity after addition
     * 
     * @return this Stock quantity
     * 
     *  @param quantity number to augment 
     */
    public void add(int n){
          this.quantity+=n;
    }
    
    public int  remove(int n){
        if (this.quantity >= n)
        { 
            this.quantity-=n;
            return (n);
        }
        else
        {
            this.quantity=0;
            return n-this.quantity;
        }
       
    }
    /**
     * @return a string representation for this Stock
     */
    public String toString(){
        return  "the stock of a quantity "+ this.quantity;
    }
    }
