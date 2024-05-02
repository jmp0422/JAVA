package com.multi.a_inheritance;

public class Man extends Human {

    private int power;

    public Man(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    public void run() {
        super.eat();
        System.out.println("빨리달린다");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Man{" +
                "power=" + power + ", name=" + getName() + ", age=" + super.getAge() +
                '}';
    }
}
