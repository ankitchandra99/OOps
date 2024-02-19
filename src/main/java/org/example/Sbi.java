package org.example;

public class Sbi extends Account{

    private int balance;

    private int mobileNo;
    public Sbi(String name, String email, long acc_no,int balance,int mobileNo) {
        super(name, email, acc_no);
        this.balance=balance;
        this.mobileNo=mobileNo;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }


    @Override
    public String getName(){
        return "hbjef";
    }

}
