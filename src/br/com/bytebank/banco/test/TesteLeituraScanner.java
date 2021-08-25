package br.com.bytebank.banco.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("contas.csv"));

        while(scanner.hasNextLine()) {
            String linha = scanner.nextLine();

            Scanner scannerLinha = new Scanner(linha);
            scannerLinha.useLocale(Locale.US);
            scannerLinha.useDelimiter(",");

            String valorTipoConta = scannerLinha.next();
            int valorAgencia = scannerLinha.nextInt();
            int valorConta = scannerLinha.nextInt();
            String valorTitular = scannerLinha.next();
            double valorSaldo = scannerLinha.nextDouble();

            System.out.println(
                    String.format(
                            "Tipo conta: %s, Agência: %d, Conta: %d, Titular: %s, Saldo: %.2f.",
                            valorTipoConta,
                            valorAgencia,
                            valorConta,
                            valorTitular,
                            valorSaldo
                    )
            );
            scannerLinha.close();
        }

        scanner.close();
    }
}
