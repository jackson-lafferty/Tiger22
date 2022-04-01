package Inheritance.Lab;

import java.util.Scanner;

public class AccountDemoClient {
   public static void main(String[] args) {

      System.out.print("Enter the Savings account number: ");
      Scanner inputAccountNum = new Scanner(System.in);
      int savingsInputNum = inputAccountNum.nextInt();
      System.out.print("Enter the Checkings account number: ");
      int checkingInputNum = inputAccountNum.nextInt();
      System.out.print("Enter the Cerificate of Deposit account number: ");
      int cdInputNum = inputAccountNum.nextInt();
      System.out.print("Enter your term (6, 12, 24, 36): ");
      int cdTerm = inputAccountNum.nextInt();

      SavingsAccount sa = new SavingsAccount(savingsInputNum, 10000);
      System.out.println("account number: " + sa.getAccountNum());
      System.out.println("account type: " + sa.getType());
      System.out.println("initial amount: " + sa.getAmount());
      sa.deposit(5000);
      System.out.println("new amount after deposit: " + sa.getAmount());

      CheckingAccount ca = new CheckingAccount(checkingInputNum, 20000);
      System.out.println("account number: " + ca.getAccountNum());
      System.out.println("account type: " + ca.getType());
      System.out.println("initial amount: " + ca.getAmount());
      ca.deposit(6000);
      System.out.println("new amount after deposit: " + ca.getAmount());
      ca.withdraw(3000);
      System.out.println("new amount after withdrawal: " + ca.getAmount());

      CdAccount cd = new CdAccount(cdInputNum, 50000);
      System.out.println("account number: " + cd.getAccountNum());
      System.out.println("account type: " + cd.getType());
      System.out.println("initial amount: " + cd.getAmount());
      cd.term(cdTerm);
      System.out.println("cd term (months): " + cd.getTerm());
      inputAccountNum.close();
   }
}