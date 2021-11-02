package com.dicoding.javafundamental.inheritance;

public class Hewan {
    public Hewan() {
        System.out.println("Construct Hewan");
    }

    public void makan() { // Base Method
        System.out.println("Hewan sedang makan...");
    }
//    public void makan(String food) { // overloading
//        System.out.println("Kucing makan " + food);
//    }
}
