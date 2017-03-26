package edu.iis.mto.time;

public class AlteredTimeProvider implements ITime {

	private static final long TWO_DAYS = 24 * 60 * 60 * 1000 * 2;
	
	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis() + TWO_DAYS;
	}
	
}
