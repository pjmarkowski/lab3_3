package edu.iis.mto.time;

import org.junit.Test;


public class OrderTest {

    @Test(expected = OrderExpiredException.class)
    public void testOrderShouldThrowOrderExpiredException() {
        Order order = new Order(new AdvancedTimeSrc());
        order.submit();
        order.confirm();
    }

    @Test
    public void confirmDefaultTime() {
        Order order = new Order(new DefaultTimeSrc());
        order.submit();
        order.confirm();
    }

}