package ElevensLab.Activity1;

public class Card {

	private String suit;

	private String rank;

	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue) {
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
	}


	public void setSuit(String s) {
		suit = s;
	}

	public void setRank(String r) {
		rank = r;
	}

	public void setPointValue(int pv) {
		pointValue = pv;
	}
	

	public String suit() {
		return suit;
	}

	public String rank() {
		return rank;
	}

	public int pointValue() {
		return pointValue;
	}

	public boolean matches(Card otherCard) {
		return otherCard.suit().equals(this.suit())
			&& otherCard.rank().equals(this.rank())
			&& otherCard.pointValue() == this.pointValue();
	}

	public String toString() {
		return rank + " of " + suit + " (point value = " + pointValue + ")";
	}
}