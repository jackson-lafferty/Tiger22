package sampleCode.ArrayTraversal;

public class TraversalTests {
   public static void main(String[] args) {
      boolean part1 = false;
      boolean part2 = false;
      boolean part3 = false;
      boolean part4 = false;
      
      if (part1) {
         runPart1(); // put your code in the printArray() method
      }

      if (part2) {
         runPart2(); // put your code in the areArraysEqual() method
      }
      
      if (part3) {
         runPart3(); // put your code in the searchAndReplace() method
      }
      
      if (part4) {
         runPart4(); // put your code in the reverseArray() method
      }
   }
   
   public static void printArray(int[] arr) {
      if (arr.length == 0) {
         System.out.println("[]");
      } else {
         System.out.print("[" + arr[0]);
         for (int i = 1; i < arr.length; i++) {
            System.out.print(", " + arr[i]);
         } 
         System.out.println("]");     
      }
   }
   
   public static boolean areArraysEqual(int[] arr1, int[] arr2) {
      if (arr1.length != arr2.length) {
         return false;
      }
      for (int i = 0; i < arr1.length; i++) {
         if (arr1[i] != arr2[i]) {
            return false;
         }
      }
      return true;
   }
   
   public static int[] findAndReplace(int[] arr, int findValue, int replaceValue) {
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == findValue) {
            arr[i] = replaceValue;
         }
      }
      return arr;
   }
   
   public static int[] reverseArray(int[] arr) {
      /*
       * This method should reverse the order of elements in the arr.
       * Note that there are two ways you could do this:
       *    1) Create a new array that you can copy the reversed elements into.
       *    2) Swap pairs of elements in the original array without creating a new array.
       *       That is, swap the first element with the last element,
       *       the second element with the second-to-last element, etc.
       * I would suggest first implementing 1), and then working on 2) if you have more time.
       *
       * Question to think about: why might 2) be a better solution that 1)?  
       */
       
      // Your code goes below this line (suggested length: ~5 lines)
      int[] reversed = new int[arr.length];
      for (int i = 0; i < arr.length; i++){
         reversed[arr.length - i - 1] = arr[i];
      }
      return arr;
   }
   
   /*************************************************************************/
   /*                 DON'T CHANGE ANYTHING BELOW THIS BOX                  */
   /*************************************************************************/
   
   public static void runPart1() {
      System.out.println("Part 1: printArray()");
      int[] arr1 = new int[0];
      System.out.println("The array is [] and your method printed");
      printArray(arr1);
      
      int[] arr2 = {1};
      System.out.println("\n\nThe array is [1] and your method printed");
      printArray(arr2);
      
      int[] arr3 = {1, 23, 456};
      System.out.println("\n\nThe array is [1, 23, 456] and your method printed");
      printArray(arr3);
   }
   
   public static void runPart2() {
      System.out.println("\n\nPart 2: areArraysEqual()");
      int[] arr1 = {1, 23, 456};
      int[] arr2 = {0, 22, 455};
      int[] arr3 = {123, 456};
      int[] arr4 = {1, 23, 456};
      
      System.out.println("The arrays");
      printArray(arr1);
      System.out.println("and");
      printArray(arr2);
      System.out.println("are equal? " + areArraysEqual(arr1, arr2));
      
      System.out.println("\n\nThe arrays");
      printArray(arr1);
      System.out.println("and");
      printArray(arr3);
      System.out.println("are equal? " + areArraysEqual(arr1, arr3));
      
      System.out.println("\n\nThe arrays");
      printArray(arr1);
      System.out.println("and");
      printArray(arr4);
      System.out.println("are equal? " + areArraysEqual(arr1, arr4));
   }
   
   public static void runPart3() {
      System.out.println("\n\nPart 3: findAndReplace()");
      int[] arr1 = {1, 2, 3, 4, 1, 2, 0, 8, 1};
      System.out.println("The array is originally");
      printArray(arr1);
      int findValue = 1;
      int replaceValue = 55;
      System.out.println("After replacing all the " + findValue + "s with " + replaceValue + "s, the array is");
      printArray(findAndReplace(arr1, findValue, replaceValue));
      
      int[] arr2 = {1, 2, 3, 5, 6, 7, 8};
      System.out.println("\n\nThe array is originally");
      printArray(arr2);
      findValue = 4;
      replaceValue = 99;
      System.out.println("After replacing all the " + findValue + "s with " + replaceValue + "s, the array is");
      printArray(findAndReplace(arr2, findValue, replaceValue));
      
      int[] arr3 = {2, 2, 2, 2};
      System.out.println("\n\nThe array is originally");
      printArray(arr3);
      findValue = 2;
      replaceValue = 88;
      System.out.println("After replacing all the " + findValue + "s with " + replaceValue + "s, the array is");
      printArray(findAndReplace(arr3, findValue, replaceValue));
   }
   
   public static void runPart4() {
      System.out.println("\n\nPart 4: reverseArray()");
      int[] arr1 = {1, 2, 3, 4, 5};
      System.out.println("The array is originally");
      printArray(arr1);
      System.out.println("After reversing, the array is");
      printArray(reverseArray(arr1));
      
      int[] arr2 = {123};
      System.out.println("The array is originally");
      printArray(arr2);
      System.out.println("After reversing, the array is");
      printArray(reverseArray(arr2));
      
      int[] arr3 = new int[0];
      System.out.println("The array is originally");
      printArray(arr3);
      System.out.println("After reversing, the array is");
      printArray(reverseArray(arr3));
   }
}
