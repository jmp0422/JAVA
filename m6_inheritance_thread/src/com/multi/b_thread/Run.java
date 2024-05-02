package com.multi.b_thread;

public class Run {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        Thread th = new Thread(t2);

//        t1.run();
//        t2.run();

        t1.start();
        th.start();
        System.out.println("main 이 종료되었습니다.");
    }
}
