package br.com.bytebank.banco.test;

import java.io.*;

public class TesteLeitura {
    public static void main (String[] args) throws IOException {
        // Fluxo de entrada com arquivo
        InputStream fis = new FileInputStream("lorem-ipsum.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        var linha = br.readLine();

        while(linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }
}
