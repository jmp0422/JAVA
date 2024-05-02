package com.multi.a_classmake;

public class Dog {
    //필드부(속성)
    //색, 종류

    private String color;
    private String field;

    //메소드부 동작(기능)
    public void wagTail(){
        System.out.println("강아지 꼬리흔들고있음");
    }

    public void bark(){
        System.out.println("강아지가 멍멍 짖다");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", field='" + field + '\'' +
                '}';
    }
}
