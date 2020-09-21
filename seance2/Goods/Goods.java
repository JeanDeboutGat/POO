
/**
 * Write a description of class Goods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Goods
{
    // instance variables - replace the example below with your own
    private double value;
    private String name;
    

    /**
     * Constructor for objects of class Goods
     */
    public Goods()
    {
        // initialise instance variables
        this.value=0;
        
    }
    
     /**
     * Constructor for objects of class Goods with parameters
     * 
     * @param name parameter for name of Goods
     * 
     * @param value parameter for value of Goods
     */
    public Goods(String name,double value)
    {
        this.name=name;
        this.value=value;
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public int getter()
    {
        // put your code here
        return  this.value ;
    }

    public void  setter(int value)
    {
        // put your code here
        this.value =value;
    }
    
    
}
