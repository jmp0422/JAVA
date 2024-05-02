package com.multi.b_app01;

public class ex04 {
    public static void main(String[] args) {
        String[] family = {"아버지", "어머니", "형", "나", "동생"};
        int[] age = {100, 80, 60, 40, 20};
        double[] height = {177.7, 166.6, 170.7, 180.8, 150};

        for(int i =0; i<family.length; i++)
            System.out.println(family[i] + "\t" + age[i] + "\t" + height[i]);
    }
}
