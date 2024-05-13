package Ej_1_DelExamen.Entrega_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for a restaurant that can notify observers.
 * This class implements the RestaurantComponent and Subject interfaces.
 */
public class RestaurantWithObserver implements RestaurantComponent, Subject {

    private List<Ej_1_DelExamen.Entrega_2.Observer> observers = new ArrayList<>();


    /**
     * Method to add an observer.
     * @param o The observer to be added.
     */
    @Override
    public void addObserver(Ej_1_DelExamen.Entrega_2.Observer o) {
        observers.add(o);
    }



    /**
     * Method to remove an observer.
     * @param o The observer to be removed.
     */
    @Override
    public void removeObserver(Ej_1_DelExamen.Entrega_2.Observer o) {
        observers.remove(o);
    }



    /**
     * Method to notify all observers.
     */
    @Override
    public void notifyObservers() {
        for (Ej_1_DelExamen.Entrega_2.Observer observer : observers) {
            observer.update();
        }
    }



    /**
     * Method to serve a customer and notify all observers.
     */
    @Override
    public void serveCustomer() {
        // serve customer
        notifyObservers();
    }

}