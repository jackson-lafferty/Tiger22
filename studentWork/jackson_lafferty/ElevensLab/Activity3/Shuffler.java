package ElevensLab.Activity3;
import java.util.*;

public class Shuffler {

	private static final int SHUFFLE_COUNT = 1;

	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");
		int[] values1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52};

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
		int[] values2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52};
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
		
		int j = 0;
		for (int i = 0; i < 26; i++) {
			shuffle[j] = values[i];
			j = j + 2;
		}

		j = 1;
		for (int i = 26; i < 51; i++) {
			shuffle[j] = values[i];
			j = j + 2;
		}

		for(int i = 0; i < 51; i ++) {
			values[i] = shuffle[i];
		}
	}

	public static void selectionShuffle(int[] values) {
		Random rand = new Random();

		for (int i = 51; i > 0; i--) {
			int rng = rand.nextInt(i);
			int num = values[i];
			
			values[i] = values[rng];
			values[rng] = num;
		}
	}
}