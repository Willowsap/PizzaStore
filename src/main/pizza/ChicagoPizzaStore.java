package pizza;

public class ChicagoPizzaStore extends PizzaStore
{
    /**
     * Creates a new Chicago Pizza Store.
     * Uses the ChicagoPizzaIngredientFactory.
     */
    public ChicagoPizzaStore()
    {
        super(new ChicagoPizzaIngredientFactory());
    }

    @Override
    public Pizza createPizza(String type)
    {
        switch (type)
        {
            case "cheese":
                return new ChicagoCheesePizza(
                    factory.createDough(),
                    factory.createSauce(),
                    factory.createCheese()
                );
            case "meat":
                return new ChicagoMeatPizza(
                    factory.createDough(),
                    factory.createSauce(),
                    factory.createCheese(),
                    factory.createMeat()
                );
            case "veggie":
                return new ChicagoVeggiePizza(
                    factory.createDough(),
                    factory.createSauce(),
                    factory.createCheese(),
                    factory.createVeggie()
                );
            case "clam":
                return new ChicagoClamPizza(
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
