public class Assign_Driver {
    public static void main(String[] args) {
        boolean success = false;
        
        while (!success) {
            // Initialize arrays using initializer classes
            Card[] cards = TarotCards.initialize();
            Artist[] artists = ArtistDeck.initialize();
            Writer[] writers = WriterDeck.initialize();
            Verify check = new Verify();
            
            Artist[] assignedArtists = new Artist[cards.length];
            Writer[] assignedWriters = new Writer[cards.length];
            
            boolean conflict = false;
            
            // Iterate through each card
            for (int i = 0; i < cards.length; i++) {
                shuffle(artists);
                shuffle(writers);
                
                Artist selectedArtist = null;
                Writer selectedWriter = null;
                
                // Get artist
                for (int a = 0; a < artists.length; a++) {
                    if (check.availability(artists[a], i)) {
                        selectedArtist = artists[a];
                        artists[a].setUnavailable();
                        break; // Exit loop once a valid artist is found
                    }
                }
                
                // Get writer
                for (int w = 0; w < writers.length; w++) {
                    if (check.availability(writers[w], i)) {
                        selectedWriter = writers[w];
                        writers[w].useSlot();
                        break; // Exit loop once a valid writer is found
                    }
                }
                
                // Check if both artist and writer are available
                if (selectedArtist == null || selectedWriter == null) {
                    conflict = true;
                    break; // Exit loop if a conflict is found
                }
                
                assignedArtists[i] = selectedArtist;
                assignedWriters[i] = selectedWriter;
            }
            
            // If no conflict, print the results
            if (!conflict) {
                success = true;
                for (int i = 0; i < cards.length; i++) {
                    String cardName = cards[i].getCard();
                    String artistName = assignedArtists[i].getUsername();
                    String writerName = assignedWriters[i].getUsername();
                    System.out.println(cardName + ": (Artist: " + artistName + ") (Writer: " + writerName + ")");
                }
            } else {
                System.out.println("Conflict detected, retrying...");
            }
        }
    }
    
    private static void shuffle(Object[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            Object temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
