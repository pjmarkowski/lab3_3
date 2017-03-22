package edu.iis.mto.time;

public class TimeProvider implements ITime {

	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis();
	}
}
