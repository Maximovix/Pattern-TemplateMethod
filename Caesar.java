package com.company;

import java.util.Scanner;

public class Caesar extends Template {

    @Override
    public char[] crypt(String text, String alphabet, char[]ArrayAlphabet) {
        char[] ArrayEncryption = alphabet.toCharArray();

        System.out.print("Input the Shift: ");
        Scanner in = new Scanner(System.in);
        int shift = in.nextInt();
        System.out.println();

        while (shift > ArrayAlphabet.length){
            shift = shift - ArrayAlphabet.length;
        }

        while (shift < 0){
            shift = ArrayAlphabet.length + shift;
        }

        for (int i = 0; i < ArrayEncryption.length; i++){
            if (shift == ArrayEncryption.length){
                shift = 0;
            }
            ArrayEncryption[shift] = ArrayAlphabet[i];
            shift++;
        }
        return ArrayEncryption ;
    }
}
