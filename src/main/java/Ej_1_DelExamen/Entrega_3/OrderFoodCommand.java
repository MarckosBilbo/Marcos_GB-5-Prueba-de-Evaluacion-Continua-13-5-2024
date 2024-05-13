package Ej_1_DelExamen.Entrega_3;

import Ej_1_DelExamen.Entrega_2.RestaurantComponent;

/**
 * Class for a command to order food.
 */
public class OrderFoodCommand implements Command, RestaurantComponent {
    @Override
    public void execute() {
        // Code to order food
    }

    @Override
    public void serveCustomer() {
        // Code to serve a customer
    }
}