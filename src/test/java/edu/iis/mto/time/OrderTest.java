package edu.iis.mto.time;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pebuls on 03.04.17.
 */
public class OrderTest {

    private Order order;

    @Before
    public void setUp() throws Exception {
        order = new Order();
    }

    @Test(expected = OrderExpiredException.class)
    public void getExceptionWhenOrderExceedTheDeadline  () throws Exception {

        order.submit();

        DateTimeUtils.setCurrentMillisOffset((Order.VALID_PERIOD_HOURS + 1) * DateTimeConstants.MILLIS_PER_HOUR);
        order.confirm();
    }

}