package com.multi.hw;

public class Basketball extends Ballgames{
    private int oneteam;

    public Basketball(String sort, String howto, int oneteam) {
        super(sort, howto);
        this.oneteam = oneteam;
    }

    public void pass(){
        System.out.println("동료에게 패스를하다");
    }

    public int getOneteam() {
        return oneteam;
    }

    public void setOneteam(int oneteam) {
        this.oneteam = oneteam;
    }

    @Override
    public String toString() {
        return "Basketball{" + "sort='" + getSort() + '\'' + "howto='" + getHowto() + '\'' +
                "oneteam=" + oneteam +
                '}';
    }
}
