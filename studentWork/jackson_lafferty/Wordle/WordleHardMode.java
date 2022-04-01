package Wordle;

import java.util.*;

public class WordleHardMode {
   static Scanner console = new Scanner(System.in);
   public static void main(String[] args) {
      playWordleHardGame();
   }
   
   public static void playWordleHardGame() {
      
      System.out.println("There are " + WordLists.TARGETS.size() + " possible targets");
      
      String target = getRandomTarget();
      System.out.println(target);
      
      ArrayList<Character> grayLetters = new ArrayList<Character>();
      
      for (int i = 1; i <= 6; i++) {
         System.out.println("\nGuess " + i);
         
         System.out.print("Your current gray letters are: ");
         printGrayLetters(grayLetters);
         
         String guess = getGuess(grayLetters);
         System.out.println("You guessed " + guess);
         
         if (target.equals(guess)) {
            System.out.println("You found the target word in " + i + " guesses!");
            return;
         } else {
            System.out.println("That was not the target word.");
            printGuessFeedback(guess, target, grayLetters);
         }
      }
      
      System.out.println("You ran out of guesses. The target word was " + target);
   }
   
   public static String getRandomTarget() {
      Random rand = new Random();
      String target = WordLists.TARGETS.get(rand.nextInt(WordLists.TARGETS.size() - 1));
      return target;
   }
   
   public static void printGrayLetters(ArrayList<Character> grayLetters) {
      System.out.println(grayLetters.toString());
   }
   
   public static String getGuess(ArrayList<Character> grayLetters) {
      while (true) {
         System.out.print("Your guess: ");
         String guess = console.nextLine().toLowerCase();
         
         if (guess.length() != 5) {
            System.out.println("Your guess must have 5 letters");
         } else if (!isRealWord(guess)) {
            System.out.println("You must enter a real word as your guess");
         } else if (usesGrayLetter(guess, grayLetters)) {
            System.out.println("Your guess cannot contain any gray letters");
         } else {
            return guess;
         }
      }
   }
   
   public static boolean isRealWord(String guess) {
      if (WordLists.TARGETS.indexOf(guess.toLowerCase()) == -1) {
         return false;
      }
      return true;
   }
   
   public static boolean usesGrayLetter(String guess, ArrayList<Character> grayLetters) {
      for (int i = 0; i < guess.length(); i++) {
         if (grayLetters.indexOf(guess.charAt(i)) != -1) {
            return true;
         }
      }
      return false;
   }
   
   public static void printGuessFeedback(String guess, String target, ArrayList<Character> grayLetters) {
      System.out.println("Your guess feedback is");

      for (int i = 0; i < 5; i++) {
         if (guess.charAt(i) == target.charAt(i)) {
            System.out.println(guess.charAt(i) + ": green");
         } else if (target.indexOf(guess.charAt(i)) != -1) {
            System.out.println(guess.charAt(i) + ": yellow");
         } else {
            System.out.println(guess.charAt(i) + ": gray");
            grayLetters.add(guess.charAt(i));
         }
      }
   }
}