package com.multi.b_conditional;

public class ex01 {
    public static void main(String[] args) {
        int score = 88;
        String grade = "";

        if (score >= 90) {
            grade = "A학점";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }
        if (score % 10 >= 5 && score > +80 || score == 100) {
            grade += "+";
        }
        System.out.println(grade +  "학점");
    }
}