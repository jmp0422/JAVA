package com.multi.hw0417;

import java.util.Scanner;

public class hw4_1 {
    public static void main(String[] args) {
        System.out.println("좋아하는 과목을 입력해주세요. ");
        System.out.println("자바, 파이썬, 등등");

        Scanner sc = new Scanner(System.in);
        String result = sc.next();

        if (result.equals("자바") || result.equals("파이썬")) {
            switch (result) {
                case ("자바"):
                    System.out.println("JSP로 점프");
                    break;
                case ("파이썬"):
                    System.out.println("장고로 점프");
                    break;
            }
        }else
            System.out.println("열심히");
    }
}
