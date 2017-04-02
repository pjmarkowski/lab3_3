package edu.iis.mto.time;

/**
 * Created by grusz on 02.04.2017.
 */
public class CustomTimeProvider implements ITime {

    private final static long ONE_DAY = 24*60*60*1000;

    @Override
    public long currentTimeInMillis() {
        return System.currentTimeMillis() + ONE_DAY;
    }
}
