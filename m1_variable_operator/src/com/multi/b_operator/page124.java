package com.multi.b_operator;


public class page124 {
    public static void main(String[] args) { //psvm,main tab시 자동생성

        int water = 2;
        int wprice = 1000;
        int mask = 3;
        int mprice = 2000;

        int result = (water*wprice) + (mask*mprice);

        System.out.println("생수값 금액 : " + (water*wprice));
        System.out.println("마스크값 금액 : " + (mask*mprice));
        System.out.println("생수값 금액 : " + result);

        for(int i=0; i<1000; i++)
            System.out.println("나는 짱");

        int korean = 75;
        int math = 50;

        int sum = korean + math;
        double avr = (double)sum / 2;

        System.out.println("총합 : " + sum + " 평균 : " + avr);

    }

}
