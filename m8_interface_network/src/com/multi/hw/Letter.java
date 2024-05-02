package com.multi.hw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Letter {
    private static JFrame f;
    private static JTextArea textArea;


    public static void main(String[] args) {
        f = new JFrame();
        f.setTitle("글자판독기");
        f.setSize(1000, 800);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setLayout(null);

        JLabel label1 = new JLabel("Words : ");
        label1.setFont(new Font("굴림", Font.BOLD, 30));
        label1.setForeground(Color.BLACK);
        label1.setBounds(100, 50, 150, 50);
        f.getContentPane().add(label1);

        JLabel label2 = new JLabel("");
        label2.setFont(new Font("굴림", Font.BOLD, 20));
        label2.setForeground(Color.BLACK);
        label2.setBounds(300, 50, 600, 50);
        f.getContentPane().add(label2);

        JLabel label3 = new JLabel("Typing Sentence");
        label3.setFont(new Font("굴림", Font.BOLD, 30));
        label3.setForeground(Color.BLACK);
        label3.setBounds(100, 100, 300, 50);
        f.getContentPane().add(label3);

        textArea = new JTextArea("");
        textArea.setBackground(Color.GRAY);
        textArea.setForeground(Color.white);
        textArea.setFont(new Font("굴림", Font.BOLD, 20));
        textArea.setBounds(100, 150, 700, 400);
        f.getContentPane().add(textArea);
        textArea.setColumns(10);

        JButton ton1 = new JButton("글자색변경");
        JButton ton2 = new JButton("배경색변경");
        JButton ton3 = new JButton("단어별 분리");

        ton1.setBackground(Color.BLACK);
        ton1.setForeground(Color.WHITE);
        ton1.setFont(new Font("굴림", Font.BOLD, 30));
        ton1.setBounds(100, 570, 200, 50);
        f.getContentPane().add(ton1);

        ton2.setBackground(Color.BLACK);
        ton2.setForeground(Color.WHITE);
        ton2.setFont(new Font("굴림", Font.BOLD, 30));
        ton2.setBounds(310, 570, 200, 50);
        f.getContentPane().add(ton2);

        ton3.setBackground(Color.BLACK);
        ton3.setForeground(Color.WHITE);
        ton3.setFont(new Font("굴림", Font.BOLD, 30));
        ton3.setBounds(520, 570, 200, 50);
        f.getContentPane().add(ton3);

        ton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color currentColor = textArea.getForeground();

                if(currentColor.equals(Color.WHITE)){
                    textArea.setForeground(Color.RED);
                }else {
                    textArea.setForeground(Color.WHITE);
                }

            }
        });

        ton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color currentColor2 = textArea.getBackground();

                if(currentColor2.equals(Color.GRAY)){
                    textArea.setBackground(Color.YELLOW);
                }else {
                    textArea.setBackground(Color.GRAY);
                }

            }
        });

        ton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sen = textArea.getText();
                String[] words = sen.split(" ");
                String result = "";
                for(int i=0; i< words.length; i++){
                    result += words[i] + ", ";
                }
                label2.setText(result);

            }
        });



        f.setVisible(true);
    }


}
