package br.com.bytebank.banco.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var ois = new ObjectInputStream(new FileInputStream("nome.bin"));
        var nome = (String) ois.readObject();
        ois.close();
        System.out.println(nome);
    }
}
