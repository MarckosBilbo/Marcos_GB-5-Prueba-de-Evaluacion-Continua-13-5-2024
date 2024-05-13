package Ej_1_DelExamen.Entrega_3;

import org.junit.jupiter.api.Test;
import Ej_1_DelExamen.Entrega_3.*;

public class StateTest {
    @Test
    public void testState() {
        State freeTableState = new FreeTableState();
        freeTableState.handle();

        State reservedTableState = new ReservedTableState();
        reservedTableState.handle();

        State occupiedTableState = new OccupiedTableState();
        occupiedTableState.handle();
    }
}