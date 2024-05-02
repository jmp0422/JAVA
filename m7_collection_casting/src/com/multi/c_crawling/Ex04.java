package com.multi.c_crawling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex04 {
    private static JTextField textField;
    private static JTextArea textArea;

    public static void main(String[] args) {


        JFrame f = new JFrame("나의 주식 크롤링");
        f.getContentPane().setBackground(Color.GREEN);
        f.getContentPane().setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 700);

        JLabel lblNewLabel = new JLabel("CODE");
        lblNewLabel.setForeground(Color.RED);
        lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
        lblNewLabel.setBounds(120, 209, 166, 65);
        f.getContentPane().add(lblNewLabel);

        textField = new JTextField();
        textField.setForeground(Color.BLUE);
        textField.setFont(new Font("굴림", Font.BOLD, 40));
        textField.setBackground(Color.YELLOW);
        textField.setBounds(56, 270, 282, 50);
        f.getContentPane().add(textField);
        textField.setColumns(10);

        textArea = new JTextArea();
        textArea.setForeground(Color.BLUE);
        textArea.setFont(new Font("Monospaced", Font.BOLD, 30));
        textArea.setBounds(49, 397, 500, 229);
        f.getContentPane().add(textArea);

        JButton btnNewButton_1 = new JButton("삼성전자");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Naver ex = new Naver();
                String[] result = ex.crawl("005930");
                makeResult(result);
            }
        });
        btnNewButton_1.setBackground(Color.MAGENTA);
        btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
        btnNewButton_1.setBounds(47, 25, 284, 44);
        f.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_1_1 = new JButton("카카오");
        btnNewButton_1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Naver ex = new Naver();
                String[] result = ex.crawl("035720");
                makeResult(result);
            }
        });
        btnNewButton_1_1.setBackground(Color.ORANGE);
        btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 30));
        btnNewButton_1_1.setBounds(49, 93, 284, 44);
        f.getContentPane().add(btnNewButton_1_1);

        JButton btnNewButton_1_1_1 = new JButton("네이버");
        btnNewButton_1_1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Naver ex = new Naver();
                String[] result = ex.crawl("035420");
                makeResult(result);
            }
        });
        btnNewButton_1_1_1.setBackground(Color.PINK);
        btnNewButton_1_1_1.setFont(new Font("굴림", Font.BOLD, 30));
        btnNewButton_1_1_1.setBounds(49, 155, 284, 44);
        f.getContentPane().add(btnNewButton_1_1_1);

        JButton btnNewButton = new JButton("크롤링시작");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String code = textField.getText();//035420
                Naver ex = new Naver();
                String[] result = ex.crawl(code);
                makeResult(result);

            }
        });

        btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
        btnNewButton.setBounds(56, 330, 284, 44);
        f.getContentPane().add(btnNewButton);

        f.setVisible(true);
    }

    private static void makeResult(String[] result) {
        textArea.setText("");
        if (result != null) {
            textArea.append("회사이름 : " + result[0] + "\n");
            textArea.append("code:" + result[1] + "\n"); //code
            textArea.append("현재가:" + result[2] + "\n"); //현재가
            textArea.append("어제와의 차이:" + result[3] + "\n"); //어제와의 차이
            textArea.append("증감비율:" + result[4] + "\n"); //증감비율
        } else {
            textArea.setText("결과가없습니다 다시확인해주세요");
        }
    }
}

