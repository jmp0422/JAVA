package com.multi.b_check.dto;

public class BlackPink implements Singer {
    public void sing() {
        System.out.println("노래부르는 블핑");
    }

    @Override
    public void compose() {
        System.out.println("작곡하는 블핑");
    }

    @Override
    public void dance() {
        System.out.println("춤추는 블핑");

    }
}
