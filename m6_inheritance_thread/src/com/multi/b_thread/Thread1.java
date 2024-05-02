package com.multi.b_thread;

public class Thread1 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 1000; i++) {
            System.out.println("증가 : " + i);
        }
    }
}
