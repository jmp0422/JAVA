package com.multi.hw;

public class Hw1 {
    public static void main(String[] args) {
        Calculator01 cal = new Calculator01();
        int price = 7000;
        int count1 = 5; //오전손님수
        int count2 = 4; //오후손님수

        cal.countsum(count1,count2);
        cal.countsub(count1,count2);
        cal.priceAM(price,count1);
        cal.pricePM(price,count2);
        cal.priceresult();
        cal.divprice();

    }
}
