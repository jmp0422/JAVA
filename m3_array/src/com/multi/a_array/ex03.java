package com.multi.a_array;

public class ex03 {
    public static void main(String[] args) {
        String[] names = new String[2];
        names[0] = "재민1";
        names[1] = "재민2";
        // for each문으로 변경
//        String[] names = {"재민1","재민2"};
//        for (String n : names)

        System.out.println("이름개수 : " + names.length);

        char[] c = new char[2];
        System.out.println(c);
        c[0] = 'a';
        c[1] = 'b';
        System.out.println(c[1]);
        System.out.println(c);

    }
}
