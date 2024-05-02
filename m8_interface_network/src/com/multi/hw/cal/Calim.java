package com.multi.hw.cal;

public class Calim implements Calcu{

    @Override
    public void sum(int x, int y) {
        System.out.println(x+"더하기 "+y+"는 "+(x+y)+ "입니다.");
    }

    @Override
    public void sub(int x, int y) {
        System.out.println(x+"빼기 "+y+"는 "+(x-y)+ "입니다.");
    }

    @Override
    public void mul(int x, int y) {
        System.out.println(x+"곱하기 "+y+"는 "+(x*y)+ "입니다.");
    }

    @Override
    public void div(int x, int y) {
        double result = (double) x / y;
        double result1 = Math.round(result*100)/100.0;
        System.out.println(x+"나누기 "+y+"는 "+result1+ "입니다.");
    }
}
