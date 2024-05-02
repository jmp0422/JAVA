package com.multi.b_app01;

public class ex06 {
    public static void main(String[] args) {
        int result = 0;
        int[] num11 = new int[990];
        int[] num22 = new int[990];
        for (int i = 0; i < 990; i++) {

            int num1 = (int) (Math.random() * 4) + 1;
            num11[i] = num1;

            int num2 = (int) (Math.random() * 4) + 1;
            num22[i] = num2;

            if (num11[i] == num22[i]) {
                result++;
            }
        }
        System.out.println(result);
    }
}
