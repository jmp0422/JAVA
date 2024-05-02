package com.multi.hw;

public class Calculator01 {

    static int result1;
    static int result2;

    public void countsum(int x, int y) {
        System.out.println("오늘 온 손님의 총 합은 " + (x + y) + "명 입니다.");
    }

    public void countsub(int x, int y) {
        System.out.println("손님 수 차이는 " + (x - y) + "명 입니다.");
    }

    public int priceAM(int x, int y) {
        System.out.println("오전 결제금액은 " + (x * y) + "원 입니다.");
        return result1 = x*y;
    }

    public int pricePM(int x, int y) {
        System.out.println("오후 결제금액은 " + (x * y) + "원 입니다.");
        return result2 = x*y;
    }

    public void priceresult() {
        System.out.println("오늘 총 결제금액은 " + (result1 + result2) + "원 입니다.");
    }

    public void divprice() {
        System.out.println("1인당 결제금액은 " + (result1 + result2)/9 + "원 입니다.");
    }
}
