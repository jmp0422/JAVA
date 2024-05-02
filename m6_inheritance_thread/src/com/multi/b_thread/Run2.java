package com.multi.b_thread;

public class Run2 {
    public static void main(String[] args) {

        TimeThread times = new TimeThread();
        ImageThread images = new ImageThread();
//        CounterThread counters = new CounterThread();

        times.start();
        images.start();
//        counter.start();
    }
}
