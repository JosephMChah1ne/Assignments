
public class data 
{
    private String name;
    private String item;
    private double paid;
    
    
    public void data () {}
    
    public data (String n, String it, double p)
    {
        name = n;
        item = it;
        paid = p;
    }
    
    public String toString () 
    {
        return name + " " + item + " $" + paid ;
    }
    
}
