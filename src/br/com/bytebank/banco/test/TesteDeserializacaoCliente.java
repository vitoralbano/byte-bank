package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        var cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println("Cliente: " + cliente.getNome());
    }
}
