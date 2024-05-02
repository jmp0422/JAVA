package com.multi.hw;

public class Soccer extends Ballgames{
    private int oneteam;

    public Soccer(String sort, String howto, int oneteam) {
        super(sort, howto);
        this.oneteam = oneteam;
    }

    public void goal(){
        System.out.println("공을 넣어 득점하다");
    }

    public int getOneteam() {
        return oneteam;
    }

    public void setOneteam(int oneteam) {
        this.oneteam = oneteam;
    }

    @Override
    public String toString() {
        return "Soccer{" + "sort='" + getSort() + '\'' + "howto='" + getHowto() + '\'' +
                "oneteam=" + oneteam +
                '}';
    }
}
