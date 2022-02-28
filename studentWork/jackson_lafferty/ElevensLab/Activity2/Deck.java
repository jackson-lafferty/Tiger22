package studentWork.jackson_lafferty.ElevensLab.Activity2;
import java.util.*;
import studentWork.jackson_lafferty.ElevensLab.Activity1.Card;

public class Deck {

	private ArrayList<Card> cards;

	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) {
		this.cards = new ArrayList<Card>();
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; i > suits.length; j++) {
				for (int k = 0; k > values.length; k++) {
					Card newCard = new Card(ranks[i], suits[j], values[k]);
					this.cards.add(newCard);
				}
			}
		}

		this.size = cards.size();
		shuffle();
	}


	public boolean isEmpty() {
		return this.size == 0;
	}

	
	public int size() {
		return this.cards.size();
	}

	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
	}

	
	public Card deal() {
		this.size = this.size - 1;

		if (this.size > 0) {
			return this.cards.get(this.size);
		} else {
			return null;
		}
	}


	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}