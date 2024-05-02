package com.multi.hw0416;

import javax.swing.*;

public class Exam03 {
    public static void main(String[] args) {
        String telecom = JOptionPane.showInputDialog("통신사는 어디입니까? ");
        String phonenum = JOptionPane.showInputDialog("전화번호를 입력해주세요. ");
        String name = JOptionPane.showInputDialog("이름을 입력해주세요 ");
        String info = (name + "님은 " + telecom + "에 " + phonenum);

        System.out.println("다이얼로그로 " + info + "로 가입되셨습니다.");
    }
}
