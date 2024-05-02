package com.multi.test;

public class Pen extends SchoolSub{
    private String thick;

    public Pen(int price, String company, String thick) {
        super(price, company);
        this.thick = thick;
    }

    public void write(){
        System.out.println("쓰다쓰다쓰다쓰다");
    }

    public String getThick() {
        return thick;
    }

    public void setThick(String thick) {
        this.thick = thick;
    }

    @Override
    public String toString() {
        return "Pen{" + "price=" + getPrice() +
                ", company='" + getCompany() + '\'' +
                "thick='" + thick + '\'' +
                '}';
    }
}
