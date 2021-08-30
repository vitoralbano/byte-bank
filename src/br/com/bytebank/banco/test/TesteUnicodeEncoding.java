package br.com.bytebank.banco.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "Ç";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes("windows-1252");
        System.out.println(bytes.length + ", windows-1252");
        String newString = new String(bytes, "windows-1252");
        System.out.println(newString);

        bytes = s.getBytes("UTF-16");
        System.out.println(bytes.length + ", UTF-16");
        newString = newString = new String(bytes, "windows-1252");
        System.out.println(newString);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length + ", " + StandardCharsets.US_ASCII);
        newString = newString = new String(bytes, "windows-1252");
        System.out.println(newString);
    }
}