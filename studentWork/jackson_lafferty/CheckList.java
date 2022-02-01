package studentWork.jackson_lafferty;

import java.util.*;

public class CheckList {

   public static void main(String[] args) {
    
      ArrayList <String> checkList = new ArrayList<String>();
      
      System.out.print("Enter items you would like to add to the checklist: ");
      
      Scanner inputScanner = new Scanner(System.in);
      String inputLine = inputScanner.nextLine();
      checkList.add(inputLine);
        
        while (!inputLine.equals("quit"))
        {
            System.out.println(checkList);
            inputLine = inputScanner.nextLine();
            checkList.add(inputLine);

            if (inputLine.equals("quit")) {
                checkList.remove("quit");
            }
            
            System.out.println("Before sort, items = " + checkList);
            Collections.sort(checkList);
            System.out.println("After sort, items = " + checkList);

            sortCheckList(checkList);
            System.out.println();
        }
        inputScanner.close();
    }
      
   public static void sortCheckList (ArrayList<String> list) {
	   
        System.out.println();
        System.out.println("ForEachPrintOut");
        System.out.println("- - - - - - - -");
        Collections.sort(list);
        for (String i : list) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("ForLoopPrintOut");
        System.out.println("- - - - - - - -");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
          }
   }   
}