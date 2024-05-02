package com.multi.a_variable; //패키지명 - 소문자

public class Exec01 { // 클래스명 - 첫글자 대문자
    public static void main(String[] args) { //메소드 - 소문자 (함수와 비슷하다고생각하면됨) arg - 지역변수(소문자,낙타표기법)
        //낙타표기법 : MyHome  스네이크표기법 : my_home

        int myAge = 100;
        String myTel = "011";
        String ssn = "980422";

        myAge = Integer.parseInt("100");
        System.out.println(myAge);


        final String COMPANY = "멀티"; //상수 final + 대문자
    }
}
