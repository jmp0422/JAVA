package com.multi.b_conditional;

import java.util.Date;

public class ex05 {
    public static void main(String[] args) {
        Date date = new Date();

        int month = date.getMonth() + 1;//월 getMonth가 0부터 11로 정의되어있어서 +1 해줌
        int day = date.getDay();//요일 일월화수목금 순서이며 일요일이 0임
//        System.out.println(day);
//        if (day == 0 && day == 1) {
//            day = -1;
//        } else {
//            day = 1;
//        }
        switch (day) {
            case 0:
                System.out.println("일요일이니 놀자");
                break;
            case 1:
                System.out.println("월요일이니 공부하자");
                break;
            case 2:
                System.out.println("화요일이니 공부하자");
                break;
            case 3:
                System.out.println("수요일이니 공부하자");
                break;
            case 4:
                System.out.println("목요일이니 공부하자");
                break;
            case 5:
                System.out.println("금요일이니 공부하자");
                break;
            case 6:
                System.out.println("토요일이니 놀자");
                break;
            default:
                System.out.println("모르겠어요");
                break;


                //같은 케이스끼리는 case 1: case 2: System.out.print 이런식으로 묵어도됨
        }
    }
}
