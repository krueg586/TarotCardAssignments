
public class Creative {
	private String username;
    private int[] optouts; // Array of indices of cards the artist does not want
    private boolean available;
    
    public Creative (String username, int[] optOuts) {
    	this.username = username;
    	this.optouts = optOuts;
        this.available = true;
    }
    public String getUsername() {
        return username;
    }

    public int[] getOptouts() {
        return optouts;
    }
    
    public boolean isAvailable() {
    	return available;
    }
    
    public void setUnavailable() {
    	this.available = false;
    }
    
}
