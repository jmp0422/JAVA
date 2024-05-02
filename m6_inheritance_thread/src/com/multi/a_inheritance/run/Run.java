package com.multi.a_inheritance.run;

import com.multi.a_inheritance.Manager;
import com.multi.a_inheritance.SuperMan;
import com.multi.a_inheritance.WonderWoman;


public class Run{
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("송강");
        System.out.println(m);


        SuperMan s = new SuperMan("james", 26, 100, true);
        System.out.println(s);
        s.eat();
        s.run();
        s.space();
        s.sleep();

        WonderWoman w = new WonderWoman("rose", 24, "사과", true);
        System.out.println(w);
        w.swimming();
        w.eatfood();
        w.sleep();

    }
}
