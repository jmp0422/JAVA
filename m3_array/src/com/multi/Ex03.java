package com.multi;

import javax.swing.*;

public class Ex03 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500,500);

        String[] header = {"a","b","c"}; //테이블의 열 이름 설정
        String[][] contents = { // 테이블에 들어갈 데이터를 2차원 배열로 초기화 = {"a", "b", "c"};
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"}
        };

        contents[0][0] = "999";
        contents[10][1] = "999";
        contents[8][2] = "999";


        JTable table = new JTable(contents, header);
        JScrollPane scroll = new JScrollPane(table); //JTable을 JScrollPane에 포함시켜 스크롤 가능하게함

        f.add(scroll);
        f.setVisible(true);

        // contents.length: 2차원 배열의 행 개수(11개)
        // 이중 for문을 사용하여 배열의 내용을 콘솔에 출력
        for (int i = 0; i < contents.length; i++) { // 행을 순회하는 외부 for문
            for (int j = 0; j < contents[i].length; j++) { // 열을 순회하는 내부 for문, 각 행의 열 데이터를 출력
                System.out.print(contents[i][j] + " ");
            }
            System.out.println(); // 한 행의 출력이 끝날 때마다 줄바꿈
        }
    }
}
