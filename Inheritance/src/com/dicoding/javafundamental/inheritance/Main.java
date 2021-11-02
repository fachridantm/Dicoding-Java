package com.dicoding.javafundamental.inheritance;

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan(); // Memanggil constructor
        System.out.println("Apakah Hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah Hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah Hewan IS-A Kucing -> " + (hewan instanceof Kucing));

        System.out.println("------------------------");

        Kucing kucing = new Kucing(); // Memanggil constructor
        System.out.println("Apakah Hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah Kucing IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah Kucing IS-A Kucing -> " + (kucing instanceof Kucing));

        System.out.println("------------------------");

        hewan.makan(); // Kucing mewarisi metode makan() dari parent class Hewan
        kucing.makan();
        kucing.makan("daging ikan");

        System.out.println("------------------------");

        Kucing meow = new Kucing("Ocicat", "tropis");
        Kucing puss = new Kucing("Ocicat", "subtropis");
        Kucing popo = new Kucing("Anggora", "subtropis");
        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());
        System.out.println("meow equals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));

        System.out.println("------------------------");

        Object o = new Kucing(); // Kucing adalah Object
        Hewan h = new Kucing(); // Kucing adalah Hewan
        Kucing k = new Kucing(); // Kucing adalah Kucing, pastinya :)

        //o.makan(); -> error, karena method makan() tidak ada di class Object
        h.makan();
        k.makan();
        Object object = k; // Bisa langsung diassign
        Hewan hewanK= k; // Bisa langsung diassign
        //object.makan(); -> error, karena method makan() tidak ada di class Object
        hewanK.makan();
        Kucing kucingK = (Kucing) h; // tidak bisa langsung diassign, perlu casting
        kucingK.makan();

        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau; // compile OK tetapi runtime error ClassCastException
    }
}
