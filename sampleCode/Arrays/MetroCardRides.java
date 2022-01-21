package sampleCode.Arrays;
import java.util.Arrays;

public class MetroCardRides {
    public static void main(String[] args) {

    int [] rides = {5, 4, 3, 2, 1};
    System.out.println(Arrays.toString(rides));
    
    firstToLast(rides);
    System.out.println(Arrays.toString(rides));

    lastToFirst(rides);
    System.out.println(Arrays.toString(rides));
    
    }

    public static void firstToLast(int[] list) {
        int first = list[0];

        for (int i = 0; i < list.length - 1; i++) {
            list[i] = list[i + 1];
        }

        list[list.length - 1] = first;
    }

    public static void lastToFirst(int[] list) {
        int last = list[list.length - 1];

        for (int i = 4; i > 0; i--) {
            list[i] = list[i-1];
        }

        list[0] = last;
    }
}