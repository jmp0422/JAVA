package com.multi.c_loop;

import javax.swing.*;

public class ex02 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("계속 돕니다 ");
            String choice = JOptionPane.showInputDialog("y or n");

            if(choice.equals("y")){
                System.out.println("프로그램을 종료합니다. ");
                System.exit(0);  //코딩프로그램종료
//                break;
            }

        }
    }
}
