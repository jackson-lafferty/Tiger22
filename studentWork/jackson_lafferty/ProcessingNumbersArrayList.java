import java.util.*;

public class ProcessingNumbersArrayList {

    public static void main (String[] args) {
        System.out.println("This program allows the user to enter a bunch of integers and then:");
        System.out.println("0) Prints sum of integers entered");    //Calculate with sumall Method
        System.out.println("1) Prints smallest and largest integers entered");   //Calculate with minMax Method
        System.out.println("2) Prints sum of all even integers entered");    //Calculate with sumEven Method
        System.out.println("3) Prints largest odd integer entered");     //Calculate with largestOdd Method
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print ("How many numbers do you want to enter? ");
        int totalNumbers = scanner.nextInt();
        ArrayList <Integer> addNumbers = new ArrayList<Integer>();

        sumAll(totalNumbers, addNumbers);
        minMax(addNumbers);
        sumEven(addNumbers);
        largestOdd(addNumbers);

        scanner.close();
    }


    public static void sumAll(int totalNumbers, ArrayList<Integer> nums){

        Scanner scannerSum = new Scanner(System.in);
        int sum = 0;                                        // By using totalNumber instead
        for (int j = 1;  j <= totalNumbers;  j++) {         // of an actual number, we give
            System.out.print("#" + j + "? ");               // our program flexibility.
            int next = scannerSum.nextInt();
            sum += next;
            nums.add(next);
        }

        System.out.println ();
        System.out.println ("Your numbers add to " + sum); 
        System.out.println("Items in ArrayList = " + nums);

        scannerSum.close();
    }


    public static void minMax(ArrayList<Integer> addNumbers) {
        int min = addNumbers.get(0);
        int max = addNumbers.get(0);
        for (int i = 1; i < addNumbers.size(); i++) {
            if (addNumbers.get(i) > max) {
                max = addNumbers.get(i);
            } else if (addNumbers.get(i) < min) {
                min = addNumbers.get(i);
            }
        }

        System.out.println("Your minimum value is: " + min);
        System.out.println("Your maximum value is: " + max);
    }


    public static void sumEven(ArrayList<Integer> addNumbers) {
        int sum = 0;
        for (int i = 0; i < addNumbers.size(); i++) {
            if (addNumbers.get(i) % 2 == 0) {
                sum += addNumbers.get(i);
            }
        }
        System.out.println("The sum of even integers is: " + sum);
    }


    public static void largestOdd(ArrayList<Integer> addNumbers) {
        int odd = 0;
        for (int i = 0; i < addNumbers.size(); i++) {
            if (addNumbers.get(i) > odd && addNumbers.get(i) % 2 != 0) {
                odd = addNumbers.get(i);
            }
        }
        System.out.println("Your largest odd is: " + odd); 
    }
    
}