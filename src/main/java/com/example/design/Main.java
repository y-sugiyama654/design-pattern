package com.example.design;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Singleton obj1 = Singleton.getSingleton();
        Singleton obj2 = Singleton.getSingleton();
        if (obj1 == obj2) {
            System.out.println("obj1とonj2は同じインスタンスです。");
        } else {
            System.out.println("obj1とonj2は同じインスタンスではありません。");
        }
        System.out.println("End");
    }
}
