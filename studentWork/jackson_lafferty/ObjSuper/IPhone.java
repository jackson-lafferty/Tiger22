package studentWork.jackson_lafferty.ObjSuper;

public class IPhone extends CellPhone {
   public IPhone(String oN, int v) {
      super(oN, "iPhone", v);
   }
   
   public void sendText(CellPhone receiver) {
      if (receiver.getModel().equals("IPhone")) {
         System.out.println(this.getOwnerName() + " is sending a blue text to " + receiver.getOwnerName());
      } else {
         System.out.println(this.getOwnerName() + " is sending a green text to " + receiver.getOwnerName());
      }
   }
}