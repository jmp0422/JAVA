package com.multi.hw0416;

import javax.swing.*;

public class Exam01 {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("사각형의 가로는? ");
        String num2 = JOptionPane.showInputDialog("사각형의 세로는? ");
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int area = n1 * n2;
        System.out.println("사각형의 넓이는 : " + area);
    }
}
