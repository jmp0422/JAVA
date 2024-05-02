package com.multi.Gra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UseButtonGrapic2 implements ActionListener {//인터페이스그래픽2
    static JButton b1, b2;
    static JTextArea area;

    public static void main(String[] args) {
        JFrame f = new JFrame("이벤트를 인터페이스로 처리");
        f.setSize(500, 600);

        f.setLayout(new FlowLayout());

        b1 = new JButton("버튼1을 클릭");
        b2 = new JButton("버튼2을 클릭");

        UseButtonGrapic2 act3 = new UseButtonGrapic2();
        b1.addActionListener(act3);
        b2.addActionListener(act3);

        f.add(b1); //업캐스팅(자동형변환)
        f.add(b2); //업캐스팅(자동형변환)

        Font font = new Font("궁서", Font.BOLD, 50);
        b1.setFont(font);
        b2.setFont(font);

        area = new JTextArea(6, 10);
        area.setFont(font);
        f.add(area);

        area.setBackground(Color.yellow);

        f.setVisible(true); //맨 마지막줄!!
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            area.append("b1클릭함.\n");
            System.out.println("b1클릭함.");
        } else {
            area.append("b2클릭함.\n");
            System.out.println("b2클릭함.");
        }
    }

}
