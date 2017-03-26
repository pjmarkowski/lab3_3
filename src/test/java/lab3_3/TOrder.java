package lab3_3;

import org.junit.Test;

import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import fakeSystemClock.AdvancedTimeSrc;
import fakeSystemClock.DefaultTimeSrc;

public class TOrder {

	@Test
	public void confirmMethodDoesntThrowExceptionWithDefaultTimeSrc() {
		Order order = new Order(new DefaultTimeSrc());
		order.submit();
		order.confirm();
	}

	@Test(expected = OrderExpiredException.class)
	public void confirmMethodThrowsExceptionWithAdvancedTimeSrc() {
		Order order = new Order(new AdvancedTimeSrc());
		order.submit();
		order.confirm();
	}
}
