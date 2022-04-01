package ClassesIntro;


public class Person {

   String name;
   int age;
   String[] pets;
   String car;
   
   public void printIntroduction() {
      System.out.println("Hi, my name is " + name + ".");
   }
   
   public void printAge() {
      System.out.println("I am " + age + " years old.");
   }
   
   public void haveBirthday() {
      age++;
      System.out.println("I just had my birthday.");
   }
   
   public void printPetCount() {
      System.out.println("I have " + pets.length + " pets.");
   }

   public void printPets() {
      System.out.println("My pet's names are: ");

      for (int i = 0; i < pets.length; i++) {
         System.out.println(pets[i]);
      }
   }

   public void printCar() {
      System.out.println("I drive a " + car);
   }
   
}