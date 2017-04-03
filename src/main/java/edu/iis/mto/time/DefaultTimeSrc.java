package edu.iis.mto.time;

public final class DefaultTimeSrc implements TimeSource{
    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
