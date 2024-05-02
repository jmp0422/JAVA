package com.multi.hw;

public class Longjump extends Athlectics{
    private int oneteam;

    public Longjump(String sort, String howto, int oneteam) {
        super(sort, howto);
        this.oneteam = oneteam;
    }

    public void jump(){
        System.out.println("높고 멀리뛰다");
    }

    public int getOneteam() {
        return oneteam;
    }

    public void setOneteam(int oneteam) {
        this.oneteam = oneteam;
    }

    @Override
    public String toString() {
        return "Longjump{" + "sort='" + getSort() + '\'' + "howto='" + getHowto() + '\'' +
                "oneteam=" + oneteam +
                '}';
    }
}
