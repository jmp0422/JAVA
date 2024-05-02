package com.multi.b_check.dto;

public class IU implements Singer{
    @Override
    public void sing() {
        System.out.println("노래부르는 아이유");
    }

    @Override
    public void compose() {
        System.out.println("작곡하는 아이유");
    }

    @Override
    public void dance() {
        System.out.println("춤추는 아이유");

    }
}
