package com.example.design;

import com.example.design.framework.Factory;
import com.example.design.framework.Product;
import com.example.design.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Sugiyama Yuta");
        Product card2 = factory.create("Kishida Fumio");
        Product card3 = factory.create("Suga Yoshihide");
        card1.use();
        card2.use();
        card3.use();
    }
}
