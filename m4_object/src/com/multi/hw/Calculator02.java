package com.multi.hw;

public class Calculator02 {

    static int result1;
    static int result2;


    public int coffeesum(int x, int y) {
        System.out.println((x * y) + "원 입니다.");
        return result1 = x*y;
    }

    public int milksum(int x, int y) {
        System.out.println((x * y) + "원 입니다.");
        return result2 = x*y;
    }

    public double div(double x) {
        System.out.println("1인당 결제금액은 " + (result1 + result2) / x + "원 입니다.");
        return (result1+result2)/x;
    }

    public void total() {
        System.out.println("총 결제금액은 " + (result1 + result2) + "원 입니다.");
    }
}