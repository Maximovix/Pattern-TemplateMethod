package com.company;

import java.util.Scanner;

public class Key extends Template {

    @Override
    public char[] crypt(String text, String alphabet, char[] ArrayAlphabet) {
        System.out.print("Input the Key: ");
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();

        char[] ArrayKey = key.toCharArray();
        char[] ArrayEncryption = alphabet.toCharArray();

        int count = ArrayKey.length;

        for (int i = 0; i < ArrayKey.length; i++) {
            ArrayEncryption[i] = ArrayKey[i];
        }

        for (int i = 0; i < ArrayAlphabet.length; i++) {
            boolean test = true;
            for (int j = 0; j < ArrayKey.length; j++) {
                if (ArrayAlphabet[i] == ArrayKey[j]) {
                    test = false;
                    count--;
                    break;
                }
            }
            if (test) {
                ArrayEncryption[i + count] = ArrayAlphabet[i];
            }
        }
        return ArrayEncryption;
    }
}
