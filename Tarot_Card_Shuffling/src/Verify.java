
public class Verify {
	
	public boolean availability(Creative creative, int cardIndex) {
		boolean available = creative.isAvailable();
		boolean noClashes = true;
		
		int[] optouts = creative.getOptouts();
		for (int optout : optouts) {
			if (optout == cardIndex)
				noClashes = false;
		}
		
		return available && noClashes;
	}
}
