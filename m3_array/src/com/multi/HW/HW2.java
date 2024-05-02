package com.multi.HW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HW2 {
    static int menu1 = 0;
    static int menu2 = 0;
    static int menu3 = 0;
    static int now = 0;

    public static void main(String[] args) {
        String[] images = {"짬뽕.jpg", "우동.jpg", "짜장.jpg"};

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(98, 164, 98));
        f.setSize(800, 1000);
        f.getContentPane().setLayout(null);

        JLabel img = new JLabel();
        // 이미지 아이콘을 생성할 때 크기를 지정하여 ImageIcon 생성
        ImageIcon icon = new ImageIcon("img/" + images[now]);
        Image image = icon.getImage(); // 이미지 아이콘으로부터 이미지 추출
        Image newImage = image.getScaledInstance(750, 700, Image.SCALE_SMOOTH); // 이미지 크기 조정
        img.setIcon(new ImageIcon(newImage)); // 조정된 이미지로 JLabel 설정
        img.setBounds(20, 100, 750, 700);
        f.getContentPane().add(img);

        JLabel sum = new JLabel("개수");
        sum.setFont(new Font("굴림", Font.BOLD, 25));
        sum.setBounds(460, 50, 60, 30);
        f.getContentPane().add(sum);


        JTextField menu0 = new JTextField
                ("짬뽕 :" + menu1 + " 우동 : " + menu2 + " 짜장 :" + menu3 + " -> " + (menu1 + menu2 + menu3) + "개");
        menu0.setForeground(Color.blue);
        menu0.setBounds(510, 20, 265, 60);
        menu0.setFont(new Font("굴림", Font.BOLD, 18));
        f.getContentPane().add(menu0);

        JLabel price0 = new JLabel("지불할 총 금액");
        price0.setFont(new Font("굴림", Font.BOLD, 35));
        price0.setBounds(100, 870, 250, 40);
        f.getContentPane().add(price0);

        JTextField price = new JTextField(
                (menu1*10000)+(menu2*8000)+(menu3*7500) + "원"
        );
        price.setBackground(Color.white);
        price.setFont(new Font("굴림", Font.BOLD, 35));
        price.setBounds(350, 850, 400, 80);
        f.getContentPane().add(price);

        JButton bt1 = new JButton("짬뽕");
        bt1.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu1++;
                now = 0;
                ImageIcon icon = new ImageIcon("img/" + images[now]);
                Image image = icon.getImage();
                Image newImage = image.getScaledInstance(750, 700, Image.SCALE_SMOOTH);
                img.setIcon(new ImageIcon(newImage));
                menu0.setText("짬뽕 :" + menu1 + " 우동 : " + menu2 + " 짜장 :" + menu3 + " -> " + (menu1 + menu2 + menu3) + "개"); // 메뉴 개수 업데이트
                price.setText((menu1*10000)+(menu2*8000)+(menu3*7500) + "원"); // 총 금액 업데이트
            }
        }));
        bt1.setBackground(new Color(230, 154, 221));
        bt1.setForeground(Color.black);
        bt1.setBounds(20, 20, 130, 60);
        bt1.setFont(new Font("굴림", Font.BOLD, 25));
        f.getContentPane().add(bt1);

        JButton bt2 = new JButton("우동");
        bt2.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu2++;
                now = 1;
                ImageIcon icon = new ImageIcon("img/" + images[now]);
                Image image = icon.getImage();
                Image newImage = image.getScaledInstance(750, 700, Image.SCALE_SMOOTH);
                img.setIcon(new ImageIcon(newImage));
                menu0.setText("짬뽕 :" + menu1 + " 우동 : " + menu2 + " 짜장 :" + menu3 + " -> " + (menu1 + menu2 + menu3) + "개"); // 메뉴 개수 업데이트
                price.setText((menu1*10000)+(menu2*8000)+(menu3*7500) + "원"); // 총 금액 업데이트
            }
        }));
        bt2.setBackground(new Color(240, 229, 124));
        bt2.setForeground(Color.black);
        bt2.setBounds(170, 20, 130, 60);
        bt2.setFont(new Font("굴림", Font.BOLD, 25));
        f.getContentPane().add(bt2);

        JButton bt3 = new JButton("짜장");
        bt3.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu3++;
                now = 2;
                ImageIcon icon = new ImageIcon("img/" + images[now]);
                Image image = icon.getImage();
                Image newImage = image.getScaledInstance(750, 700, Image.SCALE_SMOOTH);
                img.setIcon(new ImageIcon(newImage));
                menu0.setText("짬뽕 :" + menu1 + " 우동 : " + menu2 + " 짜장 :" + menu3 + " -> " + (menu1 + menu2 + menu3) + "개"); // 메뉴 개수 업데이트
                price.setText((menu1*10000)+(menu2*8000)+(menu3*7500) + "원"); // 총 금액 업데이트
            }
        }));
        bt3.setBackground(new Color(127, 97, 246));
        bt3.setForeground(Color.black);
        bt3.setBounds(320, 20, 130, 60);
        bt3.setFont(new Font("굴림", Font.BOLD, 25));
        f.getContentPane().add(bt3);

        f.setVisible(true);
    }
}
