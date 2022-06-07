package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;

public class Account {
    private String name;

    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static final String[] translitRepl = {"a", "b", "v", "g", "d", "e", "je", "zh", "z", "y", "i", "ji", "j",
            "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "h", "c",
            "ch", "sh", "shh", "'", "ju", "ja"};

    public String translit(String arg) throws UnsupportedEncodingException {
        String outName = "";
        String nameString = new String(arg.getBytes("Cp1250"), "UTF-8");
        String ukString = new String(ukrAlphabet.getBytes("Cp1250"), "UTF-8");

        for (int i = 0; i < nameString.length(); i++) {
            for (int j = 0; j < ukString.length(); j++) {
                if(nameString.charAt(i) == ukString.charAt(j)){
                    outName += translitRepl[j];
                    break;
                }
                else if(j == ukString.length()-1 && nameString.charAt(i) != ukString.charAt(j)){
                    outName += nameString.charAt(i);
                }
            }
        }
        return outName;
    }

    public static String capitalize(String aStr) {
        String[] tokens = StringUtils.split(aStr);
        for (int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens, ' ');
    }

    public void setName(String name) {
        this.name = capitalize(name);
    }


    public String getName() {
        return name;
    }
}
