package com.multi.b_thread;

public class ImageThread extends Thread{

    @Override
    public void run() {
        String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
        for(int i=0; i<list.length; i++){
            System.out.println("이미지 >> " + list[i]);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
