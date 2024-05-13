package Ej_1_DelExamen.Entrega_1;

/**
 * Factory class to create different types of restaurants.
 */
public class RestaurantFactory {

    /**
     * Method to create a restaurant of a specific type.
     * @param type The type of restaurant to create.
     * @return A new restaurant of the specified type.
     */
    public Restaurant createRestaurant(String type) {
        switch (type) {
            case "FastFood":
                return new FastFoodRestaurant();
            case "Themed":
                return new ThemedRestaurant();
            case "Luxury":
                return new LuxuryRestaurant();
            default:
                throw new IllegalArgumentException("Invalid restaurant type");
        }
    }
}