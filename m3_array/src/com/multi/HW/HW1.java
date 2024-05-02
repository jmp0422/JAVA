package com.multi.HW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HW1 {
    static int now = 0;

    public static void main(String[] args) {
        String[] images = {"다만.png", "오케이.png", "테넷.png", "짱구.png", "해적.png"};
        double[] rates = {17.79, 16.61, 18.88, 19.99, 25.65};

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("현재 상영작");
        f.getContentPane().setBackground(Color.PINK);
        f.setSize(800, 1000);
        f.getContentPane().setLayout(null);

        JLabel title2 = new JLabel("현재 상영작");
        title2.setFont(new Font("굴림", Font.BOLD, 35));
        title2.setBounds(25, 5, 200, 70);
        f.getContentPane().add(title2);

        JLabel img = new JLabel();
        // 이미지 아이콘을 생성할 때 크기를 지정하여 ImageIcon 생성
        ImageIcon icon = new ImageIcon("img/" + images[now]);
        Image image = icon.getImage(); // 이미지 아이콘으로부터 이미지 추출
        Image newImage = image.getScaledInstance(520, 700, Image.SCALE_SMOOTH); // 이미지 크기 조정
        img.setIcon(new ImageIcon(newImage)); // 조정된 이미지로 JLabel 설정
        img.setBounds(250, 15, 600, 700);
        f.getContentPane().add(img);

        JLabel title3 = new JLabel("예매율");
        title3.setFont(new Font("굴림", Font.BOLD, 35));
        title3.setBounds(250, 800, 200, 70);
        f.getContentPane().add(title3);

        JTextField rate = new JTextField();
        rate.setBackground(Color.white);
        rate.setFont(new Font("굴림", Font.BOLD, 35));
        rate.setBounds(400, 800, 350, 70);
        f.getContentPane().add(rate);

        JButton bt1 = new JButton("다만");
        bt1.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                now = 0;
                rate.setText(rates[now] + "");
                ImageIcon icon = new ImageIcon("img/"+ images[now]);
                Image image = icon.getImage();
                Image newImage = image.getScaledInstance(520, 700, Image.SCALE_SMOOTH);
                img.setIcon(new ImageIcon(newImage));
            }
        }));
        bt1.setBackground(new Color(20, 59, 20));
        bt1.setForeground(Color.white);
        bt1.setBounds(25, 100, 200, 100);
        bt1.setFont(new Font("굴림", Font.BOLD, 40));
        f.getContentPane().add(bt1);

        JButton bt2 = new JButton("오케이");
        bt2.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                now = 1;
                rate.setText(rates[now] + "");
                ImageIcon icon = new ImageIcon("img/"+ images[now]);
                Image image = icon.getImage();
                Image newImage = image.getScaledInstance(520, 700, Image.SCALE_SMOOTH);
                img.setIcon(new ImageIcon(newImage));
            }
        }));
        bt2.setBackground(new Color(20, 59, 20));
        bt2.setForeground(Color.white);
        bt2.setBounds(25, 220, 200, 100);
        bt2.setFont(new Font("굴림", Font.BOLD, 40));
        f.getContentPane().add(bt2);


        JButton bt3 = new JButton("테넷");
        bt3.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                now = 2;
                rate.setText(rates[now] + "");
                ImageIcon icon = new ImageIcon("img/"+ images[now]);
                Image image = icon.getImage();
                Image newImage = image.getScaledInstance(520, 700, Image.SCALE_SMOOTH);
                img.setIcon(new ImageIcon(newImage));
            }
        }));
        bt3.setBackground(new Color(20, 59, 20));
        bt3.setForeground(Color.white);
        bt3.setBounds(25, 340, 200, 100);
        bt3.setFont(new Font("굴림", Font.BOLD, 40));
        f.getContentPane().add(bt3);

        JButton bt4 = new JButton("짱구");
        bt4.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                now = 3;
                rate.setText(rates[now] + "");
                ImageIcon icon = new ImageIcon("img/"+ images[now]);
                Image image = icon.getImage();
                Image newImage = image.getScaledInstance(520, 700, Image.SCALE_SMOOTH);
                img.setIcon(new ImageIcon(newImage));
            }
        }));
        bt4.setBackground(new Color(20, 59, 20));
        bt4.setForeground(Color.white);
        bt4.setBounds(25, 460, 200, 100);
        bt4.setFont(new Font("굴림", Font.BOLD, 40));
        f.getContentPane().add(bt4);

        JButton bt5 = new JButton("해적");
        bt5.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                now = 4;
                rate.setText(rates[now] + "");
                ImageIcon icon = new ImageIcon("img/"+ images[now]);
                Image image = icon.getImage();
                Image newImage = image.getScaledInstance(520, 700, Image.SCALE_SMOOTH);
                img.setIcon(new ImageIcon(newImage));
            }
        }));
        bt5.setBackground(new Color(20, 59, 20));
        bt5.setForeground(Color.white);
        bt5.setBounds(25, 580, 200, 100);
        bt5.setFont(new Font("굴림", Font.BOLD, 40));
        f.getContentPane().add(bt5);



        f.setVisible(true);
    }
}

