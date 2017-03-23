package fakeTime;

public final class DefaultTimeSrc implements TimeSource {
	 
 	@Override
 	public long currentTimeMillis() {
 		return System.currentTimeMillis();
 	}
 
 }