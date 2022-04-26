import java.util.*;

public class Family {
    
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter how many family members you have: ");
        String family[] = new String[in.nextInt()];

        for (int i = 0; i < family.length; i++) {
            System.out.print("Enter you family member's name: ");
            family[i] = in.next();
        }

        System.out.print("Your family members are: " + family[0]);
        for (int i = 1; i < family.length; i++) {
            System.out.print(", " + family[i]);
        }

        System.out.println();
    }
}