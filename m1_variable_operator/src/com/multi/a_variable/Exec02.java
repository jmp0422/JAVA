package com.multi.a_variable; //패키지명 - 소문자

public class Exec02 { // 클래스명 - 첫글자 대문자
    public static void main(String[] args) { //메소드 - 소문자 (함수와 비슷하다고생각하면됨) arg - 지역변수(소문자,낙타표기법)
        //낙타표기법 : MyHome  스네이크표기법 : my_home

        int age = 100;
        double height = 122.2;
        char gender = '남';
        boolean food = true;

        System.out.println("내 나이는 " + age);

        int a; //일단저장공간을 먼저 확보해두고, 나중에값을넣는 경우

        a = 100;
        int a1 = 100;//저장공간을 만드는 처음부터 들어갈값이 정해진 경우 // 선언과 동시에 초기화

        byte age1 = 100;
        short wallet = 2000;
        int money = 5000000;
        long space = 10000000000L;
        System.out.println("내 은행에 든 돈 : " + money + "원");

        double height2 = 175.22;
        float weight2 = 80.85F;
        String name = "재민";
        System.out.println("내 성별은 " + gender);

        // 참조자료형 //기본데이타X ==> 너무 많이 쓰기 때문에 기본형처럼 기본형데이터처럼 사용 가능!!
        System.out.println("내 이름은  " + name);

    }
}
////자료형에 대한 개념
//
//		/*//1. 논리형
//		boolean isTrue;  // true, false , 0 , 1  // 1byte
//
//		//2. 숫자형
//		//2_1 정수형
//
//		byte bNum;		// 1byte -128~127
//		short sNum;     // 2byte  -3만 ~3만
//		int iNum;		// 4byte -> 정수형중에 가장 대표적인 자료형 (기본형 ) -21억 ~ 21억xxx 까지의 값이 담기는 자료형
//		long lNum;		// 8byte 21억 이상
//
//		//2_2 실수형
//		float fNum;		// 4byte
//		double dNum;	// 8byte -> 실수형중에 가장 대표적인 자료형(기본형 )
//
//		//float은 소수점 아래 7짜리까지 표현이 가능하고 
//		//double은 소수점 아래 15자리까지 표현이 가능해서 double이 좀 더 정확하다  그래서 실수형중에서 기본형이 double이다.
//
//
//		//3. 문자형
//		char ch;		//2byte
