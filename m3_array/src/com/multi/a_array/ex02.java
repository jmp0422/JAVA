package com.multi.a_array;

public class ex02 {
    public static void main(String[] args) {
        int[] score = new int[1000]; // 1000개의 공간 score은 score[999]까지밖에없음

        score[0] = 100;
        score[10] = 200;
        score[999] = 1000;
        System.out.println("1번째 값 : " + score[0]);
        System.out.println("10번째 값 : " + score[10]);
        System.out.println("999번째 값 : " + score[999]);
//        System.out.println("1000번째 값 : " + score[1000]); 1000개의 공간에서 0부터시작했기때문에 마지막은 999번째다. 1000번째는없다

        String[] result = {"111", "222", "333", "444", "555"};
        for (String r : result)
            System.out.println(r);

        for (int i = 0; i < result.length ; i++)
            System.out.println(result[i]);

        char[] c = new char[10];
        System.out.println(c);


    }
}
