package com.multi.hw;

public class Ballgames extends Sports{
    private String howto;

    public Ballgames(String sort, String howto) {
        super(sort);
        this.howto = howto;
    }

    public void control(){
        System.out.println("세심한 컨트롤을 필요로하다");
    }

    public String getHowto() {
        return howto;
    }

    public void setHowto(String howto) {
        this.howto = howto;
    }

    @Override
    public String toString() {
        return "Ballgames{" +
                "howto='" + howto + '\'' +
                '}';
    }
}
