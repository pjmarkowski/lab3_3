package edu.iis.mto.time;

/**
 * Created by Piotr on 24.04.2017.
 */
public class DefaultTime implements TimeSource {

    @Override public long currentTime() {
        return System.currentTimeMillis();
    }
}
