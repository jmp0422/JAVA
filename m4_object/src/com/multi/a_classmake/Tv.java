package com.multi.a_classmake;

public class Tv {

    private int ch;
    private int vol;
    private boolean onoff;

    //on켜지다 off꺼지다


    public boolean getOnoff() {
        return onoff;
    }

    public void setOnoff(boolean onoff) {
        if(true) {
            this.onoff = onoff;
            System.out.println("tv on");
        }
        else
            System.out.println("tv off");
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }
}
