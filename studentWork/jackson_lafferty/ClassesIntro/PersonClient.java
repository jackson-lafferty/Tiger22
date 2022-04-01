package ClassesIntro;
import java.util.*;

public class PersonClient {
   public static void main(String[] args) {     

      Person jackson = new Person();
      jackson.name = "Jackson";
      jackson.age = 16;
      jackson.pets = new String[] {"Chancellor", "Bailey", "Lucy", "Artemis", "Bella"};
      jackson.car = "2003 Mitsubishi Lancer";

      Person cummings = new Person();
      cummings.name = "Mr. Cummings";
      cummings.age = 32;
      cummings.pets = new String[] {"Zora", "Lola"};

      Person jaedon = new Person();
      jaedon.name = "Jaedon";
      jaedon.age = 16;
      jaedon.pets = new String[] {"Bentley"};

      ArrayList<Person> students = new ArrayList<Person>();
      
      jackson.printIntroduction();
      jackson.printAge();
      jackson.printPetCount();
      jackson.printPets();
      jackson.printCar();
      jackson.haveBirthday();
      jackson.printAge();

      students.add(jackson);
      students.add(cummings);
      students.add(jaedon);
      

      Person youngest = getYoungestStudent(students);

      youngest.printIntroduction();
      
   }

   public static Person getYoungestStudent(ArrayList<Person> students) {
      int ageComp = 100;
      Person youngest = students.get(0);

      for (int i = 0; i < students.size(); i++) {
         if (students.get(i).age < ageComp) {
            youngest = students.get(i);
         }
      }

      return youngest;
   }

}