package org.example;

public class Main {
    public static void main(String[] args) {


        Account account=new Account("ankit","bjhdsbjw");
        Account account2=new Account("ankit","bjhdsbjw",4694L);
        Account a3=new Account(account2);
        Account a4=new Account(account);
        System.out.println(a4.getEmail());

        System.out.println(account.getName()+"       "+account.getEmail()+"        "+account2.getAcc_no());

        Sbi s1=new Sbi("chandra","hwjb",56466,988464846,65655656);

        s1.setEmail("ebbjhekjeq");

        System.out.println(s1.getEmail()+"   ");

        System.out.println(s1.getName());



    }
}