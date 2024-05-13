package Ej_1_DelExamen.Entrega_2;

import java.util.Observer;

/**
 * Interface for a subject that can notify observers.
 */
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}