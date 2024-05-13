package Ej_1_DelExamen;


import Ej_1_DelExamen.Entrega_4.RestaurantModel;
import Ej_1_DelExamen.Entrega_4.RestaurantGUI;
import Ej_1_DelExamen.Entrega_4.RestaurantController;

public class Main {
    public static void main(String[] args) {
        // Crear el modelo
        RestaurantModel model = new RestaurantModel();

        // Crear la vista
        RestaurantGUI view = new RestaurantGUI(null); // Temporalmente pasamos null

        // Crear el controlador
        RestaurantController controller = new RestaurantController(model, view);

        // Asignar el controlador a la vista
        view.setController(controller); // Necesitarás agregar un método setController en la clase RestaurantGUI

        // Mostrar la vista
        view.setVisible(true);
    }
}