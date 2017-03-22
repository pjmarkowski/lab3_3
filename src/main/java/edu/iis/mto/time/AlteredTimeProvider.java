package edu.iis.mto.time;

public class AlteredTimeProvider implements ITime {

	public static long howMuchToAdd = 0;
	
	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis() + howMuchToAdd;
	}
	
}
