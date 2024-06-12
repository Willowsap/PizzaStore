package pizza;

/**
 * A Chicago Style Cheese Pizza.
 * 
 * @author Willow Sapphire
 * @version 06/12/2024
 */
public class ChicagoCheesePizza extends Pizza
{
    /**
     * Creates a Chicago Style Cheese Pizza.
     * Imagine that the ingredients being passed were
     * actually created in the factory, which is why they need
     * to be parameters.
     * 
     * @param dough the dough being used.
     * @param sauce the sauce being used.
     * @param cheese the cheese being used.
     */
    public ChicagoCheesePizza(Dough dough, Sauce sauce, Cheese cheese)
    {
        super(dough, sauce, cheese);
    }
}
