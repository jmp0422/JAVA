package com.multi.a_casting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Car4 {
    static Frame f;
    static HashMap<String, String > map;
    public static void main(String[] args) {
        f = new JFrame();
        f.setSize(400, 800);
        f.setLayout(new FlowLayout());
        JButton red = new JButton("---차1---");
        JButton yellow = new JButton("---차2---");
        JButton blue = new JButton("---차3---");
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(red);
        f.add(yellow);
        f.add(blue);

        map = new HashMap<>();
        map.put("---차1---", "img/car01.png");
        map.put("---차2---", "img/car02.png");
        map.put("---차3---", "img/car03.png");



        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                ImageIcon icon = new ImageIcon("img/car01.png");
//                JLabel label = new JLabel();
//                label.setIcon(icon);
//                f.add(label);
//                f.setVisible(true);
                String x = red.getActionCommand();
                Car4.show(x);
            }
        });

        yellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                ImageIcon icon = new ImageIcon("img/car02.png");
//                JLabel label = new JLabel();
//                label.setIcon(icon);
//                f.add(label);
//                f.setVisible(true);
                String x = yellow.getActionCommand();
                Car4.show(x);
            }
        });

        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                ImageIcon icon = new ImageIcon("img/car03.png");
//                JLabel label = new JLabel();
//                label.setIcon(icon);
//                f.add(label);
//                f.setVisible(true);
                String x = blue.getActionCommand();
                Car4.show(x);
            }
        });


        f.setVisible(true);
    }

    public static void show(String x) {
        String img = map.get(x);
//        String img = "";
//        if (x.equals("---차1---"))
//            img = "img/car01.png";
//        else if (x.equals("---차2---"))
//            img = "img/car02.png";
//        else if (x.equals("---차3---"))
//            img = "img/car03.png";
        ImageIcon icon = new ImageIcon(img);
        JLabel label = new JLabel();
        label.setIcon(icon);
        f.add(label);
        f.setVisible(true);
    }
}
