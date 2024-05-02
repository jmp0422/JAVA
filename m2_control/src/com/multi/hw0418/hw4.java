package com.multi.hw0418;

import javax.swing.*;

public class hw4 {
    public static void main(String[] args) {

        int resultwin = 0;
        int resultlose = 0;
        int play = 0;

        while (true) {
            String choice = JOptionPane.showInputDialog("0이면 가위, 1이면 바위, 2이면 보, 3이면 종료");
            int random = (int) (Math.random() * 3);
            if (choice.equals("0")) {
                play++;
                if (random == 0) {
                    System.out.println("무승부입니다.");
                } else if (random == 1) {
                    System.out.println("패배하셨습니다.");
                    resultlose++;
                } else if (random == 2) {
                    System.out.println("승리하셨습니다.");
                    resultwin++;
                }
            }
            if (choice.equals("1")) {
                play++;
                if (random == 0) {
                    System.out.println("승리하셨습니다.");
                    resultwin++;
                } else if (random == 1) {
                    System.out.println("무승부입니다.");
                } else if (random == 2) {
                    System.out.println("패배하셨습니다.");
                    resultlose++;
                }
            }
            if (choice.equals("2")) {
                play++;
                if (random == 0) {
                    System.out.println("패배하셨습니다.");
                    resultlose++;
                } else if (random == 1) {
                    System.out.println("승리하셨습니다.");
                    resultwin++;
                } else if (random == 2) {
                    System.out.println("무승부입니다.");
                }
            }
            if (choice.equals("3")) {
                System.out.println(play + "판 중에서 " + resultwin + "승 "
                        + (play-resultwin-resultlose) + "무 " + resultlose + "패 입니다.");
                System.out.println("종료하겠습니다.");
                break;
            }
            System.out.println("현재 결과는 " + resultwin + "승 " + resultlose + "패 입니다.");
        }
    }
}

