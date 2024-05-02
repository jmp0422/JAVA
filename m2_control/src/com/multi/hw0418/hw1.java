package com.multi.hw0418;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hw1 {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setSize(450, 600);
        FlowLayout flow = new FlowLayout();
        f.getContentPane().setLayout(flow);

        int goal = 0;
        goal = (int) (Math.random() * 50) + 1;

        for (int i = 1; i <= 50; i++) {


            if (i == goal) {
                JButton btn = new JButton(goal + "번");
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(f, "당첨입니다.");
                    }
                });
                f.getContentPane().add(btn);
                continue;
            } else {
                JButton btn1 = new JButton(i + "번");
                f.getContentPane().add(btn1);
                btn1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(f, "꽝꽝.");
                    }
                });
            }

        }
        f.setVisible(true);
    }
}
