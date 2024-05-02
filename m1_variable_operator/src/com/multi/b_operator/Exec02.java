package com.multi.b_operator;

import javax.swing.*;

public class Exec02 {
    public static void main(String[] args) { //psvm,main tab시 자동생성

        // 입력 2개 받아서 + - * /
        String num1 = JOptionPane.showInputDialog("숫자 입력 1");
        String num2 = JOptionPane.showInputDialog("숫자 입력 2");
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        int sum = n1 + n2;
        int sub = n1 - n2;
        int mul = n1 * n2;
        double div = (double) n1 / n2;

        System.out.println("두수더하기 : " + sum);
        System.out.println("두수빼기 : " + sub);
        System.out.println("두수곱하기 : " + mul);
        System.out.println("두수나누기 : " + div);

        for (int i = 0; i <= n2; i++) {
            System.out.println("출력 : " + i);
            if (i == n2) {
                System.out.println("숫자2는 " + n2 + "입니다.");
            }
        }


    }
}
