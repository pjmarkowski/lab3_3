package fakeTime;

public final class AdvancedTimeSrc implements TimeSource {	 
	 	private static final long ONE_DAY = 24 * 60 * 60 * 1000;	 	
	 
	 	@Override
	 	public long currentTimeMillis() {
	 		return System.currentTimeMillis() + ONE_DAY;
	 	}
	
	 }