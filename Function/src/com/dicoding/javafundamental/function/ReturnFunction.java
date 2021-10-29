package com.dicoding.javafundamental.function;

public class ReturnFunction {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p, l); // Memanggil Fungsi
        System.out.println("Hasilnya adalah = " + hasil);
    }

    private static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }
}
