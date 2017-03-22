package lab3_3;

import org.junit.Test;

import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;

public class TOrder {

	@Test(expected = OrderExpiredException.class)
	public void confirmMethodThrowsException() {
		Order order = new Order();
		order.submit();
		order.confirm();
	}

}
