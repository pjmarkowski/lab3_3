package lab3_3;

import org.junit.Test;

import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import fakeTime.AdvancedTimeSrc;
import fakeTime.DefaultTimeSrc;

public class testOrder {
	
	@Test
 	public void confirmDefaultTime() {
 		Order order = new Order(new DefaultTimeSrc());
 		order.submit();
 		order.confirm();
 	}

	@Test(expected = OrderExpiredException.class)
	 	public void confirmAdvancedTime() {
	 		Order order = new Order(new AdvancedTimeSrc());
	 		order.submit();
	 		order.confirm();
	 	}

}
