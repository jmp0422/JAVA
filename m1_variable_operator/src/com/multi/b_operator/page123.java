package com.multi.b_operator;


public class page123 {
    public static void main(String[] args) { //psvm,main tab시 자동생성

        int coffee = 5;
        int price = 5000;

        String result = ((coffee * price) > 20000) ? "할인해드릴게요" : "총 커피값을 내세요.";
        System.out.println(result);

        int age = 100;
        int age2 = 101;

        String result1 = (age2 > 100) ? "이제부터 시작" : "아직젊어요";
        System.out.println(result1);


    }

}
