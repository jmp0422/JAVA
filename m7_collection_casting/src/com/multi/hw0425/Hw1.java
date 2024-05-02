package com.multi.hw0425;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hw1 {

    private static JFrame f;

    public static void main(String[] args) {
        f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.setSize(1100, 1000);
        f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        JButton red = new JButton("red");
        JButton yellow = new JButton("yellow");
        JButton green = new JButton("green");

//        red.setBounds(300, 20, 150, 100);
//        yellow.setBounds(450, 20, 150, 100);
//        green.setBounds(600, 20, 150, 100);

        red.setBackground(Color.RED);
        red.setFont(new Font("굴림", Font.BOLD, 20));
        f.getContentPane().add(red);


        yellow.setBackground(Color.YELLOW);
        yellow.setFont(new Font("굴림", Font.BOLD, 20));
        f.getContentPane().add(yellow);


        green.setBackground(Color.GREEN);
        green.setFont(new Font("굴림", Font.BOLD, 20));
        f.getContentPane().add(green);



        f.setVisible(true);


        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = e.getActionCommand();
                button(color);
            }
        });
        yellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = e.getActionCommand();
                button(color);
            }
        });
        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = e.getActionCommand();
                button(color);
            }
        });



    }

    public static void button(String color) {
        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon("img/" +color+ ".jpg");
        label.setIcon(icon);
        f.add(label);
        f.setVisible(true);
    }
}
