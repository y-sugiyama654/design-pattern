package com.example.design;

import com.example.design.framework.Product;

public class UnderlinePen implements Product {

    private char underChar;

    public UnderlinePen(char underChar) {
        this.underChar = underChar;
    }

    @Override
    public void use(String s) {
        int underLength = s.length();
        System.out.println(s);
        for (int i = 0; i < underLength; i++) {
            System.out.println(underChar);
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
