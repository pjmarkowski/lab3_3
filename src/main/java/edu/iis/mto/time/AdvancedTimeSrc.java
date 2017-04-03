package edu.iis.mto.time;


public final class AdvancedTimeSrc implements TimeSource{
    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis() + 25 * 60 * 60 * 1000;
    }
}
