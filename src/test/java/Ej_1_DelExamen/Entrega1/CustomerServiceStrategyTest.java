package Ej_1_DelExamen.Entrega1;

import Ej_1_DelExamen.Entrega_1.CustomerServiceStrategy;
import Ej_1_DelExamen.Entrega_1.FastFoodCustomerServiceStrategy;
import Ej_1_DelExamen.Entrega_1.LuxuryCustomerServiceStrategy;
import Ej_1_DelExamen.Entrega_1.ThemedCustomerServiceStrategy;
import org.junit.jupiter.api.Test;

public class CustomerServiceStrategyTest {
    @Test
    public void testFastFoodCustomerServiceStrategy() {
        CustomerServiceStrategy strategy = new FastFoodCustomerServiceStrategy();
        // Test that the serve method runs without throwing exceptions
        strategy.serve();
    }

    @Test
    public void testThemedCustomerServiceStrategy() {
        CustomerServiceStrategy strategy = new ThemedCustomerServiceStrategy();
        // Test that the serve method runs without throwing exceptions
        strategy.serve();
    }

    @Test
    public void testLuxuryCustomerServiceStrategy() {
        CustomerServiceStrategy strategy = new LuxuryCustomerServiceStrategy();
        // Test that the serve method runs without throwing exceptions
        strategy.serve();
    }
}