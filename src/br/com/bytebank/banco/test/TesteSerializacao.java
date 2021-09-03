package br.com.bytebank.banco.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException {
        String nome = "John Doe";
        var oos = new ObjectOutputStream(new FileOutputStream("nome.bin"));
        oos.writeObject(nome);
        oos.close();
    }
}
