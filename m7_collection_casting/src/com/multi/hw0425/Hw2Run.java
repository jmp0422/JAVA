package com.multi.hw0425;

class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i < 10; i++) {
            for(int j = 1; j <10; j++){


            try{
                Thread.sleep(150);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i+"x"+j+"="+i*j);
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 1; i < 30; i++) {
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("i는 " + i);

        }
    }
}

public class Hw2Run {

    public static void main(String[] args) {
        Thread1 Th1 = new Thread1();
        Thread2 Th2 = new Thread2();

        Th1.start();
        Th2.start();

        for (int i = 1; i < 10; i++) {
            for(int j = 1; j <10; j++){


            try{
                Thread.sleep(150);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i+"+"+j+"="+i+j);
            }
        }
    }
}



