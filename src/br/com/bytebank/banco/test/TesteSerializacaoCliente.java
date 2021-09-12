package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException {
        var cliente = new Cliente();
        cliente.setNome("Vitor Albano");
        cliente.setProfissao("Desenvolvedor");
        cliente.setCpf("00000000000");

        var oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();
    }
}
