package br.com.bytebank.banco.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
    public static void main (String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("teste-escrita.txt"));

        bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the");
        bw.newLine();
        bw.write("industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type");
        bw.close();
    }
}
