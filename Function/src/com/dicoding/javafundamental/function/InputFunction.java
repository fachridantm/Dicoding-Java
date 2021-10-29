package com.dicoding.javafundamental.function;

public class InputFunction {
    public static void main(String[] args) {
        // Memanggil fungsi
        hitungLuas(7, 6.5);
    }

    private static void hitungLuas(double panjang, double lebar) {
        double luas;
        luas = panjang * lebar;
        System.out.println(luas);
    }
}
