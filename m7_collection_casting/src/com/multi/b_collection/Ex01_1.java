package com.multi.b_collection;

import java.util.LinkedList;

public class Ex01_1 {
    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        test.add("국어");
        test.add("수학");
        test.add("영어");
        test.add("컴퓨터");
        for (int i = 0; i < test.size(); i++) {
            System.out.print(test.get(i) + " ");
        }
        System.out.println(test);
        test.remove(); //첫번째항복삭제

        System.out.println(test);
    }
}
