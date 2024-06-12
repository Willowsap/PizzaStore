package pizza;

/**
 * A very simple store for buying pizzas.
 * 
 * @author Willow Sapphire
 * @version 06/12/2024
 */
public abstract class PizzaStore
{
    /**
     * The factory to use for creating ingredients.
     */
    protected PizzaIngredientFactory factory;

    /**
     * Constructs a new pizza store.
     * 
     * @param factory the ingredient factory to use.
     */
    public PizzaStore(PizzaIngredientFactory factory)
    {
        this.factory = factory;
    }

    /**
     * Orders a pizza!
     * This is a template method.
     * It ensures that the pizza is created in the proper way.
     * The createPizza method is the hook for subclasses to
     * decide which pizza to create.
     * The createPizza method is also the factory method.
     * 
     * @return the ordered pizza.
     */
    public Pizza orderPizza(String type)
    {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * Getter for the store's ingredient factory.
     * 
     * @return the factory.
     */
    public PizzaIngredientFactory getIngredientFactory()
    {
        return this.factory;
    }

    /**
     * Setter for the store's ingredient factory.
     * 
     * @param factory the factory to use.
     */
    public void setIngredientFactory(PizzaIngredientFactory factory)
    {
        this.factory = factory;
    }

    /**
     * This is our factory method.
     * We are delegating what pizza to create to subclasses.
     * 
     * @param type the type of pizza to create.
     * @return the created pizza.
     */
    public abstract Pizza createPizza(String type);
}