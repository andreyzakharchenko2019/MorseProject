package com.epam.zakharchenkoandrey;

import java.util.ArrayList;

public class ConvertorFromMorseToEnglish {

    private ArrayList<String> englishSentence;

    public void translate(String fullText) {

        String[] sentenceForFile = fullText.split(" ");

        for (String str : sentenceForFile) {
            System.out.println(str);
        }

        Alphabet alphabet = new Alphabet();
        ArrayList<String> englishAlphabet = alphabet.getEnglishAlphabet();
        ArrayList<String> morseAlphabet = alphabet.getMorseAlphabet();
        englishSentence = new ArrayList<>();
        for (String str : sentenceForFile) {
            int index = morseAlphabet.indexOf(str);
            if (index >= 0) {
                englishSentence.add(englishAlphabet.get(index));
            }
        }

        for (String str : englishSentence) {
            System.out.print(" " + str);
        }
    }

    public String writeToFile() {

        String sentence = "";

        for (int i = 0; i < englishSentence.size(); i++) {
            sentence = sentence + englishSentence.get(i);
        }
        return sentence;
    }
}