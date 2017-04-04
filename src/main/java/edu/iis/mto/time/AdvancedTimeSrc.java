package edu.iis.mto.time;


public class AdvancedTimeSrc implements TimeImpl {
    private final static long ONE_DAY = 24*60*60*1000;
    @Override
    public long currentTimeInMillis() {
        return System.currentTimeMillis() + ONE_DAY;
    }
}
