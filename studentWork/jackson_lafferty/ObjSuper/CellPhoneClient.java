package ObjSuper;

public class CellPhoneClient {
   public static void main(String[] args) {
      CellPhone[] phones = {
         new IPhone("Alice", 13),
         new CellPhone("Bob", "Samsung Galaxy", 22),
         new IPhone("Charles", 13),
         new IPhone("Darcy", 11),
         new CellPhone("Emma", "Google Pixel", 6),
      };
      
      printAllPhones(phones);
      
      findEqualPhones(phones);
      
      sendTexts(phones);
      
      sendGroupTexts(phones);
      
      sendUnknownNumberTexts(phones);
   }
   
   public static void printAllPhones(CellPhone[] phones) {
      System.out.println("\nHere are the phones:");
      for (CellPhone phone : phones) {
         System.out.println(phone.toString());
      }
   }
   
   public static void findEqualPhones(CellPhone[] phones) {
      System.out.println("\nHere are the pairs of equal phones:");
      for (int i = 0; i < phones.length; i++) {
         for (int j = i + 1; j < phones.length; j++) {
            if (phones[i].equals(phones[j])) {
               System.out.println(phones[i].toString() + " and " + phones[j].toString());
            }
         }
      }
   }
   
   public static void sendTexts(CellPhone[] phones) {
      System.out.println("\nSending Text Messages:");
      for (int i = 0; i < phones.length; i++) {
         for (int j = 0; j < phones.length; j++) {
            if (i != j) {
               phones[i].sendText(phones[j]);
            }
         }
      }
   }
   
   public static void sendGroupTexts(CellPhone[] phones) {
      System.out.println("\nSending Group Text Messages:");
      for (int i = 0; i < phones.length; i++) {
         phones[i].sendText(phones);
      }
   }
   
   public static void sendUnknownNumberTexts(CellPhone[] phones) {
      System.out.println("\nSending Unknown Number Text Messages:");
      for (int i = 0; i < phones.length; i++) {
         phones[i].sendText("800-867-5309");
      }
   }
}