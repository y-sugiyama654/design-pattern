package com.example.design;

import com.example.design.framework.Manager;
import com.example.design.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 準備
        Manager manager = new Manager();
        UnderlinePen underPen = new UnderlinePen('-');
        MessageBox astBox = new MessageBox('*');
        MessageBox slaBox = new MessageBox('/');

        // 登録
        manager.register("strong message", underPen);
        manager.register("warning box", astBox);
        manager.register("sla box", slaBox);

        // 生成と使用
        Product p1 = manager.create("strong message");
        p1.use("Hello World.");

        Product p2 = manager.create("warning box");
        p2.use("Hello World.");

        Product p3 = manager.create("slash box");
        p3.use("Hello World.");
    }
}
