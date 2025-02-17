package ElevensLab.Activity7;
import ElevensLab.Activity1.Card;
import ElevensLab.Activity2.Deck;
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
				selected.add(Integer.valueOf(k));
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
		return containsPairSum11(selectedCards) || containsJQK(selectedCards);
	}

	public boolean anotherPlayIsPossible() {
		for (int i = 0; i < cards.length; i++) {
         for (int j = i + 1; j < cards.length; j++) {
            ArrayList<Integer> selectedCardPair = new ArrayList<Integer>();
            selectedCardPair.add(i);
            selectedCardPair.add(j);
            
            if (isLegal(selectedCardPair)) {
               return true;
            }
            
            for (int k = j + 1; k < cards.length; k++) {
               ArrayList<Integer> selectedCardTriple = new ArrayList<Integer>();
               selectedCardTriple.add(i);
               selectedCardTriple.add(j);
               selectedCardTriple.add(k);
               
               if (isLegal(selectedCardTriple)) {
                  return true;
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
      if (selectedCards.size() != 2) {
         return false;
      } else if (cards[selectedCards.get(0)] == null || cards[selectedCards.get(1)] == null) {
         return false;
      } else {
         return cards[selectedCards.get(0)].pointValue() + cards[selectedCards.get(1)].pointValue() == 11;
      }
	}

	private boolean containsJQK(List<Integer> selectedCards) {
		if (selectedCards.size() != 3) {
         return false;
      } else if (cards[selectedCards.get(0)] == null || cards[selectedCards.get(1)] == null || cards[selectedCards.get(2)] == null) {
         return false;
      }

      String ranks = cards[selectedCards.get(0)].rank() + "." + cards[selectedCards.get(1)].rank() + "." + cards[selectedCards.get(2)].rank();
      
	  return ranks.indexOf("jack") >= 0 && ranks.indexOf("queen") >= 0 && ranks.indexOf("king") >= 0;
	}
}