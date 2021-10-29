package com.dicoding.javafundamental.function;

public class MethodOverloading {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p, l);
        System.out.println("Hasilnya adalah = " + hasil);
        double pjg = 7;
        double lbr = 6.5;
        double hsl = hitungLuas(pjg, lbr);
        System.out.println("Hasilnya adalah = " + hsl);
    }

    private static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    private static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }
}
