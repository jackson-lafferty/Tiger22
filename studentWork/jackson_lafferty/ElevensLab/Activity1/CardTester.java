package ElevensLab.Activity1;
public class CardTester {

	public static void main(String[] args) {
		Card aceSpades = new Card("Ace", "Spades", 1);
		System.out.println(aceSpades.toString());

		Card twoSpades = new Card("Two", "Spades", 2);
		System.out.println(twoSpades.toString());

		Card threeSpades = new Card("Three", "Spades", 3);
		System.out.println(threeSpades.toString());
	}
}