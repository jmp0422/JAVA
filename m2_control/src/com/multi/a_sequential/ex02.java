package com.multi.a_sequential;

import javax.swing.*;

public class ex02 {
    public static void main(String[] args) {

        String hour = JOptionPane.showInputDialog("지금 몇시인가요 ? "); //창 띄어서 물어보기
        System.out.println(hour);
        JOptionPane.showMessageDialog(null, hour + "시입니다.");

//        if(hour.equals("")) / if(hour.length() == 0)
        if(hour.length() == 0) {
            System.out.println("시간을 입력해주세요");
            return;
        }
        int hour2 = Integer.parseInt(hour);
        System.out.println(hour);
        if (hour2 < 16) { //조건에는 비교연산자를 쓰고, 비교연산자의 결과는 논리!
            //true
            JOptionPane.showMessageDialog(null, "아직 집에 갈 시간이 멀었군요.");
        } else { //false
            JOptionPane.showMessageDialog(null, "집에 갈 시간이 얼마 안남았군요.");
        } //묶어주는 의미(포함)


    }
}
