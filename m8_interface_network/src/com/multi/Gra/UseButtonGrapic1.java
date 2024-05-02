package com.multi.Gra;

import javax.swing.*;
import java.awt.*;

public class UseButtonGrapic1 {//인터페이스그래픽 ButtonClick1.ButtonClick2

	public static void main(String[] args) {
		JFrame f = new JFrame("이벤트를 인터페이스로 처리");
		f.setSize(500, 600);
		
		f.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("버튼1을 클릭");
		JButton b2 = new JButton("버튼2을 클릭");
		
		ButtonClick1 act1 = new ButtonClick1();
		ButtonClick2 act2 = new ButtonClick2();
		
		b1.addActionListener(act1);
		b2.addActionListener(act2);
		
		f.add(b1); //업캐스팅(자동형변환)
		f.add(b2); //업캐스팅(자동형변환)
		
		Font font = new Font("궁서", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);
		
		JTextArea area = new JTextArea(6, 10);
		area.setFont(font);
		f.add(area);
		
		area.setBackground(Color.yellow);
		
		f.setVisible(true);
	}

}
