package Ej_1_DelExamen.Entrega_2;


/**
 * Interface for external system adapters.
 */
public interface ExternalSystemAdapter {

    /**
     * Method to reserve a table.
     */
    void reserveTable();


    /**
     * Method to deliver food.
     */
    void deliverFood();
}