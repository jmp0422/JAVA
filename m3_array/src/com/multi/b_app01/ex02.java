package com.multi.b_app01;

import java.util.Random;

public class ex02 {
    public static void main(String[] args) {
        int[] num = new int[6];
        Random ran = new Random();

        for (int i = 0; i < num.length; i++) {
            num[i] = ran.nextInt(45) + 1;
            System.out.println(num[i]);
        }
        //for(int i : num)
        //System.out.println(i);
    }
}
