package com.multi.b_collection;

import java.util.HashSet;
import java.util.Random;

public class Ex02 { //로또번호만들기
    public static void main(String[] args) {
        Random r = new Random();
        HashSet lotto = new HashSet();

        for(int i=0; i<6; i++){
            int num = r.nextInt(45)+1;
            System.out.println(num);

            if(lotto.contains(num)){ //이미 로또안에 같은숫자가 있다면
                i--;
            }else{
                lotto.add(num); //중복숫자가 없다면 추가
            }
        }
        System.out.println(lotto);
    }
}
