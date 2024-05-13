package Ej_1_DelExamen.Entrega_3;

import org.junit.jupiter.api.Test;
import Ej_1_DelExamen.Entrega_3.*;

public class CommandTest {
    @Test
    public void testCommand() {
        Command reserveTableCommand = new ReserveTableCommand();
        reserveTableCommand.execute();

        Command orderFoodCommand = new OrderFoodCommand();
        orderFoodCommand.execute();

        Command cancelReservationCommand = new CancelReservationCommand();
        cancelReservationCommand.execute();
    }
}