package com.multi.a_inheritance;

public class Manager extends Employee {

        private int bonus;

    public void test(){
        System.out.println("내이름은 " + super.name);
        System.out.println("주소는" + super.address);
        System.out.println("월급은" + super.salary);
        //System.out.println("월급은" + super.rnn); private라 접근불가

    }

}
