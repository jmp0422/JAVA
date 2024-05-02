package com.multi.d.practice;

import javax.swing.*;
import java.awt.*;

public class ex01 {
    public static void main(String[] args) {

        JFrame j = new JFrame();
        //JFrame = 그래픽인터페이스(창)을 구성하는 클래스
        //스윙프로그램 보통 J가붙음
        j.getContentPane().setLayout(new BorderLayout(0, 0));
        //할당받은내용        보더레이아웃 세팅

        JButton btn1 = new JButton("중앙");
        j.getContentPane().add(btn1, BorderLayout.CENTER);

        JButton btn2 = new JButton("서측");
        j.getContentPane().add(btn2, BorderLayout.WEST);

        JButton btn3 = new JButton("동측");
        j.getContentPane().add(btn3, BorderLayout.EAST);

        JButton btn4 = new JButton("남쪽");
        j.getContentPane().add(btn4, BorderLayout.SOUTH);

        JButton btn5 = new JButton("북측");
        j.getContentPane().add(btn5, BorderLayout.NORTH);

        j.setSize(700, 500);
        j.setVisible(true);
    }
}
