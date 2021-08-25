package br.com.bytebank.banco.test.util;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrint {
    public static void main (String[] args) throws FileNotFoundException {
//        PrintStream writer = new PrintStream("teste-escrita.txt");
        PrintWriter writer = new PrintWriter("teste-escrita.txt");

        writer.println("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the");
        writer.println();
        writer.println("industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type");
        writer.close();
    }
}
