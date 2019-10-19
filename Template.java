package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public abstract class Template {
    private static String text;
    private static String cipher;
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private static char[] ArrayText;
    private static char[] ArrayCipher;
    private static char[] ArrayAlphabet = alphabet.toCharArray();
    private static char[] ArrayEncryption;

    public void methodTemplate(){
        init();
        ArrayEncryption = crypt(text,alphabet,ArrayAlphabet);
        checkSuitability();
        getCipher();
        saveTextInFile();

    }

    public static void init(){
        System.out.print("Input the Text:");
        Scanner in = new Scanner(System.in);
        text = in.nextLine();
        System.out.println();

    }

    public static void getCipher(){
        ArrayText = text.toCharArray();
        ArrayCipher = text.toCharArray();
        for (int i = 0; i < ArrayText.length; i++){
            for (int j = 0; j < ArrayAlphabet.length;j++){
                if (ArrayText[i] == ArrayAlphabet[j]){
                    ArrayCipher[i] = ArrayEncryption[j];
                }
            }
        }

        cipher = String.valueOf(ArrayCipher);
        System.out.println("Text: " + text);
        System.out.println("Cipher: " + cipher);
    }

    public static void checkSuitability(){
        System.out.print("Enc: ");
        for (int i = 0; i < ArrayEncryption.length;i++){
            System.out.print("["+(i)+"]:"+ArrayEncryption[i] + " ");
        }
        System.out.println();
        System.out.print("Alp: ");
        for (int i = 0; i < ArrayAlphabet.length;i++){
            System.out.print("["+(i)+"]:" + ArrayAlphabet[i] + " ");
        }
        System.out.println();
    }

    public static void saveTextInFile(){
        try(FileWriter fileWriter = new FileWriter("file.txt",true)) {
            fileWriter.write("Text: " + text + "\n");
            fileWriter.write("Cipher: " + cipher + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract char[] crypt(String text, String alphabet, char[] ArrayAlphabet);
}
