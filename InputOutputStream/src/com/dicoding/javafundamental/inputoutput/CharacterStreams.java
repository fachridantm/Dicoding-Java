package com.dicoding.javafundamental.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("D://Informatics/Dicoding/Java/InputOutputStream/latihan/latihan_inputCharacter.txt");
            out = new FileWriter("D://Informatics/Dicoding/Java/InputOutputStream/latihan/latihan_output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
