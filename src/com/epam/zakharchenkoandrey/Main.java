package com.epam.zakharchenkoandrey;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("C:\\Users\\Sergey_Stefoglo\\Desktop\\TheFirstFile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String fullTextFromFile;
        fullTextFromFile = bufferedReader.readLine();
        bufferedReader.close();
        System.out.println(fullTextFromFile);

        ConvertorFromMorseToEnglish convertor = new ConvertorFromMorseToEnglish();
        convertor.translate(fullTextFromFile);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Sergey_Stefoglo\\Desktop\\TranslateFile.txt")));
        bufferedWriter.write(convertor.writeToFile());
        bufferedWriter.close();

//        FileReader fileReader = new FileReader("C:\\Users\\Sergey_Stefoglo\\Desktop\\TheFirstFile.txt");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String fullTextFromFile;
//        fullTextFromFile = bufferedReader.readLine();
//        bufferedReader.close();
//        System.out.println(fullTextFromFile);
//
//        String[] ary = fullTextFromFile.split("");
    }
}