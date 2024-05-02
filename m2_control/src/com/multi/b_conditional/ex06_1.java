package com.multi.b_conditional;

public class ex06_1 {
    public static void main(String[] args) {

        String no = "A100EX";
        char first = no.charAt(0);
        switch (first) {
            case 'A':
                System.out.println("기획부 프린트");
                break;
            case 'B':
                System.out.println("총무부 프린트");
                break;
            case 'C':
                System.out.println("개발부 프린트");
                break;
        }


        String gender = "880115-1234567";
        char data = gender.charAt(7);
//        System.out.println(data);
        switch (data) {
            case '1':
            case '3':
                System.out.println("남자");
                break;
            case '2':
            case '4':
                System.out.println("여자");
                break;
            default:
                System.out.println("다시확인");
                break;
        }
    }
}

