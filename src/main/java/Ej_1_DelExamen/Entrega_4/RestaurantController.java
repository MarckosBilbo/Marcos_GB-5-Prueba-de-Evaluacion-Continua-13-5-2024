package Ej_1_DelExamen.Entrega_4;


import Ej_1_DelExamen.Entrega_2.RestaurantComponent;

/**
 * Controlador para el sistema de gestión de restaurantes.
 * Mantiene una referencia al modelo y a la vista, y proporciona métodos para interactuar con el modelo y actualizar la vista.
 */
public class RestaurantController {
    private RestaurantModel model;
    private RestaurantGUI view;

    /**
     * Crea un nuevo controlador.
     * @param model El modelo.
     * @param view La vista.
     */
    public RestaurantController(RestaurantModel model, RestaurantGUI view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Añade un componente al modelo.
     * @param component El componente a añadir.
     */
    public void addComponent(RestaurantComponent component) {
        model.addComponent(component);
    }

    /**
     * Sirve a los clientes utilizando el modelo.
     */
    public void serveCustomers() {
        model.serveCustomers();
    }

    /**
     * Actualiza la vista.
     */
    public void updateView() {
        view.displayComponents(model.getComponents());
    }
}
