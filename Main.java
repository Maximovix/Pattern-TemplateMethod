package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Caesar:");
        Caesar caesarCipher = new Caesar();
        caesarCipher.methodTemplate();
        System.out.println();
        System.out.println("Key:");
        Key key =  new Key();
        key.methodTemplate();
    }
}
