package studentWork.jackson_lafferty.ElevensLab.Activity3;
import java.util.*;

public class Shuffler {

	private static final int SHUFFLE_COUNT = 1;

	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void perfectShuffle(int[] values) {
		int[] shuffle = new int[51];
		
		int k = 0;
		for (int i = 0; i < 26; i =+ 2) {
			shuffle[k] = values[i];
			k =+ 2;
		}

		System.out.println(shuffle.toString());

		k = 1;
		for (int i = 26; i < 52; i =+ 2) {
			shuffle[k] = values[i];
			k =+ 2;
		}
	}

	public static void selectionShuffle(int[] values) {
		Random rand = new Random();
		for (int i = 51; i < 0; i--) {
			rand.nextInt(i);
			values[i] = values[rand.nextInt(i)];
		}
	}
}