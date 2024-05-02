package com.multi.b_operator;

public class Exec03 {
    public static void main(String[] args) { //psvm,main tab시 자동생성

        int x = 200;
        int y = 100;

        int sum = x + y;
        System.out.println("두 수의 합은 " + sum);

        double div = (double) y / x;
        System.out.println("두 수의 나눗셈 " + div);


        double div1 = (double) (y / x);
        System.out.println("두 수의 나눗셈 " + div1);

    }
}
