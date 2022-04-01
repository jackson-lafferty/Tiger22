package Wordle;

import java.util.*;

public class Wordle {
   public static void main(String[] args) {
      playWordleGame();
   }
   
   public static void playWordleGame() {
      // Plays a game of wordle (see https://www.powerlanguage.co.uk/wordle/)
      
      System.out.println("There are " + WordLists.TARGETS.size() + " possible targets");
      
      String target = getRandomTarget();
      
      for (int i = 1; i <= 6; i++) {
         System.out.println("\nGuess " + i);
         
         String guess = getGuess();
         System.out.println("You guessed " + guess);

         if (guess.equals(target)) {
            System.out.println("You found the target word in " + i + " guesses!");
            return;
         } else {
            System.out.println("That was not the target word.");
            printGuessFeedback(guess, target);
         }
      }
      
      System.out.println("You ran out of guesses. The target word was " + target);
   }
   
   public static String getRandomTarget() {

      Random rand = new Random();

      int rng = rand.nextInt(WordLists.TARGETS.size() - 1);

      return WordLists.TARGETS.get(rng);
   }
   
   public static String getGuess() {
      Scanner console = new Scanner(System.in);
      
      while (true) {
         System.out.print("Your guess: ");
         String guess = console.nextLine().toLowerCase();
         
         if (guess.length() != 5) {
            System.out.println("Your guess must have 5 letters");
         } else if (!isRealWord(guess)) {
            System.out.println("You must enter a valid word as your guess");
         } else {
            return guess;
         }

         console.close();
      }
   }
   
   public static boolean isRealWord(String guess) {
      if (WordLists.TARGETS.indexOf(guess) == -1) {
         System.out.println("You did not enter a valid word.");
         return false;
      } else {
         return true;
      }
   }
   
   public static void printGuessFeedback(String guess, String target) {
      System.out.println("Your guess feedback is");
      int targetIndex = 0;

      for (int i = 0; i < 5; i++) {
         if (guess.charAt(i) == target.charAt(i)) {
            System.out.println(guess.charAt(i) + ": green");
            targetIndex = i;
         } else if (target.indexOf(guess.charAt(i)) != -1 && target.indexOf(guess.charAt(i)) != targetIndex) {
            System.out.println(guess.charAt(i) + ": yellow");
         } else {
            System.out.println(guess.charAt(i) + ": gray");
         }
      }
   }
}