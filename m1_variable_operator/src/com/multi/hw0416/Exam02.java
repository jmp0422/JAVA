package com.multi.hw0416;

import javax.swing.*;

public class Exam02 {
    public static void main(String[] args) {
        String height = JOptionPane.showInputDialog("키가 몇입니까? ");
        double height1 = Double.parseDouble(height);
        double weight = (height1 - 100) * 0.9;

        System.out.println(height + "cm 이실때 적정몸무게는 " + weight + "kg입니다.");
    }
}
