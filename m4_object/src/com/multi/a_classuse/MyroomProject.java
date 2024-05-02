package com.multi.a_classuse;

import com.multi.a_classmake.Dog;
import com.multi.a_classmake.Phone;
import com.multi.a_classmake.Tv;

public class MyroomProject {
    public static void main(String[] args) {

        Phone p1 = new Phone(); // 전화기만들기
        p1.makeCall();
        p1.setSize(100);
        p1.kakakoTalk();
        System.out.println(p1.getSize());

        Phone p2 = new Phone();
        p2.setSize(65);
        p2.setSpeaker("apple");
        p2.takePhoto();
        System.out.println(p2.getSize());
        System.out.println(p2.getSpeaker());

        Dog dog = new Dog();
        dog.setColor("황색");
        dog.setField("진돗개");
        dog.wagTail();

        System.out.println(dog.getColor());
        System.out.println(dog.getField());
        System.out.println(dog.toString());

        Tv tv = new Tv();
        tv.setOnoff(true);
        tv.setVol(12);
        tv.setCh(6);

        System.out.println(tv.getVol());
        System.out.println(tv.getCh());
    }
}

