package com.multi.b_app01;

public class ex03 {
    public static void main(String[] args) {
        int sum = 0;
        int[] num = new int[1000];

        for (int i = 0; i < num.length; i++) {
            int ran = (int) (Math.random() * 100) + 1;  //random이 for문 밖에있으면 할당되는값이 하나밖에 없으므로 주의할것
            num[i] = ran;
        }
        for(int n : num) {
            if (n > 80){
                sum++;
            }
        }

        System.out.println(sum);
    }
}
