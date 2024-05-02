package com.multi.b_conditional;

import javax.swing.*;
import java.util.Random;

public class ex07 {

    public static void main(String[] args) {
        //target 1 부터 100 까지
//        int target = (int)(Math.random() * 100) +1;
        Random random = new Random();
        int target = random.nextInt(100) +1;
        int no = 0; //틀린횟수
        int count = 0; //전체횟수

        while (true) {
            String data = JOptionPane.showInputDialog("숫자입력");
            int data2 = Integer.parseInt(data);

            count++;


            if (data2 == target) {
                System.out.println("정답");
                break;
            } else {
                System.out.println("정답이아닙니다");
                no++;
                if (data2 > target) {
                    System.out.println("너무크다");
                } else {
                    System.out.println("너무작다");

                }
            }
        }

        System.out.println("전체시도횟수 : " + count);
        System.out.println("틀린시도횟수 : " + no);


    }
}
