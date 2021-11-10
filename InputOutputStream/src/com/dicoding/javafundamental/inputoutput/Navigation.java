package com.dicoding.javafundamental.inputoutput;

import java.io.File;

public class Navigation {
    public static void main(String[] args) {
        String dirname = "D://Informatics/Dicoding/Java/InputOutputStream/latihan";
        File file;
        String[] paths;

        try {
            // Instansiasi objek File
            file = new File(dirname);
            // Buat directory
            file.mkdir();
            // Ambil list files dan masukkan ke string paths
            paths = file.list();
            // Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
