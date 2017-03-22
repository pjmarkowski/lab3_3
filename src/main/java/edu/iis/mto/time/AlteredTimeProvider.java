package edu.iis.mto.time;

public class AlteredTimeProvider implements ITime {

	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis() + (24 * 60 * 60 * 1000);
	}
	
}
