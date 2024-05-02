package com.multi.d_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.getContentPane().setBackground(Color.black);
        f.setSize( 500, 600);
        f.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("아이디");
        lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
        lblNewLabel.setBounds(36, 205, 119, 38);
        f.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel2 = new JLabel("패스워드");
        lblNewLabel2.setFont(new Font("굴림", Font.BOLD, 30));
        lblNewLabel2.setBounds(36, 278, 130, 38);
        f.getContentPane().add(lblNewLabel2);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("images/choon.JPG"));
        lblNewLabel_1.setBounds(12, 10, 500, 185);
        f.getContentPane().add(lblNewLabel_1);

        JTextField t1 = new JTextField();
        t1.setBackground(Color.YELLOW);
        t1.setFont(new Font("굴림", Font.BOLD, 30));
        t1.setBounds(208, 205, 267, 38);
        f.getContentPane().add(t1);

        JTextField t2 = new JTextField();
        t2.setFont(new Font("굴림", Font.BOLD, 30));
        t2.setColumns(10);
        t2.setBackground(Color.YELLOW);
        t2.setBounds(208, 277, 267, 38);
        f.getContentPane().add(t2);

        JButton btnNewButton = new JButton("");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = t1.getText();
                String s2 = t2.getText();

                if(s1.equals("root") && s2.equals("1234")){
                    WriteDiary diary = new WriteDiary();
                    diary.open();
                }else{
                    JOptionPane.showMessageDialog(f, "로그인 실패");
                }

            }
        });
        btnNewButton.setIcon(new ImageIcon("images/login.JPG"));
        btnNewButton.setBounds(25, 337, 205, 205);
        f.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
            }
        });
        btnNewButton_1.setIcon(new ImageIcon("images/reset.JPG"));
        btnNewButton_1.setBounds(254, 337, 205, 205);
        f.getContentPane().add(btnNewButton_1);


        f.setVisible(true);
    }
}
