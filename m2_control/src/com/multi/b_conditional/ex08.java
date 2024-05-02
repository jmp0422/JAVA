package com.multi.b_conditional;

import java.util.Scanner;

public class ex08 {
    public void testMachine() {

        /* switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트 */
        /* 1. JDK 1.7 이상부터 switch문을 이용하여 문자열을 비교할 수 있다.
         * 2. break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다. */

        /* switch문을 이용한 간단한 자판기 */
        System.out.println("=== Uni vending machine ===");
        System.out.println("  사이다   콜라   환타   바카스  핫식스  ");
        System.out.println("==============================");
        System.out.print("음료를 선택해주세요 : ");

        /* 원하는 음료를 문자열로 입력받음 */
        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();
        /* 원하는 음료에 맞는 가격을 저장할 변수 */
        int price = 0;
        String order = "";

        switch (selectedDrink) {
            case "사이다":
                order = "사이다";
                price = 500;
                break;
            case "콜라":
                order = "콜라";
                price = 600;
                break;
            case "환타":
                order = "환타";
                price = 700;
                break;
            case "바카스":
                order = "바카스";
                price = 2000;
                break;
            case "핫식스":
                order = "핫식스";
                price = 10000;
                break;
            default:
                System.out.println("잘못입력하였습니다.");
                //break;
               return;
               //return 일경우 현재 메소드의 코드를 더이상 실행하지 않고 바로 이메소드를 호출한곳으로 빠져나간다
        }

        System.out.println(order + "를 선택하셨습니다.");
        System.out.println(price + "원을 투입해주세요!");

        sc.close();
    }
}
