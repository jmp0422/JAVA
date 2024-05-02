package com.multi.a_classuse;

import com.multi.a_classmake.BrickMold;

public class House {
    public static void main(String[] args) {

        BrickMold brick1 = new BrickMold();
        brick1.setX(50);
        brick1.setY(50);

        brick1.stack();


        BrickMold brick2 = new BrickMold();
        brick2.setX(150);
        brick2.setY(150);

        brick2.stack();

        System.out.println(brick1);
        System.out.println(brick2);
    }
}
