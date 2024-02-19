package org.example;

public class Account {
    private String name;
    private String email;
    private long acc_no;

    public Account(String name, String email) {
        this.name = name;
        this.email = email;
    }



    public   Account(String name, String email, long acc_no){
        this.name=name;
        this.email=email;
        this.acc_no=acc_no;
    }

    public Account(Account account2) {
        System.out.println("copy constructor");

        name=account2.name;
        email=account2.email;
    }

    public void method(int a){
        System.out.print(a);
    }
    public void method(double a){
        System.out.print(a);
    }

    public void method(int a,double b){
        System.out.print(a+" "+b);
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setAcc_no(long acc_no){
        this.acc_no=acc_no;
    }


    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;

    }

    public long getAcc_no(){
        return acc_no;
    }
}
