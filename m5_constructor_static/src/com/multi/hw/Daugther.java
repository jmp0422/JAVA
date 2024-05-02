package com.multi.hw;

public class Daugther {
    private String name;
    private String gender;
    static int count;
    static int money = 25000;

    public Daugther(String name, String gender) {
        this.name = name;
        this.gender = gender;
        count++;
        money-=1000;
    }

    public static void WatchTv(){
        System.out.println("아빠안잔다");
    }

    @Override
    public String toString() {
        return "Daugther{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
