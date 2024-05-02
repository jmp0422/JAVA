package com.multi.a_constructor;

public class BoardMain {
    public static void main(String[] args) {

        Board Bo1 = new Board(1,"게시판", "내용", "작성자");
        Board Bo2 = new Board(2,"게시판2", "내용2", "작성자2");
        Board Bo3 = new Board(3,"게시판3", "내용3", "작성자3");
        System.out.println(Bo1);
        System.out.println(Bo2);
        System.out.println(Bo3);

    }
}
