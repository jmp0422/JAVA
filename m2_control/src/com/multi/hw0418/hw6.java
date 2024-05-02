package com.multi.hw0418;

import javax.swing.*;
import java.awt.*;

public class hw6 {


    public static void main(String[] args) {


        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.gray);
        f.setSize(1000, 1000);
        f.getContentPane().setLayout(null);




        JLabel nameLabel = new JLabel("연예인 인기투표");
        nameLabel.setFont(new Font("굴림", Font.BOLD, 50));
        nameLabel.setBounds(300, 50, 800, 50);
        f.getContentPane().add(nameLabel);

        JLabel imgLabel1 = new JLabel();
        imgLabel1.setIcon(new ImageIcon("src/com/multi/hw0418/img/IU.jpg"));
        imgLabel1.setBounds(150,100,300,300);
        f.getContentPane().add(imgLabel1);

        JLabel imgLabel2 = new JLabel();
        imgLabel2.setIcon(new ImageIcon("src/com/multi/hw0418/img/YOU.jpg"));
        imgLabel2.setBounds(150,350,300,300);
        f.getContentPane().add(imgLabel2);

        JLabel imgLabel3 = new JLabel();
        imgLabel3.setIcon(new ImageIcon("src/com/multi/hw0418/img/BTS.jpg"));
        imgLabel3.setBounds(150,600,300,300);
        f.getContentPane().add(imgLabel3);

        JLabel subtitle1 = new JLabel(" 1번 아이유 ");
        subtitle1.setFont(new Font("굴림", Font.BOLD, 35));
        subtitle1.setBounds(600,120,400,100);
        f.getContentPane().add(subtitle1);

        JLabel subtitle2 = new JLabel(" 2번 유재석 ");
        subtitle2.setFont(new Font("굴림", Font.BOLD, 35));
        subtitle2.setBounds(600,370,400,100);
        f.getContentPane().add(subtitle2);

        JLabel subtitle3 = new JLabel(" 3번 방탄소년단 ");
        subtitle3.setFont(new Font("굴림", Font.BOLD, 35));
        subtitle3.setBounds(600,620,400,100);
        f.getContentPane().add(subtitle3);

        int iu = 0;
        int you = 0;
        int bts = 0;



        while (true) {
            String choice = JOptionPane.showInputDialog("1.아이유, 2.유재석, 3.방탄소년단, 4.종료");


            if (choice.equals("4")){
                JOptionPane.showMessageDialog(f, "투표를 종료합니다");
                JOptionPane.showMessageDialog(f, "iu표 : >>" + iu);
                JOptionPane.showMessageDialog(f, "you표 : >>" + you);
                JOptionPane.showMessageDialog(f, "bts표 : >>" + bts);
                break;
            } else if (choice.equals("1")) {
                iu++;
            } else if (choice.equals("2")) {
                you++;
            } else if (choice.equals("3")) {
                bts++;
            }

        }

        JLabel subtitle4 = new JLabel(" 아이유 표 : " + iu);
        subtitle4.setFont(new Font("굴림", Font.BOLD, 25));
        subtitle4.setBounds(600,200,400,100);
        f.getContentPane().add(subtitle4);

        JLabel subtitle5 = new JLabel(" 유재석 표 : " + you);
        subtitle5.setFont(new Font("굴림", Font.BOLD, 25));
        subtitle5.setBounds(600,450,400,100);
        f.getContentPane().add(subtitle5);

        JLabel subtitle6 = new JLabel(" 방탄소년단 표 : " + bts);
        subtitle6.setFont(new Font("굴림", Font.BOLD, 25));
        subtitle6.setBounds(600,700,400,100);
        f.getContentPane().add(subtitle6);





        f.setVisible(true);

    }
}
