package studentWork.jackson_lafferty.ElevensLab.Activity7;
import studentWork.jackson_lafferty.ElevensLab.Activity1.Card;
import studentWork.jackson_lafferty.ElevensLab.Activity2.Deck;
import java.util.*;

public class ElevensBoard {

	private static final int BOARD_SIZE = 9;

	private static final String[] RANKS = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	private static final String[] SUITS = {"spades", "hearts", "diamonds", "clubs"};

	private static final int[] POINT_VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	private Card[] cards;

	private Deck deck;

	private static final boolean I_AM_DEBUGGING = false;


	public ElevensBoard() {
		cards = new Card[BOARD_SIZE];
		deck = new Deck(RANKS, SUITS, POINT_VALUES);
		if (I_AM_DEBUGGING) {
			System.out.println(deck);
			System.out.println("----------");
		}
		dealMyCards();
	}

	public void newGame() {
		deck.shuffle();
		dealMyCards();
	}

	public int size() {
		return cards.length;
	}

	public boolean isEmpty() {
		for (int k = 0; k < cards.length; k++) {
			if (cards[k] != null) {
				return false;
			}
		}
		return true;
	}

	public void deal(int k) {
		cards[k] = deck.deal();
	}

	public int deckSize() {
		return deck.size();
	}

	public Card cardAt(int k) {
		return cards[k];
	}

	public void replaceSelectedCards(List<Integer> selectedCards) {
		for (Integer k : selectedCards) {
			deal(k.intValue());
		}
	}

	public List<Integer> cardIndexes() {
		List<Integer> selected = new ArrayList<Integer>();
		for (int k = 0; k < cards.length; k++) {
			if (cards[k] != null) {
				selected.add(k);
			}
		}
		return selected;
	}

	public String toString() {
		String s = "";
		for (int k = 0; k < cards.length; k++) {
			s = s + k + ": " + cards[k] + "\n";
		}
		return s;
	}

	public boolean gameIsWon() {
		if (deck.isEmpty()) {
			for (Card c : cards) {
				if (c != null) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public boolean isLegal(List<Integer> selectedCards) {
		if (selectedCards.size() == 2) {
			if (containsPairSum11(selectedCards)) {
				return true;
			}
		} else if (selectedCards.size() == 3) {
			if (containsJQK(selectedCards)) {
					return true;
			}
		}

		return false;
	}

	public boolean anotherPlayIsPossible() {
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				if (cards[j].pointValue() == (11 - cards[i].pointValue())) {
					return true;
				}
			}
		}

		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				for (int k = 0; k < BOARD_SIZE; k++) {
					if (cards[i].pointValue() + cards[j].pointValue() + cards[k].pointValue() == 0) {
						if (!cards[i].rank().equals(cards[j].rank()) && !cards[i].rank().equals(cards[k].rank()) && !cards[j].rank().equals(cards[k].rank())) {
							return true;
						}
					}
				}
			}
		}

		return false;
	}

	private void dealMyCards() {
		for (int k = 0; k < cards.length; k++) {
			cards[k] = deck.deal();
		}
	}

	private boolean containsPairSum11(List<Integer> selectedCards) {
		if (cards[selectedCards.get(0)].pointValue() + cards[selectedCards.get(1)].pointValue() == 11) {
			return true;
		}

		return false;
	}

	private boolean containsJQK(List<Integer> selectedCards) {
		if (cards[selectedCards.get(0)].pointValue() + cards[selectedCards.get(1)].pointValue() + cards[selectedCards.get(2)].pointValue() == 0) {
			if (!cards[selectedCards.get(0)].rank().equals(cards[selectedCards.get(1)].rank()) && !cards[selectedCards.get(1)].rank().equals(cards[selectedCards.get(2)].rank()) && !cards[selectedCards.get(0)].rank().equals(cards[selectedCards.get(2)].rank())) {
				return true;
			}
		}

		return false;
	}
}