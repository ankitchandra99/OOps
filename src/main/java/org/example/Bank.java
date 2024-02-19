package org.example;

public interface Bank {



     void withdraw();

    //Implementation: by second user
    class Rectangle implements Bank {

        public void withdraw() {
            System.out.println("drawing rectangle");
        }
    }

    class Circle implements Bank {


        public void withdraw() {
            System.out.println("drawing circle");
        }
    }

    //Using interface: by third user
    class TestInterface1 {
        public static void main(String args[]) {

            Bank d = new Circle();//In real scenario, object is provided by method e.g. getDrawable()
            d.withdraw();
        }
    }
}