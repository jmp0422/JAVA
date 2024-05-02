package com.multi.a_classuse;

import com.multi.a_classmake.Calculator2;

public class MyShop {
    public static void main(String[] args) {

        Calculator2 cal = new Calculator2();
        System.out.println(cal.add(100,200));
        System.out.println("곱은 " + cal.mul(10,20));
        System.out.println("빼면 " + cal.minus(100,20));
        cal.div(20, 10);

        int result1 = cal.add2(3,4);
        int result2 = cal.add2(3.0,4);
        double result3 = cal.add2(3,4.0);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }
}
