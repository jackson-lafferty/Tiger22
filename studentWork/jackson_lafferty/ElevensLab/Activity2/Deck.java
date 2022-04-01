package ElevensLab.Activity2;
import ElevensLab.Activity1.Card;
import java.util.*;

public class Deck {

	private List<Card> cards;

	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		for (int j = 0; j < ranks.length; j++) {
			for (String suitString : suits) {
				cards.add(new Card(ranks[j], suitString, values[j]));
			}
		}
		size = cards.size();
		shuffle();
	}


	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void shuffle() {
		Random rand = new Random();

		for (int i = 51; i > 0; i--) {
			int rng = rand.nextInt(i);
			Card temp = cards.get(i);
			
			cards.set(i, cards.get(rng));
			cards.set(rng, temp);
		}
	}

	public Card deal() {
		if (isEmpty()) {
			return null;
		}
		size--;
		Card c = cards.get(size);
		return c;
	}

	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
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
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}