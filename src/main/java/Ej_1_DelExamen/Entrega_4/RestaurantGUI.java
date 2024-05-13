package Ej_1_DelExamen.Entrega_4;

import Ej_1_DelExamen.Entrega_2.RestaurantComponent;
import Ej_1_DelExamen.Entrega_3.CancelReservationCommand;
import Ej_1_DelExamen.Entrega_3.OrderFoodCommand;
import Ej_1_DelExamen.Entrega_3.ReserveTableCommand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Vista para el sistema de gestión de restaurantes.
 * Proporciona una interfaz gráfica de usuario para interactuar con el sistema.
 */
public class RestaurantGUI extends JFrame {
    private RestaurantController controller;

    public void setController(RestaurantController controller) {
        this.controller = controller;
    }

    /**
     * Crea una nueva interfaz gráfica de usuario para el sistema de gestión de restaurantes.
     * @param controller El controlador para interactuar con el modelo.
     */
    public RestaurantGUI(RestaurantController controller) {
        this.controller = controller;

        setTitle("Restaurant Management System");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        JButton reserveTableButton = new JButton("Reserve Table");
        reserveTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.addComponent(new ReserveTableCommand());
            }
        });



        JButton orderFoodButton = new JButton("Order Food");
        orderFoodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.addComponent(new OrderFoodCommand());
            }
        });



        JButton cancelReservationButton = new JButton("Cancel Reservation");
        cancelReservationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.addComponent(new CancelReservationCommand());
            }
        });



        JButton serveCustomersButton = new JButton("Serve Customers");
        serveCustomersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.serveCustomers();
            }
        });



        add(reserveTableButton);
        add(orderFoodButton);
        add(cancelReservationButton);
        add(serveCustomersButton);

        setVisible(true);
    }



    /**
     * Actualiza la vista con la lista de componentes.
     * @param components La lista de componentes.
     */
    public void displayComponents(List<RestaurantComponent> components) {
        for (RestaurantComponent component : components) {
            System.out.println(component.toString());
        }
    }
}