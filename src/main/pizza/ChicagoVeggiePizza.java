package pizza;

/**
 * A Chicago Style Veggie Pizza.
 * 
 * @author Willow Sapphire
 * @version 06/12/2024
 */
public class ChicagoVeggiePizza extends Pizza
{
    /**
     * Creates a Chicago Style Veggie Pizza.
     * Imagine that the ingredients being passed were
     * actually created in the factory, which is why they need
     * to be parameters.
     * 
     * @param dough the dough being used.
     * @param sauce the sauce being used.
     * @param cheese the cheese being used.
     * @param veggie the veggie being used.
     */
    public ChicagoVeggiePizza(Dough dough, Sauce sauce, Cheese cheese, Veggie veggie)
    {
        super(dough, sauce, cheese);
        this.addTopping(veggie);
    }
}
