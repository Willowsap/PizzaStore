package pizza;

/**
 * The methods required by a pizza ingredient factory.
 * 
 * @author Willow Sapphire
 * @version 06/12/2024
 */
public interface PizzaIngredientFactory
{
    /**
     * Creates the dough for the pizza.
     * 
     * @return the dough for the pizza.
     */
    public Dough createDough();

    /**
     * Creates the sauce for the pizza.
     * 
     * @return the sauce for the pizza.
     */
    public Sauce createSauce();

    /**
     * Creates the cheese for the pizza.
     * 
     * @return the cheese for the pizza.
     */
    public Cheese createCheese();

    /**
     * Creates the clams for the pizza.
     * 
     * @return the clams for the pizza.
     */
    public Clam createClam();

    /**
     * Creates the meat for the pizza.
     * 
     * @return the meat for the pizza.
     */
    public Meat createMeat();

    /**
     * Creates the veggies for the pizza.
     * 
     * @return the veggies for the pizza.
     */
    public Veggie createVeggie();
}
