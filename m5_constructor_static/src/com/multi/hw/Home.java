package com.multi.hw;

public class Home {
    public static void main(String[] args) {
        Daugther dau1 = new Daugther("홍길순","여");
        Daugther dau2 = new Daugther("홍길진","여");

        System.out.println(dau1);
        System.out.println(dau2);
        System.out.println(Daugther.count);
        System.out.println(Daugther.money);
        Daugther.WatchTv();

    }
}
