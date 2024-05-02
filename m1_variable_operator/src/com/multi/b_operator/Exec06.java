package com.multi.b_operator;


import javax.swing.*;

public class Exec06 {
    public static void main(String[] args) { //psvm,main tab시 자동생성

        String id = "root";
        String pw = "pass";

        String id2 = JOptionPane.showInputDialog("id : ");
        String pw2 = JOptionPane.showInputDialog("pw : ");

        if (id.equals(id2) && pw.equals(pw2)) {
            System.out.println("로그인성공");
        }else{
            System.out.println("로그인실패");
        }

    }
}
