package edu.iis.mto.time;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;


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

    @Test (expected = OrderExpiredException.class)
    public void checkIfOrderHasBeenCancelled_expiredOrder() throws Exception {
        Order order = new Order(new CustomTimeProvider());
        order.submit();;
        order.confirm();
        Assert.assertThat(order.getOrderState(),is(equalTo(Order.State.CANCELLED)));
    }

}
