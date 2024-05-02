package com.multi.a_constructor;

public class Bank {
    public static void main(String[] args) {

        Account acc1 = new Account("재민", "정기적금", 10000);
        System.out.println(acc1);

        Account acc2 = new Account("재민", "청약적금");
        System.out.println(acc2);
        acc2.setMoney(200000);
        System.out.println(acc2);

        Account acc3 = new Account("재민3", 10000);
        System.out.println(acc3);

    }
}
