package pizza;

/**
 * A Chicago Style Clam Pizza.
 * 
 * @author Willow Sapphire
 * @version 06/12/2024
 */
public class ChicagoClamPizza extends Pizza
{
    /**
     * Creates a Chicago Style Clam Pizza.
     * Imagine that the ingredients being passed were
     * actually created in the factory, which is why they need
     * to be parameters.
     * 
     * @param dough the dough being used.
     * @param sauce the sauce being used.
     * @param cheese the cheese being used.
     * @param clam the clam being used.
     */
    public ChicagoClamPizza(Dough dough, Sauce sauce, Cheese cheese, Clam clam)
    {
        super(dough, sauce, cheese);
        this.addTopping(clam);
    }
}
