package com.multi.c_static;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {

    public static int num;
    public static String numSt;

    public static void main(String[] args) {

        JFrame f = new JFrame("나의 카운터 프로그램");
        f.setSize(400, 300);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel number = new JLabel("0");
        number.setForeground(Color.red);
        number.setFont(new Font("궁서", Font.BOLD, 150));

        JButton plus = new JButton("1더하기");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(number.getText());
                num++;
                number.setText(num + "");
            }
        });
        JButton reset = new JButton("0으로 초기화");
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number.setText("0");
            }
        });
        JButton minus = new JButton("1빼기");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(number.getText());
                num--;
                number.setText(num + "");
            }
        });
        Font font = new Font("궁서", Font.BOLD, 15);
        plus.setFont(font);
        reset.setFont(font);
        minus.setFont(font);


        f.add(plus);
        f.add(reset);
        f.add(minus);
        f.add(number);


        f.setVisible(true);

    }

}
