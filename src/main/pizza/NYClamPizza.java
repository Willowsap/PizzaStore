package pizza;

/**
 * A New York Style Clam Pizza.
 * 
 * @author Willow Sapphire
 * @version 06/12/2024
 */
public class NYClamPizza extends Pizza
{
    /**
     * Creates a New York Style Clam Pizza.
     * Imagine that the ingredients being passed were
     * actually created in the factory, which is why they need
     * to be parameters.
     * 
     * @param dough the dough being used.
     * @param sauce the sauce being used.
     * @param cheese the cheese being used.
     * @param clam the clam being used.
     */
    public NYClamPizza(Dough dough, Sauce sauce, Cheese cheese, Clam clam)
    {
        super(dough, sauce, cheese);
        this.addTopping(clam);
    }
}
