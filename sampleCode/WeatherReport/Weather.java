package WeatherReport;

import java.util.*;

public class Weather {

    public static void main(String[] args) {
        int numStations = getNumStations();
        
        String[] stationCities = getStationCities(numStations);
        
        int numMeasurements = getNumMeasurements();   
        
        int[][] temps = generateTemperatures(numStations, numMeasurements);
        
        System.out.println("Here is the raw temperature data:");
        printRawTemps(stationCities, temps);
        
        System.out.println("The maximum temperature at the second station was");
        System.out.println(getMaxTempAtSecond(temps));
        
        System.out.println("The average temperature measured was");
        System.out.println(getAverageTemp(temps));
        
        System.out.println("The number of stations which started above 50 degrees was");
        System.out.println(getNumStartingAbove50(temps));
    }
    
    public static int getNumStations() {
        Scanner console = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the number of stations (at least 2): ");
            int num = console.nextInt();
            
            if (num >= 2) {
                return num;
            }
        } 
    }
    
    public static String[] getStationCities(int numStations) {
        String[] cities = new String[numStations];
        Scanner console = new Scanner(System.in);
        
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the name of city " + (i + 1) + ": ");
            cities[i] = console.next();
        }
        
        return cities;
    }
    
    public static int getNumMeasurements() {
        Scanner console = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the number of temperature measurements from each station (at least 5): ");
            int num = console.nextInt();
            
            if (num >= 5) {
                return num;
            }
        }
    }
    
    public static int[][] generateTemperatures(int numStations, int numMeasurements) {
        Random r = new Random();
        int temps[][] = new int[numStations][numMeasurements];

        for (int row = 0; row < numStations; row++) {
            for (int col = 0; col < numMeasurements; col++) {
                temps[row][col] = r.nextInt(20) + 45;
            }
        }

        return temps;
    }
    
    public static void printRawTemps(String[] stationCities, int[][] temps) {
        for (int i = 0; i < stationCities.length; i++) {
            System.out.print(stationCities[i] + ": ");

            for (int j = 0; j < temps[i].length; j++) {
                System.out.print(temps[i][j]);

                if (j + 1 < temps[i].length) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
    
    public static int getMaxTempAtSecond(int[][] temps) {
        int max = 0;

        for (int i = 0; i < temps[1].length; i++) {
            if (temps[1][i] > max) {
                max = temps[1][i];
            }
        }
        
        return max;
    }
    
    public static double getAverageTemp(int[][] temps) {
        double total = 0.0;
        int num = 0;

        for (int row = 0; row < temps.length; row++) {
            for (int col = 0; col < temps[row].length; col++) {
                total += temps[row][col];
                num++;
            }
        }
        
        return total / num;
    }
    
    public static int getNumStartingAbove50(int[][] temps) {
        int num = 0;

        for (int row = 0; row < temps.length; row++) {
            if (temps[row][0] > 50) {
                num += 1;
            }
        }
        
        return num;
    }
}
