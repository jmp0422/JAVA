package com.multi.hw;

public class Run {
    public static void main(String[] args) {
        Soccer so = new Soccer("구기종목", "공을 골대에 넣어서", 11);
        Basketball ba = new Basketball("구기종목", "공을 골대에 넣어서", 5);
        Longjump lo = new Longjump("육상종목", "상대보다 멀리 뛰어서", 1);
        Archery ar = new Archery("육상종목", "과녁을 맞춰 점수를 획득하여", 3);

        System.out.println(so);
        System.out.println(ba);
        System.out.println(lo);
        System.out.println(ar);


        so.sweat();
        so.funny();
        so.control();
        so.goal();
        ba.pass();

        ar.focus();
        ar.shoot();
        lo.jump();
    }
}
