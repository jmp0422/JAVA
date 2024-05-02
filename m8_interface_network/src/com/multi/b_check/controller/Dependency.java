package com.multi.b_check.controller;

import com.multi.b_check.dto.BeanFactory;
import com.multi.b_check.dto.BlackPink;
import com.multi.b_check.dto.IU;
import com.multi.b_check.dto.Singer;

import java.util.Scanner;

public class Dependency {
    public void doGet() {

        //1. 일반객체생성
        IU singer = new IU();
        singer.sing();
        singer.compose();


        //2. 인터페이스를 사용하여 결합도를 낮춤(결합도를 낮추다 -> 세세한코딩은 아니지만 편리성은올라감(범용성이올라감))
        Singer singer1 = new BlackPink();
        singer1.sing();
        singer1.compose();

        //3. 전략 디자인 패턴 - 결합도 낮춤
        Scanner sc = new Scanner(System.in);
        System.out.println("가수이름을 입력하세요.");

        String enter = sc.nextLine();
        Singer singer2 = (Singer)BeanFactory.getBean(enter); //다운형변환
        singer.sing();
    }

}
