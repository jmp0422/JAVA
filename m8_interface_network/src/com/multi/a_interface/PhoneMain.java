package com.multi.a_interface;

public class PhoneMain {
    public static void main(String[] args) {

        //PhoneInterface p = new PhoneInterface();
        //인터페이스는 객체생성이 불가능하다

        //PhoneInterface p = new PhoneClass();
        //추상클래쓰도 객체생성이 불가능하다

        PhoneInterface p = new PhoneClass();
        //인터페이스를 구현한 구현체이면 가능하다(implements를말함)

        p.call();
        p.text();
        p.internet();

        AppleKOR k = new AppleKOR();
        AppleUSA u = new AppleUSA();

        k.pay();
        k.call();
        u.pay();
        u.call();
    }
}
