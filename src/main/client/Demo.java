package client;

import java.util.ArrayList;
import java.util.Scanner;

import pizza.ChicagoPizzaStore;
import pizza.NYPizzaStore;
import pizza.Pizza;
import pizza.PizzaStore;

/**
 * Shows off our pizza stores!
 * 
 * @author Willow Sapphire
 * @version 06/12/2024
 */
public class Demo
{
	/**
     * Runs the demo.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner kb = new Scanner(System.in);
        int choice = 0;
        int menuChoice = 0;
        PizzaStore store = null;
        ArrayList<Pizza> order = new ArrayList<Pizza>();

        /*
         * Ask the user which store they want to order from.
         */
        System.out.println("Hello and welcome to our pizza store!");
        System.out.println("Would you like to order from the "
            + "New York location or Chicago location?");
        System.out.println("1) New York");
        System.out.println("2) Chicago");
        do {
            try {
                choice = Integer.parseInt(kb.nextLine());
                if (choice != 1 && choice != 2) {
                    System.out.println("Invalid choice. Please enter a 1 or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a 1 or 2.");
            }
        } while (choice != 1 && choice != 2);
        switch (choice)
        {
            case 1:
                store = new NYPizzaStore();
                break;
            case 2:
                store = new ChicagoPizzaStore();
                break;
        }
        
        /*
         * Enter the order loop.
         */
        do {
            System.out.println("What would you like to do?");
            System.out.println("1) Order a pizza");
            System.out.println("2) Review Order");
            System.out.println("3) Exit");
            do {
                try {
                    menuChoice = Integer.parseInt(kb.nextLine());
                    if (menuChoice < 1 || menuChoice > 3) {
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
            } while (menuChoice < 1 || menuChoice > 3);
            switch (menuChoice)
            {
                case 1:
                    /*
                     * Ask the user which pizza they want to order.
                     */
                    System.out.println("What kind of pizza would you like to order?");
                    System.out.println("1) Cheese");
                    System.out.println("2) Clam");
                    System.out.println("3) Meat");
                    System.out.println("4) Veggie");
                    do {
                        try {
                            choice = Integer.parseInt(kb.nextLine());
                            if (choice < 1 || choice > 4) {
                                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                        }
                    } while (choice < 1 || choice > 4);
                    switch (choice)
                    {
                        case 1:
                            order.add(store.orderPizza("cheese"));
                            break;
                        case 2:
                            order.add(store.orderPizza("clam"));
                            break;
                        case 3:
                            order.add(store.orderPizza("meat"));
                            break;
                        case 4:
                            order.add(store.orderPizza("veggie"));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Your order:");
                    for (Pizza pizza : order)
                    {
                        System.out.println(pizza);
                    }
                    System.out.println("Thank you for your order!");
                    break;
            }
        } while (menuChoice != 3);
        System.out.println("Goodbye!");
    }
}
