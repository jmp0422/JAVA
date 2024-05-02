package com.multi.test;

import com.multi.test.run.Run;

public class SchoolSub extends Run {
    private int price;
    private String company;

    public SchoolSub(int price, String company) {
        this.price = price;
        this.company = company;
    }

    public void buy(){
        System.out.println("사다사다사다사다");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "SchoolSub{" +
                "price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}
