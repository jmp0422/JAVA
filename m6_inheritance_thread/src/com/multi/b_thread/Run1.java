package com.multi.b_thread;

import java.util.Timer;
import java.util.concurrent.CountDownLatch;

public class Run1 { //Thread test 2

    public static void main(String[] args) {

        Timer timer = new Timer();
        CountDownLatch latch = new CountDownLatch(1);
        Timertest timerTest = new Timertest(latch);


        System.out.println("10초동안 게임을 할 수 없습니다.");
        timer.schedule(timerTest, 10000); //주어진 지연시간 후에 한번테스크

        System.out.println("10초가 카운트 되는중입니다.");

        try {
            latch.await(); // 카운트가 0이 될때까지 대기
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main이 종료되었습니다.");
        timer.cancel();
    }
}
