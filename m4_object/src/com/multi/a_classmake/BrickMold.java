package com.multi.a_classmake;

public class BrickMold {

//하드웨어(물건) 개념
//속성(성질) == property, attribute
//기능(동작) == function, 함수
//틀을 만들기위해서는 물건들이 가지는 공통된 속성, 동작을
//정의해야함.
//속성 --> x, y(멤버변수)


        private int x;
        private int y;


    public void stack(){
        System.out.println("벽돌을 쌓다");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "BrickMold{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
