package pl.lublin.wsei.java.cwiczenia;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.Scanner;
import pl.lublin.wsei.java.cwiczenia.mylib.Account;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        Account acc = new Account();
        acc.setName(acc.translit("радомила"));
        System.out.println(acc.getName());

        acc.setName(acc.translit("роберта"));
        System.out.println(acc.getName());

        acc.setName(acc.translit("тита"));
        System.out.println(acc.getName());

        acc.setName(acc.translit("щанда"));
        System.out.println(acc.getName());
    }
}
