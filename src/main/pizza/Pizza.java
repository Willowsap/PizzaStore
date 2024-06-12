package pizza;

import java.util.ArrayList;

/**
 * A generic pizza class.
 * 
 * @author Willow Sapphire
 * @version 06/12/2024
 */
public class Pizza
{
    /**
     * The dough used in the pizza.
     */
    private Dough dough;

    /**
     * The sauce used in the pizza.
     */
    private Sauce sauce;

    /**
     * The cheese used in the pizza.
     */
    private Cheese cheese;

    /**
     * The toppings on the pizza.
     */
    private ArrayList<Topping> toppings;

    /**
     * Creates a new pizza with no toppings.
     * 
     * @param dough the dough to be used in the pizza.
     * @param sauce the sauce to be used in the pizza.
     * @param cheese the cheest to be used in the pizza.
     */
    public Pizza(Dough dough, Sauce sauce, Cheese cheese)
    {
        setDough(dough);
        setSauce(sauce);
        setCheese(cheese);
        this.toppings = new ArrayList<Topping>();
    }

    /**
     * Prepares the pizza.
     */
    public void prepare()
    {
        System.out.printf("Preparing pizza with %s dough, %s sauce, and "
            + "%s cheese.\n", dough, sauce, cheese);
        System.out.printf("Adding toppings:\n");
        for (Topping topping : toppings)
        {
            System.out.printf("\t%s\n", topping);
        }
    }

    /**
     * Bakes the pizza.
     */
    public void bake()
    {
        System.out.println("Baking the pizza");
    }

    /**
     * Cuts the pizza.
     */
    public void cut()
    {
        System.out.println("Cutting the pizza");
    }

    /**
     * Boxes the pizza.
     */
    public void box()
    {
        System.out.println("Boxing the pizza");
    }

    /**
     * Adds a topping to the pizza.
     * 
     * @param topping the topping to add.
     */
    public void addTopping(Topping topping)
    {
        this.toppings.add(topping);
    }

    /**
     * Removes a topping from the pizza.
     * 
     * @param topping the topping to remove.
     */
    public void removeTopping(Topping topping)
    {
        this.toppings.remove(topping);
    }

    /**
     * Getter method for the dough.
     * 
     * @return The dough used in the pizza.
     */
    public Dough getDough()
    {
        return this.dough;
    }

    /**
     * Setter method for the dough.
     * 
     * @param dough The dough to be used in the pizza.
     */
    public void setDough(Dough dough)
    {
        this.dough = dough;
    }

    /**
     * Getter method for the sauce.
     * 
     * @return The sauce used in the pizza.
     */
    public Sauce getSauce()
    {
        return this.sauce;
    }

    /**
     * Setter method for the sauce.
     * 
     * @param sauce The sauce to be used in the pizza.
     */
    public void setSauce(Sauce sauce)
    {
        this.sauce = sauce;
    }

    /**
     * Getter method for the cheese.
     * 
     * @return The cheese used in the pizza.
     */
    public Cheese getCheese()
    {
        return this.cheese;
    }

    /**
     * Setter method for the cheese.
     * 
     * @param cheese The cheese to be used in the pizza.
     */
    public void setCheese(Cheese cheese)
    {
        this.cheese = cheese;
    }

    @Override
    public String toString()
    {
        String output = String.format("Dough: %s\nSauce: %s\nCheese: %s\n",
            dough, sauce, cheese);
        output += "Toppings:\n";
        for (Topping topping : toppings)
        {
            output += "\t" + topping + "\n";
        }
        return output;
    }
}