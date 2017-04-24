import edu.iis.mto.time.AdditionalTime;
import edu.iis.mto.time.DefaultTime;
import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Piotr on 24.04.2017.
 */
public class TestOrder {

    @Test(expected = OrderExpiredException.class)
    public void shouldReturnExceptionWhenCalledConfirmWithAdditionalTime() {
        Order order = new Order(new AdditionalTime());
        order.submit();
        order.confirm();
    }
}
