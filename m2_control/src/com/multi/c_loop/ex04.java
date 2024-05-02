package com.multi.c_loop;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        int iu = 0;
        int you = 0;
        int bts = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1)아이유 2)유재석 3)방탄소년단 4)종료");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("투표를 종료합니다");
                System.out.println("iu표 : >>" + iu);
                System.out.println("you표 : >>" + you);
                System.out.println("bts표 : >>" + bts);
                break;
            } else if (choice == 1) {
                iu++;
            } else if (choice == 2) {
                you++;
            } else if (choice == 3) {
                bts++;
            }

        }
    }
}
