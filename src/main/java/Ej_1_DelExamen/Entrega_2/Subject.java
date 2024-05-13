package Ej_1_DelExamen.Entrega_2;


/**
 * Interface for a subject that can notify observers.
 */
public interface Subject {
    void addObserver(Ej_1_DelExamen.Entrega_2.Observer o);
    void removeObserver(Ej_1_DelExamen.Entrega_2.Observer o);
    void notifyObservers();
}