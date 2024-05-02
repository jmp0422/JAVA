package com.multi.b_thread;


//.Runnable 인터페이스 구현
public class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println("감소 : " + i);
        }
    }
}
