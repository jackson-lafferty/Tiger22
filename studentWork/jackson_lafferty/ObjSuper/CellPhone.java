package studentWork.jackson_lafferty.ObjSuper;

public class CellPhone {
   private String ownerName;
   private String model;
   private int version;
   
   public CellPhone(String oN, String m, int v) {
      ownerName = oN;
      model = m;
      version = v;
   }
   
   public String getOwnerName() {
      return ownerName;
   }
   
   public String getModel() {
      return model;
   }
   
   public int getVersion() {
      return version;
   }
   
   public String toString() {
      return getOwnerName() + "'s " + "(" + getModel() + " " + getVersion() + ")";
   }
   
   public boolean equals(Object obj) {
      CellPhone objAsCellPhone = (CellPhone) obj;
      return model.equals(objAsCellPhone.model) && version == objAsCellPhone.version;
   }
   
   public void sendText(CellPhone receiver) {
      System.out.println(ownerName + " is sending a text to " + receiver.getOwnerName());
   }

   public void sendText(CellPhone[] phones) {
         System.out.println(ownerName + " is sending a text to a group with members: ");
            for (CellPhone phone : phones) {
               System.out.println(phone.ownerName);
            }
   }

   public void sendText(String num) {
      System.out.println(ownerName + " is sending a text to an unknown number: " + num);
   }

}