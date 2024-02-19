package org.example;

abstract class  Shapy {
    abstract void run();
    void running(){
        System.out.print("running");
    }


}
class Rectang extends Shapy{

    @Override
    void run() {
        System.out.println("walking");
    }


    public static  void main(String[] args){
        Rectang r1=new Rectang();
        r1.run();
        r1.running();
    }


}
