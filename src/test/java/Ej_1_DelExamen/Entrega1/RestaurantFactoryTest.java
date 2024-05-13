package Ej_1_DelExamen.Entrega1;

import Ej_1_DelExamen.Entrega_1.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RestaurantFactoryTest {
    @Test
    public void testCreateRestaurant() {
        RestaurantFactory factory = new RestaurantFactory();

        Restaurant fastFood = factory.createRestaurant("FastFood");
        assertTrue(fastFood instanceof FastFoodRestaurant);

        Restaurant themed = factory.createRestaurant("Themed");
        assertTrue(themed instanceof ThemedRestaurant);

        Restaurant luxury = factory.createRestaurant("Luxury");
        assertTrue(luxury instanceof LuxuryRestaurant);
    }
}