package com.multi.hw;

public class Archery extends Athlectics{
    private int oneteam;

    public Archery(String sort, String howto, int oneteam) {
        super(sort, howto);
        this.oneteam = oneteam;
    }

    public void shoot(){
        System.out.println("과녁을 쏘아 10점을 획득");
    }

    public int getOneteam() {
        return oneteam;
    }

    public void setOneteam(int oneteam) {
        this.oneteam = oneteam;
    }

    @Override
    public String toString() {
        return "Archery{" + "sort='" + getSort() + '\'' + "howto='" + getHowto() + '\'' +
                "oneteam=" + oneteam +
                '}';
    }
}
