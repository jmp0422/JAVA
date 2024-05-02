package com.multi.e_gui;

import javax.swing.*;
import java.awt.*;

public class ex03_1 {

    private static JTextField textField;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.orange);
        f.setSize(500, 500);
        f.getContentPane().setLayout(null);

        JLabel nameLabel = new JLabel("이름");
        nameLabel.setFont(new Font("굴림", Font.BOLD, 20));
        nameLabel.setBounds(25, 40, 105, 43);
        f.getContentPane().add(nameLabel);

        JTextField textField1 = new JTextField();
        textField1.setFont(new Font("굴림", Font.BOLD, 20));
        textField1.setBounds(137, 40, 284, 37);
        f.getContentPane().add(textField1);

        JLabel nameLabel1 = new JLabel("전화번호");
        nameLabel1.setFont(new Font("굴림", Font.BOLD, 20));
        nameLabel1.setBounds(25, 115, 105, 43);
        f.getContentPane().add(nameLabel1);

        JTextField textField2 = new JTextField();
        textField2.setFont(new Font("굴림", Font.BOLD, 20));
        textField2.setBounds(137, 115, 284, 37);
        f.getContentPane().add(textField2);

        JLabel nameLabel2 = new JLabel("주소");
        nameLabel2.setFont(new Font("굴림", Font.BOLD, 20));
        nameLabel2.setBounds(25, 305, 105, 43);
        f.getContentPane().add(nameLabel2);

        JTextField textField3 = new JTextField();
        textField3.setFont(new Font("굴림", Font.BOLD, 20));
        textField3.setBounds(137, 305, 284, 37);
        f.getContentPane().add(textField3);

//        JLabel nameLabel3 = new JLabel("버튼");
//        nameLabel3.setFont(new Font("굴림", Font.BOLD, 20));
//        nameLabel3.setBounds(25, 385, 105, 43);
//        f.getContentPane().add(nameLabel3);
        JButton Button1 = new JButton("확인");
        Button1.setFont(new Font("굴림", Font.BOLD, 20));
        Button1.setBounds(137, 385, 105, 37);
        f.getContentPane().add(Button1);

        JButton Button2 = new JButton("취소");
        Button2.setFont(new Font("굴림", Font.BOLD, 20));
        Button2.setBounds(237, 385, 105, 37);
        f.getContentPane().add(Button2);



        f.setVisible(true);

    }
}
