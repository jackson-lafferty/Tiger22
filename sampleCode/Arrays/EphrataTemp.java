package Arrays;

public class EphrataTemp {
    public static void main(String[] args) {

        int[] temp = {26, 43, 28, 30};

        int sum = 0;
        int count = 0;
        int lowCount = 0;
        int highCount = 0;

        for (int t = 0; t < temp.length; t++) {        
            sum += temp[t];
            count++;
        }

        double averageTemp = (double)sum / count;

        System.out.println("Average Daily Temperature: " + averageTemp);


        for (int i = 0; i < temp.length; i++) { //for loop that achieves similar goal
            if (temp[i] < averageTemp) {
                lowCount++;
            }
        }

        System.out.println("Days below the average temperature: " + lowCount);


        for (int i : temp) {                    //for each loop
            if (i > averageTemp) {
                highCount++;
            }
        }

        System.out.println("Days above the average temperature: " + highCount);
    }
}