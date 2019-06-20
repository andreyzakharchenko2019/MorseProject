package com.epam.zakharchenkoandrey;

import java.util.ArrayList;
import java.util.Arrays;

public class Alphabet {

    public static final String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            ",", ".", "?"};

    public static final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};

    public ArrayList<String> getEnglishAlphabet() {
        ArrayList<String> englishAlphabet;
        englishAlphabet = new ArrayList<>();
        englishAlphabet.addAll(Arrays.asList(Alphabet.english));
        return englishAlphabet;
    }

    public ArrayList<String> getMorseAlphabet() {
        ArrayList<String> morseAlphabet = new ArrayList<>();
        morseAlphabet.addAll(Arrays.asList(Alphabet.morse));
        return morseAlphabet;
    }
}