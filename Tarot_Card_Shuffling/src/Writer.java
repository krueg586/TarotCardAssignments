public class Writer extends Creative {
    private int availableSlots;

    public Writer(String username, int[] optouts) {
    	super(username, optouts);
        this.availableSlots = 3;
    }
    
    public void useSlot() {
    	this.availableSlots--;
    }
    
    @Override
    public boolean isAvailable() {
    	if (this.availableSlots == 0)
    		return false;
    	else
    		return true;
    }
}
