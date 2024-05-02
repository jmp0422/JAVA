package com.multi.a_interface;

public abstract class AppleClass extends PhoneClass{
    //일반메서드 3개를 이미 가지고 시작
    //call(), internet(), text()
    //pay를 나라별로 다르게 처리하기 위해서 추상메서드로 구현

    public abstract void pay();

}
