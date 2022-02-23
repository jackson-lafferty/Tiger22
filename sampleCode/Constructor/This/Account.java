package sampleCode.Constructor.This;

public class Account {

    private int accountNum;
    private String accountName; 

    public Account(){

        accountNum = 1;
        accountName = "Darwin Schweitzer";
    
    }

    public Account(int accountNum, String accountName){

        this.accountNum = accountNum;
        this.accountName = accountName;

    }

    public void getAccount(){
        System.out.println("Value of A = " + accountNum);
        System.out.println("Value of N = " + accountName);
    }
    
}
