package edu.iis.mto.time;

import org.junit.Test;


public class OrderTest {
    @Test(expected = OrderExpiredException.class)
 	 	public void testAdvancedTimeSrc() {
        	 		Order order = new Order(new AdvancedTimeSrc());
        	 		order.submit();
        	 		order.confirm();
        	 	}
}