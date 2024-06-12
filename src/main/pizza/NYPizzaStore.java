package pizza;

public class NYPizzaStore extends PizzaStore
{
    /**
     * Creates a new NY Pizza Store.
     * Uses the NYPizzaIngredientFactory.
     */
    public NYPizzaStore()
    {
        super(new NYPizzaIngredientFactory());
    }

    @Override
    public Pizza createPizza(String type)
    {
        switch (type)
        {
            case "cheese":
                return new NYCheesePizza(
                    factory.createDough(),
                    factory.createSauce(),
                    factory.createCheese()
                );
            case "meat":
                return new NYMeatPizza(
                    factory.createDough(),
                    factory.createSauce(),
                    factory.createCheese(),
                    factory.createMeat()
                );
            case "veggie":
                return new NYVeggiePizza(
                    factory.createDough(),
                    factory.createSauce(),
                    factory.createCheese(),
                    factory.createVeggie()
                );
            case "clam":
                return new NYClamPizza(
                    factory.createDough(),
                    factory.createSauce(),
                    factory.createCheese(),
                    factory.createClam()
                );
            default:
                throw new IllegalArgumentException("Invalid pizza type");
        }
    }
}
