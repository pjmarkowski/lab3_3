package edu.iis.mto.time;

/**
 * Created by Piotr on 24.04.2017.
 */
public class AdditionalTime implements TimeSource{
    private final long dayInMilis = 86400000;

    @Override public long currentTime() {
        return System.currentTimeMillis() + dayInMilis;
    }
}
