package com.multi.hw.cal;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Calcu cal = new Calim();
        System.out.println(cal.CA);

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 두개를 입력해주세요");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        cal.sum(num1,num2);
        cal.sub(num1,num2);
        cal.mul(num1,num2);
        cal.div(num1,num2);
    }
}
