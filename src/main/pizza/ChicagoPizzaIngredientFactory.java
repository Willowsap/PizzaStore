package pizza;

/**
 * A pizza ingredient factory for ingredients in the Chicago style family.
 * 
 * @author Willow Sapphire
 * @version 06/12/2024
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory
{
    @Override
    public Dough createDough()
    {
        System.out.println("Creating thin crust dough.");
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce()
    {
        System.out.println("Creating marinara sauce.");
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese()
    {
        System.out.println("Creating reggiano cheese.");
        return new ReggianoCheese();
    }

    @Override
    public Clam createClam()
    {
        System.out.println("Creating fresh clams.");
        return new FreshClam();
    }

    @Override
    public Meat createMeat()
    {
        System.out.println("Creating sausage topping.");
        return new Sausage();
    }

    @Override
    public Veggie createVeggie()
    {
        System.out.println("Creating pepper topping.");
        return new Pepper();
    }
    
}
