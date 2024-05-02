package com.multi.hw0417;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = 0;

        if (num1 > num2) {
            result = num1;
        } else if (num1 < num2) {
            result = num2;
        } else {
            System.out.println("두수가 같습니다. ");
        }
        System.out.println(num1 + "와 " + num2 + "중 더 큰값은 : " + result);
    }
}
