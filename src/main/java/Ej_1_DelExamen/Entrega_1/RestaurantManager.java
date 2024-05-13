package Ej_1_DelExamen.Entrega_1;

import java.util.ArrayList;
import java.util.List;


/**
 * Singleton class to manage all restaurants.
 */
public class RestaurantManager {
    private static RestaurantManager instance;
    private List<Restaurant> restaurants;


    /**
     * Private constructor to prevent instantiation.
     */
    private RestaurantManager() {
        restaurants = new ArrayList<>();
    }



    /**
     * Method to get the single instance of the RestaurantManager.
     * @return The single instance of the RestaurantManager.
     */
    public static RestaurantManager getInstance() {
        if (instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }



    /**
     * Method to add a restaurant to the manager.
     * @param restaurant The restaurant to add.
     */
    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }



    /**
     * Method to serve customers at all restaurants.
     */
    public void serveCustomers() {
        for (Restaurant restaurant : restaurants) {
            restaurant.serveCustomer();
        }
    }
}