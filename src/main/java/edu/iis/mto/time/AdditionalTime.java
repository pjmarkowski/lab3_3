package edu.iis.mto.time;

/**
 * Created by Piotr on 24.04.2017.
 */
public class AdditionalTime implements TimeSource{
    private final long dayAndOneHourInMilis = 90000000;

    @Override public long currentTime() {
        return System.currentTimeMillis() + dayAndOneHourInMilis;
    }
}
