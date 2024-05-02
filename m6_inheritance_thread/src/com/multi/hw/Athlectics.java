package com.multi.hw;

public class Athlectics extends Sports{
    private String howto;

    public Athlectics(String sort, String howto) {
        super(sort);
        this.howto = howto;
    }

    public void focus(){
        System.out.println("엄청난 집중력을 필요로하다");
    }

    public String getHowto() {
        return howto;
    }

    public void setHowto(String howto) {
        this.howto = howto;
    }

    @Override
    public String toString() {
        return "Athlectics{" +
                "howto='" + howto + '\'' +
                '}';
    }
}
