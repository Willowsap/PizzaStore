package pizza;

/**
 * A Chicago Style Meat Pizza.
 * 
 * @author Willow Sapphire
 * @version 06/12/2024
 */
public class ChicagoMeatPizza extends Pizza
{
    /**
     * Creates a Chicago Style Meat Pizza.
     * Imagine that the ingredients being passed were
     * actually created in the factory, which is why they need
     * to be parameters.
     * 
     * @param dough the dough being used.
     * @param sauce the sauce being used.
     * @param cheese the cheese being used.
     * @param meat the meat being used.
     */
    public ChicagoMeatPizza(Dough dough, Sauce sauce, Cheese cheese, Meat meat)
    {
        super(dough, sauce, cheese);
        this.addTopping(meat);
    }
}
