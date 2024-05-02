package com.multi.b_app01;

import javax.swing.*;

public class ex01 {
    public static void main(String[] args) {

//        int[] jumsu=new int[5];
//        int sum=0;
//        for(int i=1;i<jumsu.length;i++){
//            String data= JOptionPane.showInputDialog("점수입력");
//            jumsu[i]=Integer.parseInt(data);
//            System.out.println(i+"-->"+jumsu[i]);
//
//        }
//        for (int i:jumsu){
//            sum+=i;
//        }
//        System.out.println("총합 "+sum);
        int[] score = new int[5];
        int result = 0;
        for(int i =0 ; i<score.length ; i++){
            String data = JOptionPane.showInputDialog("점수입력 : ");
            score[i] = Integer.parseInt(data);
            result += score[i];
            System.out.print("score--> " + score[i]);
            System.out.println(" 합은" + result);
        }

    }
}
