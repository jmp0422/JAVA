package com.multi.b_app01;

import javax.swing.*;

public class ex05 {
    public static void main(String[] args) {

        String[] names = {"블랙핑크", "유재석", "아이유", "이효리", "비"};
        int[] count = {0, 0, 0, 0, 0};

        for (int i = 0; i < 10; i++) {
            String choice = JOptionPane.showInputDialog("투표할 사람 번호 입력 0)블랙핑크, 1)유재석, 2)아이유, 3)이효리, 4)비");
            int ch2 = Integer.parseInt(choice);
            if (ch2 < 0 || ch2 > 4) {
                i--; //무효표는 회차에서 제외한다
            } else {
                count[ch2]++;
                System.out.println(i+"회차");
            }
        }
        for (int n=0; n<count.length ; n++){
            System.out.println(n + " 번은" + count[n] + "표입니다.");
        }
        int max = count[0];
        for (int n=0; n<count.length ; n++){
            if(count[n]>max){ //제일큰값을 저장한다
                max = count[n];
            }
        }
        for (int n=0; n<count.length ; n++){ //제일큰값을 가지고있는 이름을 프린트한다
            if(count[n]==max){
                System.out.println(names[n]);
            }
        }
    }
}
