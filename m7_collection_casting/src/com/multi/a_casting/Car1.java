package com.multi.a_casting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Car1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400, 800);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton red = new JButton("---차1---");
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon icon = new ImageIcon("img/car01.png");
                JLabel label = new JLabel();
                label.setIcon(icon);
                f.add(label);
                f.setVisible(true);
            }
        });
        JButton yellow = new JButton("---차2---");
        yellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon icon = new ImageIcon("img/car02.png");
                JLabel label = new JLabel();
                label.setIcon(icon);
                f.add(label);
                f.setVisible(true);
            }
        });
        JButton blue = new JButton("---차3---");
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon icon = new ImageIcon("img/car03.png");
                JLabel label = new JLabel();
                label.setIcon(icon);
                f.add(label);
                f.setVisible(true);
            }
        });
        f.add(red);
        f.add(yellow);
        f.add(blue);

        f.setVisible(true);
    }
}
