package edu.iis.mto.time;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Klaudia on 04.04.2017.
 */
public class OrderTest {

    @Test(expected = OrderExpiredException.class)
    public void testOrderShouldThrowOrderExpiredException() {
        Order order = new Order(new AdvancedTimeSrc());
        order.submit();
        order.confirm();
    }
}