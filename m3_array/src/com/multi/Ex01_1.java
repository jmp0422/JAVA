package com.multi;

public class Ex01_1 {
    public static void main(String[] args) {

        // 참조형복사(주소가 복사, 얕은복사)
        int[] n1 = { 100, 200, 300 };
        int[] n2 = n1;//얕은복사 주소값을 복제해줌
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);

        for(int i=0; i<3; i++){
            System.out.println(n2[i]);
        }
        n2[1] = 50;
        for(int i=0; i<3; i++){
            System.out.println(n2[i]);
        }
        n1[1] = 50;
        for(int i=0; i<3; i++){
            System.out.println(n1[i]);
        }
    }
}
