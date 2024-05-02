package com.multi.a_variable; //패키지명 - 소문자

import javax.swing.*;

public class Exec03 { // 클래스명 - 첫글자 대문자
    public static void main(String[] args) { //메소드 - 소문자 (함수와 비슷하다고생각하면됨) arg - 지역변수(소문자,낙타표기법)
        //낙타표기법 : MyHome  스네이크표기법 : my_home

        String name = JOptionPane.showInputDialog("이름입력");
        System.out.println("당신의 이름은 " + name + "이시군요!!");
        JOptionPane.showMessageDialog(null,"당신의 이름은 " + name + "이시군요!!");
    }
}
