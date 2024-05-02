package com.multi.d.practice;

public class ex02 {
    public static void main(String[] args) {
        //		//System.out.printf("포맷", 출력하고자하는 값, 값, ...);
//		// 출력하고자 하는 값들이 제시된 포맷(형식)에 맞춰서 출력만 진행 --> 한줄띄어쓰기는 안함
//		// %d : 정수
//		// %c : 문자
//		// %s : 문자열 또는 문자도 가능
//		// %f : 실수
//		/* \t : 정해진 공간만큼 띄어쓰기
//		\n : 출력하고 다음라인으로 옮김
//		정렬방법
//		%5d : 5칸을 확보하고 오른쪽 정렬
//		%-5d : 5칸을 확보하고 왼쪽 정렬
//		%.2f : 소수점 아래 2자리까지만 표시

        int iNum1 = 10;
        int iNum2 = 20;
        System.out.printf("%d\n", iNum1);// 10
        System.out.printf("%d\n", iNum1, iNum2);// 10
        //System.out.printf("%d %d \n", iNum1);--에러발생 : 두번째 포맷에 들어갈 값이 없어서
        System.out.printf("%d %d \n", iNum1, iNum2);
        System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1 + iNum2);
        System.out.printf("%5d\n", iNum1);//5칸 공간띄우고 오른쪽(음수면 왼쪽)

        char ch = 'a';
        String str = "Hello";
        System.out.printf("%c %s\n", ch, str);//a Hello
        System.out.printf("%c %s\n", ch, ch);//a a --> %s 는 char 형도 가능
        System.out.printf("%C %S\n", ch, str);//대문자로


    }
}

