package com.multi.b_thread;

import java.util.Scanner;

public class Run01 {
    public static void main(String[] args) {

        CounterThread count = new CounterThread();
        count.start();

        Scanner sc = new Scanner(System.in);

        System.out.println("아무값이나 입력하세요 ");
        String input = sc.nextLine();

        System.out.println("입력한 값 : " + input);

        count.interrupt();

    }
}
