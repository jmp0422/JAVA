package com.multi.c_app02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex01 {
    public static int result = 0; //result함수를 public static을통해 전역변수로 선언
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        f.setSize(1000,1000);

        FlowLayout flow = new FlowLayout();
        f.setLayout(flow);

        int[] seat = new int[500];
        for(int i=0; i<seat.length; i++){
            JButton b = new JButton(i + ""); //""빈문자열을 합치면 자동으로 i가 문자열로 바뀜
            f.add(b);

            b.addActionListener(new ActionListener() { //액션이 되었을때 작동할 내용
                @Override
                public void actionPerformed(ActionEvent e) {
                    String s = e.getActionCommand(); //e는 이벤트가 발생되었을때 라는뜻 / getActionCommand는 그 값을 가져옴(여기서는 seat번호)
                    JOptionPane.showMessageDialog(f, s + "번 예약됨");
                    b.setEnabled(false); //비활성화함 (false)가 들어갔기때문

                    int idx = Integer.parseInt(s);
                    seat[idx] = 1;
                    result++;
                }
            });
        }
        JButton pay = new JButton("결제하기");
        f.add(pay);
        pay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                int result = 0;  //이렇게해도 되지만 , public result를 선언함으로써 더 간단히 가능
//                for(int i=0; i<seat.length; i++){
//                    if(seat[i] == 1){
//                        result++;
//                    }
//                }
                JOptionPane.showMessageDialog(f,result +" 장 예매하였습니다. 총 가격은 " + (result*13000) + "원입니다.");
            }
        });
//        JOptionPane.showMessageDialog(f,result +" 장 예매하였습니다. 총 가격은 " + (result*13000) + "원입니다.");
        f.setVisible(true);
    }
}
