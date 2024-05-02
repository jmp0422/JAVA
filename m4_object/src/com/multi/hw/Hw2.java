package com.multi.hw;

public class Hw2 {
    public static void main(String[] args) {
        Calculator02 cafe = new Calculator02();
        int coffee = 2000;
        int milktea = 3000;
        int coffeecount = 5;
        int milkcount = 2;

        cafe.coffeesum(coffee, coffeecount);//커피 총 결제금액
        cafe.milksum(milktea, milkcount);//밀크티 총 결제금액
        cafe.div(5); //사람당 결제금액
        cafe.total();



    }
}
