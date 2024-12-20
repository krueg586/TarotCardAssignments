
public class Card {
	private String name;
	private String character;
	
	public Card(String name, String character) {
		this.name = name;
		this.character = character;
	}
	
	public String getName() {
		return this.name;
	}
	public String getCharacter() {
		return this.character;
	}
	public String getCard() {
		return this.name + " (" + this.character + ")";
	}
	
}
