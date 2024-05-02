package com.multi.b_conditional;

public class ex04 {
    public static void main(String[] args) {
        /* [switch문 표현식] --> 비교할 변수는 정수 문자열 문자  / 실수와 논리는 안됨
         * switch(비교할변수) {
         *     case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
         *     case 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break;
         *     default : case에 모두 해당하지 않는 경우 실행할 구문; break;
         * }
         * */
        String name = "자바";
        switch (name) {
            case "자바":
                System.out.println("자바입니다.");
                break;
            case "파이썬":
                System.out.println("파이썬입니다.");
                break;
            case "리눅스":
                System.out.println("리눅스입니다.");
                break;
            default:
                System.out.println("카운터로돌아가세요");
                break;
        }
    }
}
