package com.multi.b_poly;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrder {

    private static int count;
    private static final int PRICE = 5000;
    private static JTextField t1 ;
    private static JLabel result ;
    private static JLabel center ;





    public static void main(String[] args) {


        JFrame f = new JFrame("음식점 주문 화면");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.GREEN);
        f.setSize(823, 574);
        f.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("개수:");
        lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
        lblNewLabel.setBounds(489, 37, 68, 46);


        t1 = new JTextField();
        t1.setBackground(Color.YELLOW);
        t1.setFont(new Font("굴림", Font.BOLD, 40));
        t1.setBounds(556, 32, 239, 44);
        t1.setColumns(10);


        center = new JLabel("");
        ImageIcon img = new ImageIcon("img/짜장.jpg");
        center.setIcon(img);
        center.setBounds(124, 96, 559, 368);

        result = new JLabel("결제금액");
        result.setForeground(Color.RED);
        result.setFont(new Font("굴림", Font.BOLD, 30));
        result.setBounds(124, 464, 555, 61);

        JButton btnNewButton = new JButton("짬뽕");
        btnNewButton.addActionListener(new ActionListener() { //클릭했을때 작동
            @Override
            public void actionPerformed(ActionEvent e) {
//                count++; //카운트
//                ImageIcon img = new ImageIcon("img/짬뽕.jpg"); //이미지변경
//                center.setIcon(img);
//                t1.setText(count + "개"); // 카운트증가
//                result.setText("결제금액 " + count*PRICE + "원"); //결제금액증가
                //String bt0 = btnNewButton.getText();

                setResult(e);
            }
        });

        btnNewButton.setBackground(Color.MAGENTA);
        btnNewButton.setFont(new Font("굴림", Font.BOLD, 27));
        btnNewButton.setBounds(12, 10, 142, 66);

        JButton btnNewButton_1 = new JButton("우동");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                count++;
//                ImageIcon img = new ImageIcon("img/우동.jpg");
//                center.setIcon(img);
//                t1.setText(count + "개");
//                result.setText("결제금액 " + count*PRICE + "원");
                setResult(e);
            }
        });
        btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 27));
        btnNewButton_1.setBackground(Color.ORANGE);
        btnNewButton_1.setBounds(166, 10, 142, 66);

        JButton btnNewButton_2 = new JButton("짜장");
        btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                count++;
//                ImageIcon img = new ImageIcon("img/짜장.jpg");
//                center.setIcon(img);
//                t1.setText(count + "개");
//                result.setText("결제금액 " + count*PRICE + "원");
                setResult(e);
            }
        });
        btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 27));
        btnNewButton_2.setBackground(Color.CYAN);
        btnNewButton_2.setBounds(320, 10, 142, 66);


        f.getContentPane().add(lblNewLabel);
        f.getContentPane().add(t1);
        f.getContentPane().add(center);
        f.getContentPane().add(result);
        f.getContentPane().add(btnNewButton);
        f.getContentPane().add(btnNewButton_1);
        f.getContentPane().add(btnNewButton_2);

        f.setVisible(true);
    }
    public static void setResult(ActionEvent e){
        count++; //카운트
        String name = e.getActionCommand();
        ImageIcon img = new ImageIcon("img/" + name + ".jpg"); //이미지변경
        center.setIcon(img);
        t1.setText(count + "개"); // 카운트증가
        result.setText("결제금액 " + count*PRICE + "원");
    }

}

// 1. public 변수 선언
// JLable이나 JTextFeild도 가능함
// 2. 기존 JLable과같은 Public재선언한 변수들을 변경
// 3. 메소드 설정 main밖에설정
// 4. getActionCommand사용 =본문내용참고
