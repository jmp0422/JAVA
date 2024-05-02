package com.multi.a_inheritance;

public class SuperMan extends Man{

    private boolean isFly;

    public SuperMan(String name, int age, int power, boolean isFly) {
        super(name, age, power);
        this.isFly = isFly;
    }

    public void space(){
        System.out.println("우주를 날다");
        super.toString();
    }

    @Override
    public void run() {
        System.out.println("너무빨라서 안보여");
    }

    @Override
    public void sleep() {
        System.out.println("슈퍼맨은 쓰러지지않아");
    }

    @Override
    public String toString() {
        return "SuperMan{" +
                "isFly=" + isFly + "power=" + getPower() + ", name=" + getName() + ", age=" + super.getAge() +
                '}';
    }
}
