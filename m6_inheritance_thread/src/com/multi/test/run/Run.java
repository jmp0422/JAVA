package com.multi.test.run;

import com.multi.test.Pen;

public class Run {
    public static void main(String[] args) {
        Pen s = new Pen(3000, "모나미", "2B");
        System.out.println(s);
        s.write();
        s.buy();
    }
}
