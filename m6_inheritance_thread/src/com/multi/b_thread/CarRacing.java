package com.multi.b_thread;

import javax.swing.*;
import java.util.Random;

public class CarRacing extends JFrame {

    public CarRacing() {
        setTitle("자동차 경주");
        setSize(1400, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Car car1 = new Car("images/car01.png", 100, 0);
        Car car2 = new Car("images/car02.png", 100, 150);
        Car car3 = new Car("images/car03.png", 100, 300);

        car1.start();
        car2.start();
        car3.start();

        setVisible(true);
    }

    //내부클래스
    public class Car extends Thread {

        private int x, y;
        private JLabel label;

        public Car(String file, int x, int y) {
            ImageIcon icon = new ImageIcon(file);
            label = new JLabel(icon);
            this.x = x;
            this.y = y;
            label.setBounds(x, y, 150, 150);
            add(label);


        }

        @Override
        public void run() {
            Random r = new Random();
            for (int i = 0; i < 200; i++) {
                int move = r.nextInt(50);
                x = x + move;
                label.setBounds(x,y,150,150);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void main(String[] args) {

        CarRacing car = new CarRacing();


    }
}
