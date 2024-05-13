package Ej_1_DelExamen.Entrega_2;

import java.util.ArrayList;
import java.util.List;


/**
 * Class for a group of restaurant components.
 */
public class RestaurantGroup implements RestaurantComponent {

    private List<RestaurantComponent> components = new ArrayList<>();


    /**
     * Method to add a restaurant component to the group.
     */
    public void addComponent(RestaurantComponent component) {
        components.add(component);
    }



    /**
     * Method to serve a customer in all restaurant components of the group.
     */
    @Override
    public void serveCustomer() {
        for (RestaurantComponent component : components) {
            component.serveCustomer();
        }
    }
}
