package studentWork.jackson_lafferty;
import java.util.Arrays;

public class Camping {
    public static void main(String[] args) {
      String[] dogNames = new String[3];
      dogNames[0]="Baby";
      dogNames[1]="Harlow";
      dogNames[2]="Hudson";

      int[] countBabyGrowls = new int[43];
      int growlCount = babyGrowls(countBabyGrowls);

       
      double[] harlowNaps = new double[] {1.5, .75, 2.25, .5, 3, .25};
      increaseNap(harlowNaps);
      double maxNap = maxHarlowNaps(harlowNaps);
      double minNap = minHarlowNaps(harlowNaps);

      
      int[] holdHudson = new int[] {2, 3, 1};
      int holdCount = SumHudsonHold(holdHudson);
      
      System.out.println(Arrays.toString(dogNames));
      
      System.out.println("Baby growled " + growlCount + " times!");
      System.out.println("Harlow napped Minimum: " + minNap + " Maximum: " + maxNap);
      System.out.println("Hudson was held " + holdCount + " times!" );

    }
    
    
    public static int babyGrowls(int[] arrayCount) {
      for (int i = 0; i < arrayCount.length; i++) {
        arrayCount[i] = 1;
      }

      int count = 0;

      for (int num : arrayCount) {
        count += arrayCount[num];
      }

      return count;
    }
    
    public static void increaseNap(double[] arrayCount) {
      for (int i = 0; i < arrayCount.length; i++) {
        arrayCount[i] = arrayCount[i] + 0.25;
      }
    }
    

    public static double minHarlowNaps(double[] arrayCount) {
      double min = 100;

      for (int i = 0; i < arrayCount.length; i++) {
        if (arrayCount[i] < min) {
          min = arrayCount[i];
        }
      }

      return min;
    }     

    
    public static double maxHarlowNaps(double[] arrayCount) {
      double max = 0;

      for (int i = 0; i < arrayCount.length; i++) {
        if (arrayCount[i] > max) {
          max = arrayCount[i];
        }
      }
      
      return max;
    }   

    
    public static int SumHudsonHold(int[] arrayCount) {
      int count = 0;

      for (int i = 0; i < arrayCount.length; i++) {
        count = count + arrayCount[i];
      }

      return count;
    }
  }