package com.example.design;

import com.example.design.framework.Product;

public class MessageBox implements Product {
    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String s) {
        int decoLen = s.length() + 2;
        for (int i = 0; i < decoLen; i++) {
            System.out.println(decoChar);
        }
        System.out.println();
        System.out.println(decoChar + s + decoChar);
        for (int i = 0; i < decoLen; i++) {
            System.out.println(decoChar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        Product p;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return p;
    }
}
