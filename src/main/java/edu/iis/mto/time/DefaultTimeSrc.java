package edu.iis.mto.time;


public class DefaultTimeSrc implements TimeImpl {
    @Override
    public long currentTimeInMillis() {
        return System.currentTimeMillis();
    }
}
