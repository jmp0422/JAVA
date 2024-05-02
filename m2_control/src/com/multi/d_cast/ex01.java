package com.multi.d_cast;

public class ex01 {
    public static void main(String[] args) {
        int a = 100;
        byte b = 50;

        a = b ; // int<-- byte 큰공간으로(자동형변환)

        int c = 100;
        b = (byte) c; //작은공간에 큰데이터를 넣을때 강제형변환, 명시적 형변환
        //(작은 타입 이름) 변수 ;

//        byte x = 100;
//        int y = x; // 자동형변환
//
//        int x1 = 300;
//        byte y1 = x1; //형변환불가
//
//        double x2 = 400; //8바이트
//        int y2= (int)x2; //강제형변환
//
//        int x3 = 400;
//        double y3 = x3; //자동형변환

    }
}
