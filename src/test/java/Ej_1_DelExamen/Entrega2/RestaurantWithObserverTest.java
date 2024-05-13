package Ej_1_DelExamen.Entrega2;

import Ej_1_DelExamen.Entrega_2.Observer;
import Ej_1_DelExamen.Entrega_2.RestaurantWithObserver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RestaurantWithObserverTest {
    @Test
    public void testServeCustomer() {
        // Create a RestaurantWithObserver
        RestaurantWithObserver restaurant = new RestaurantWithObserver();

        // Create a mock Observer
        Observer observer = new Observer() {
            @Override
            public void update() {
                // This is a mock method
            }
        };

        // Add the observer to the restaurant
        restaurant.addObserver(observer);

        // Assert that no exception is thrown when calling serveCustomer
        assertDoesNotThrow(() -> restaurant.serveCustomer());
    }
}