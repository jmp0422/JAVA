package com.multi.basic;
//https://docs.oracle.com/en/java/javase/11/docs/api/index.html
/*
 *  ** 원칙 **
 *  1. 클래스명 --> 대문자로 시작
 *  2. 패키지명 --> 소문자로 시작
 *  3. 메소드명 --> 소문자로 시작
 *  4. 변수명    --> 소문자로 시작
 *
 *  단, 여러개의 단어가 있을 때는 단어 앞자리마다 대문자로 !! == 낙타 표기법(개발자간의 예의)
 *
 *  ex) 클래스명 Methodprinter --> MethodPrinter
 *      메소드명 testprint --> testPrint
 *
 *  그리고 항상 의미있게 이름짓자!!
 */


//public : 메인메소드는 외부에서 호출할수있다.
//static : 객체를 생성하지 않고도 실행 시킬수있다.
//void : 반환값이 없으니까
//String[] args : 파라미터, 실행 명령어외에 인자를 받을수 있는데 스트링 배열로 들어감

public class Hello {

    public static void main(String[] args){

        System.out.println("안녕하세요");
    }
}
