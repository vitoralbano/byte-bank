package br.com.bytebank.banco.test;

import java.io.*;

public class TesteEscrita {
    public static void main (String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("teste-escrita.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the");
        bw.newLine();
        bw.write("industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type");
        bw.newLine();
        bw.write("and scrambled it to make a type specimen book. It has survived not only five centuries, but also");
        bw.write(System.lineSeparator());
        bw.write("the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s");

        bw.close();
    }
}
