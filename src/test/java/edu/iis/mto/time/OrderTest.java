package edu.iis.mto.time;


import org.junit.Test;



/**
 * Created by grusz on 02.04.2017.
 */
public class OrderTest {

    @Test
    public void checkIfOrderExpired_notExpiredOrder() throws Exception {
        Order order = new Order(new SystemTimeProvider());
        order.submit();
        order.confirm();

    }

    @Test (expected = OrderExpiredException.class)
    public void checkIfOrderExpired_ExpiredOrder() throws Exception {
        Order order = new Order(new CustomTimeProvider());
        order.submit();
        order.confirm();
    }


}
