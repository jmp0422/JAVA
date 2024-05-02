package com.multi.b_conditional;

import javax.swing.*;

public class ex06 {
    public static void main(String[] args) {
        String date = JOptionPane.showInputDialog("현재 몇월인지 넣어주세요 : ex)4월 ->4");
        String season = "";
        switch (date) {

            case "12":
            case "11":
            case "1":
                season = "겨울";
                System.out.println(season);
                break;

            case "2":
            case "3":
            case "4":
                season = "봄";
                System.out.println(season);
                break;

            case "5":
            case "6":
            case "7":
                season = "여름";
                System.out.println(season);
                break;

            case "8":
            case "9":
            case "10":
                season = "가을";
                System.out.println(season);
                break;
        }
    }
}
