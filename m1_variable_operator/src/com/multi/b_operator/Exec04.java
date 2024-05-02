package com.multi.b_operator;

public class Exec04 {
    public static void main(String[] args) { //psvm,main tab시 자동생성
        //비교연산자의 결과가 boolean(논리형!)

        // 비교연산자(==, !=, >, >=)
        // *** 비교 결과가 중요(논리형 데이터!! true/false)

        //기본형 데이터는 비교연산자를 가지고 비교 가능
        //기본형 데이터가 아니면 비교연산자를 가지고 비교 불가능
        int x = 200;
        int y = 100;
        System.out.println("일치? " + (x == y));
        System.out.println("불일치? " + (x != y));
        System.out.println("이상? " + (x >= y));
        System.out.println("초과? " + (x > y));
    }
}
