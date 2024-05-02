package com.multi;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {

        int math1 = 100;
        int math2 = math1;

        System.out.println("수학1: " + math1);
        System.out.println("수학2: " + math2);
        math2 = 90;
        System.out.println("수학1: " + math1);
        System.out.println("수학2: " + math2);

        // 참조형복사(주소가 복사, 얕은복사)
        int[] n1 = { 100, 200, 300 };
        int[] n2 = n1;//얕은복사 주소값을 복제해줌
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);

        n2[1] = 500;
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);

        int[] n3 =n1.clone(); //깊은복사 값만따오고 주소값은 따로씀
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n3);

        n3[1] = 999;
        System.out.println("n1: " + Arrays.toString(n1));
        System.out.println("n3: " + Arrays.toString(n3));
    }
}
//깊은복사
/* 1. for문을 이용한 동일한 인덱스의 값 복사
 * 2. Object의 clone()을 이용한 복사
 * 3. System의 arraycopy()를 이용한 복사
 * 4. Arrays의 copyOf()를 이용한 복사*/
