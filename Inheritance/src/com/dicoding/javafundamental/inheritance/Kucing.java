package com.dicoding.javafundamental.inheritance;

public class Kucing extends Hewan implements Mamalia {

    Mamalia mamalia = new Kucing();
    private String ras;
    private String habitat;

    public Kucing() {
//        super(); // Akan tetap memanggil constructor dari parent class
        System.out.println("Construct Kucing");
    }

    public Kucing(String ras, String habitat) {
        this.ras = ras;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Kucing ras: " + ras + ", habitat: " + habitat;
    }

    public void makan() { // Overriding
        System.out.println("Kucing sedang makan..");
    }

    public void makan(String food) { // Overloading
        System.out.println("Kucing makan " + food);
    }
}
