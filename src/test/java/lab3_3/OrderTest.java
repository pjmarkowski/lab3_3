package lab3_3;

import org.junit.Test;

import edu.iis.mto.time.AlteredTimeProvider;
import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;

public class OrderTest {

	@Test
	public void orderNotYetExpired() {
		AlteredTimeProvider.howMuchToAdd = 24 * 60 * 60 * 1000;
		Order testOrder = new Order();
		testOrder.submit();
		testOrder.confirm();
	}
	
	@Test (expected = OrderExpiredException.class)
	public void orderExpired() {
		AlteredTimeProvider.howMuchToAdd = 24 * 60 * 60 * 1000 + 60 * 60 * 1000;
		Order testOrder = new Order();
		testOrder.submit();
		testOrder.confirm();
	}
}
