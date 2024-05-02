package com.multi.c_loop;

public class ex01 {
    //반갑습니다 10번찍기
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("반갑습니다.");
        }
//        while(true){ 무한루프
//            System.out.println("반갑습니다.");
//        }
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        //별세개찍기
        int i = 0; //초기값
        while (i <= 8) { //조건문
            System.out.println("★");
            i = i + 4; //증가값
        }
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        //1부터 10 찍기
        int num = 1;
        while (num <= 10) { //조건문
            System.out.println(num);
            num++; //증가값
        }
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        //1부터 10 찍고 합까지구하기
        int sum = 0;
        for (int num1 = 1; num1 <= 10; num1++) {
            System.out.println(num1);
            sum += num1;
        }
        System.out.println(sum);

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        //1부터 100까지 짝수만구하기
        int result = 0;
        for (int num2 = 1; num2 <= 100; num2++) {
            if (num2 % 2 == 0) {
                System.out.print(num2 + " ");
                result++;
            }
        }
        System.out.println();
        System.out.println(result);
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        //continue사용 3의배수만 안찍히게
        for (int num3 = 1; num3 <= 100; num3++) {
            if (num3 % 3 == 0) {
                continue;
//                break;
            }
            System.out.print(num3 + " ");
        }
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        //1000까지
        int sum2 = 0;
        for (int i2 = 0; i2 <= 1000; i2++){
            if(sum2 > 100){
                break;
            }
            if(i2 % 5 ==0){
                continue;
            }
            sum2 += i2;
        }
        System.out.println();
        System.out.print(sum2);
    }

}
