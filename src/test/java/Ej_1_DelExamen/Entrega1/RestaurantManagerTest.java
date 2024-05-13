package Ej_1_DelExamen.Entrega1;

import Ej_1_DelExamen.Entrega_1.Restaurant;
import Ej_1_DelExamen.Entrega_1.RestaurantFactory;
import Ej_1_DelExamen.Entrega_1.RestaurantManager;
import org.junit.jupiter.api.Test;

public class RestaurantManagerTest {
    @Test
    public void testAddAndServeRestaurants() {
        RestaurantManager manager = RestaurantManager.getInstance();
        RestaurantFactory factory = new RestaurantFactory();

        Restaurant fastFood = factory.createRestaurant("FastFood");
        manager.addRestaurant(fastFood);

        Restaurant themed = factory.createRestaurant("Themed");
        manager.addRestaurant(themed);

        Restaurant luxury = factory.createRestaurant("Luxury");
        manager.addRestaurant(luxury);

        // Test that the serveCustomers method runs without throwing exceptions
        manager.serveCustomers();
    }
}