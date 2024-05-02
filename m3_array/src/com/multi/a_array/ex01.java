package com.multi.a_array;

public class ex01 {
    public static void main(String[] args) {
        int[] nArr = {1, 2, 3, 4};
//        int[] : 타입
//        nArr: 주소
//        배역데이터 {1, 2, 3, 4}
        System.out.println(nArr);

        int[] nArr2 = new int[1000]; // 저장할 데이터의 크기를 알고있고 값은 모름
        System.out.println(nArr2);
        System.out.println(nArr2[0]);

        double[] height = {123.4, 234.2, 124.5}; //선언및할당
        double[] space = new double[500]; // 선언만
        char[] gender = {'남', '여', '남'};
        String[] space2 = new String[333];

        String[] tour = {"제주도", "부산", "일본", "싱가폴", "시애틀"};

        for (int i = 0; i < tour.length; i++) {
            System.out.print(tour[i] + " ");
        }
    }
}
