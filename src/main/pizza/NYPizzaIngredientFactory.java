package pizza;

/**
 * A pizza ingredient factory for ingredients in the NY style family.
 * 
 * @author Willow Sapphire
 * @version 06/12/2024
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory
{
    @Override
    public Dough createDough()
    {
        System.out.println("Creating thick crust dough.");
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce()
    {
        System.out.println("Creating plum tomato sauce.");
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese()
    {
        System.out.println("Creating mozzarella cheese.");
        return new MozzarellaCheese();
    }

    @Override
    public Clam createClam()
    {
        System.out.println("Creating frozen clams.");
        return new FrozenClam();
    }

    @Override
    public Meat createMeat()
    {
        System.out.println("Creating pepperoni topping.");
        return new Pepperoni();
    }

    @Override
    public Veggie createVeggie()
    {
        System.out.println("Creating tomato topping.");
        return new Tomato();
    }
    
}
