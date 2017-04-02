package edu.iis.mto.time;

/**
 * Created by grusz on 02.04.2017.
 */
public class SystemTimeProvider implements ITime {
    @Override
    public long currentTimeInMillis() {
        return System.currentTimeMillis();
    }
}
