package com.example.design;

public class Director {

    private Builder builder;

    // コンストラクタ
    public Director(Builder builder) {
        this.builder = builder;
    }

    // 文書を作るメソッド
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("一般的な挨拶");
        builder.makeItems(new String[]{"How are you?", "Hello.", "Hi.",});
        builder.makeString("時間帯に応じた挨拶");
        builder.makeItems(new String[] { "Good Morning", "Good afternoon", "Good evening" });
        builder.close();
    }
}
