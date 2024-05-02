package com.multi.e_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex04 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.orange);
        f.setSize(500, 500);
        f.getContentPane().setLayout(null);

        JLabel nameLabel = new JLabel("숫자1");
        nameLabel.setFont(new Font("굴림", Font.BOLD, 20));
        nameLabel.setBounds(25, 40, 105, 40);
        f.getContentPane().add(nameLabel);

        JTextField textField1 = new JTextField();
        textField1.setFont(new Font("굴림", Font.BOLD, 20));
        textField1.setBounds(125, 40, 285, 40);
        f.getContentPane().add(textField1);

        JLabel nameLabel1 = new JLabel("숫자2");
        nameLabel1.setFont(new Font("굴림", Font.BOLD, 20));
        nameLabel1.setBounds(25, 100, 105, 40);
        f.getContentPane().add(nameLabel1);

        JTextField textField2 = new JTextField();
        textField2.setFont(new Font("굴림", Font.BOLD, 20));
        textField2.setBounds(125, 100, 285, 40);
        f.getContentPane().add(textField2);


        JButton sum = new JButton("+");
        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(f, "더하기를 누르셨군요");
                //메세지앞에있는 f는 f의 창에 띄운다는뜻. null로쓰면 모니터 정중앙에나옴

                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());

                f.setTitle("더한 결과는 " + (num1 + num2));
                JOptionPane.showMessageDialog(f, (num1 + num2));

                textField1.setText("");
                textField2.setText("");


            }
        });
        sum.setForeground(Color.white);
        sum.setBackground(Color.red);
        sum.setFont(new Font("굴림", Font.BOLD, 20));
        sum.setBounds(25, 175, 100, 60);
        f.getContentPane().add(sum);

        JButton sub = new JButton("-");
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "빼기를 누르셨군요");

                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());

                f.setTitle("뺀 결과는 " + (num1 - num2));
                JOptionPane.showMessageDialog(f, (num1 - num2));

                textField1.setText("");
                textField2.setText("");


            }
        });
        sub.setForeground(Color.white);
        sub.setBackground(Color.yellow);
        sub.setFont(new Font("굴림", Font.BOLD, 20));
        sub.setBounds(135, 175, 100, 60);
        f.getContentPane().add(sub);

        JButton mul = new JButton("*");
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "곱하기를 누르셨군요");

                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());

                f.setTitle("곱한 결과는 " + (num1 * num2));
                JOptionPane.showMessageDialog(f, (num1 * num2));

                textField1.setText("");
                textField2.setText("");


            }
        });
        mul.setForeground(Color.white);
        mul.setBackground(Color.green);
        mul.setFont(new Font("굴림", Font.BOLD, 20));
        mul.setBounds(245, 175, 100, 60);
        f.getContentPane().add(mul);

        JButton div = new JButton("/");
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "나누기를 누르셨군요");

                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());

                f.setTitle("나눈 결과는 " + (num1 / num2));
                JOptionPane.showMessageDialog(f, (num1 / num2));

                textField1.setText("");
                textField2.setText("");


            }
        });
        div.setForeground(Color.white);
        div.setBackground(Color.blue);
        div.setFont(new Font("굴림", Font.BOLD, 20));
        div.setBounds(355, 175, 100, 60);
        f.getContentPane().add(div);


        JLabel imgLabel = new JLabel();
        imgLabel.setIcon(new ImageIcon("image/Image20240418151005.gif"));
        imgLabel.setBounds(25, 240, 475, 200);
        f.getContentPane().add(imgLabel);

        f.setVisible(true);
    }
}
