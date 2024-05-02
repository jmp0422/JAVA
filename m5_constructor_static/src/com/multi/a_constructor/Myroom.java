package com.multi.a_constructor;

public class Myroom {
    public static void main(String[] args) {

        Tv t1 = new Tv();
        t1.on();
        Tv t2 = new Tv();
        t2.on();
        t2.off();

        Tv t3 = new Tv(7,8,false);
        System.out.println(t3);
        Tv t4 = new Tv(11,8,true);
        System.out.println(t4);

        System.out.println(Tv.count);


    }
}
