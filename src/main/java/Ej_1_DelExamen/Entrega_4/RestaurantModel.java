package Ej_1_DelExamen.Entrega_4;


import Ej_1_DelExamen.Entrega_2.RestaurantComponent;
import java.util.ArrayList;
import java.util.List;


/**
 * Modelo para el sistema de gestión de restaurantes.
 * Mantiene una lista de componentes de restaurantes y proporciona métodos para interactuar con ellos.
 */
public class RestaurantModel {
    private List<RestaurantComponent> components = new ArrayList<>();

    /**
     * Añade un componente al modelo.
     * @param component El componente a añadir.
     */
    public void addComponent(RestaurantComponent component) {
        components.add(component);
    }



    /**
     * Sirve a los clientes de todos los componentes.
     */
    public void serveCustomers() {
        for (RestaurantComponent component : components) {
            component.serveCustomer();
        }
    }



    /**
     * Devuelve la lista de componentes.
     * @return La lista de componentes.
     */
    public List<RestaurantComponent> getComponents() {
        return components;
    }
}