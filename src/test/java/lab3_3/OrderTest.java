package lab3_3;

import org.junit.Test;

import edu.iis.mto.time.AlteredTimeProvider;
import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import edu.iis.mto.time.TimeProvider;

public class OrderTest {
	
	@Test
	public void orderNotYetExpired() {
		Order testOrder = new Order(new TimeProvider());
		testOrder.submit();
		testOrder.confirm();
	}
	
	@Test (expected = OrderExpiredException.class)
	public void orderExpired() {
		Order testOrder = new Order(new AlteredTimeProvider());
		testOrder.submit();
		testOrder.confirm();
	}
}
