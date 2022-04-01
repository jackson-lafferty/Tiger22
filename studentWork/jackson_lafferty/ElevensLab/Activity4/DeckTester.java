package ElevensLab.Activity4;
import ElevensLab.Activity2.Deck;

public class DeckTester {
	public static void main(String[] args) {
		String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		int[] pointValues = {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck c = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + c.toString());
		System.out.println("  isEmpty: " + c.isEmpty());
		System.out.println("  size: " + c.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + c.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + c.toString());
		System.out.println("  isEmpty: " + c.isEmpty());
		System.out.println("  size: " + c.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 51 Cards ****");
		for (int i = 0; i < 51; i++) {
			System.out.println("  deal: " + c.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + c.toString());
		System.out.println("  isEmpty: " + c.isEmpty());
		System.out.println("  size: " + c.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + c.deal());
		System.out.println();
		System.out.println();
	}
}