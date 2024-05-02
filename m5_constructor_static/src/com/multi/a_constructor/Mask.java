package com.multi.a_constructor;

public class Mask {

    public String color;
    public int price;
    public int num;

    public Mask(String color, int price, int num) {
        this.color = color;
        this.price = price;
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Mask{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
