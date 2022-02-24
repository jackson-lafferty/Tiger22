package studentWork.jackson_lafferty.ElevensLab.Activity1;
public class Card {

	private String suit;

	private String rank;

	private int pointValue;

	public void setSuit(String s) {
	 this.suit = s;
	}

	public void setRank(String r) {
	 this.rank = r;
	}

	public void setPointValue(int pv) {
	 this.pointValue = pv;
	}

	public String getSuit() {
		return this.suit;
	}

	public String getRank() {
		return this.suit;
	}

	public int getPointValue() {
		return this.pointValue;
	}

	
	public boolean matches(Card otherCard) {
		if (this.suit == otherCard.suit && this.rank == otherCard.rank && this.pointValue == otherCard.pointValue) {
			return true;
		} else {
			return false;
		}
	}

	public Card(String cardRank, String cardSuit, int cardPointValue) {
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
	}

	public String toString() {
		return rank + " of " + suit + " (point value = " + pointValue + ")";
	}
}
