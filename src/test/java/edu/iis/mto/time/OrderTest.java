package edu.iis.mto.time;

import org.joda.time.DateTimeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sasho on 2017-03-27.
 */
public class OrderTest {

    @Test(expected = OrderExpiredException.class)
    public void testConfirm_DateExpired() throws Exception {
        Order order = new Order();
        order.submit();
        DateTimeUtils.setCurrentMillisOffset((24+1)*60*60*1000);
        order.confirm();
    }
}