package com.multi.b_app01;

import java.util.Arrays;

public class ex08 {
    public static void main(String[] args) {
        String s1 = " 011-245-1234 ";
        String s = s1.trim(); //공백제거

        String first = s.substring(0, 3); //011
        String second = s.substring(4, 7); //245
        System.out.println(first + " " + second);

        String s2 = "양파, 감자, 고구마";  //문자열생성
        String[] s3 = s2.split(","); // ,기준으로 문자열을 나눔  -> 나눈것은 문자열배열에 저장
        System.out.println(Arrays.toString(s3)); // 문자열배열 프린트



    }
//    //3. 문자열의 비교
//		switch (first) {
//        case "011":
//            System.out.println("SK");
//            break;
//        case "019":
//            System.out.println("LG");
//            break;
//        default:
//            System.out.println("APPLE");
//            break;
//    }
//    //4. 문자열의 길이
//		if (second.length() >= 4) {
//        System.out.println("최신폰");
//    } else {
//        System.out.println("올드폰");
//    }
}
