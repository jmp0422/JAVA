package com.multi.hw0417;

import java.util.Scanner;

public class hw1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = Double.parseDouble(sc.next());

        if(result > 25) {
            System.out.println("너무더워요.");
        }else{
            System.out.println("괜찮아요");
        }

    }
}
