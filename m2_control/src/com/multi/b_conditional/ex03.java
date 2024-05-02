package com.multi.b_conditional;

import javax.swing.*;

public class ex03 {
    public static void main(String[] args) {

        int ok = 0;
        int no = 0;
        int ect = 0;

        for (int i = 0; i < 5; i++) {
            String data = JOptionPane.showInputDialog("ok? no? ect?");
            if (data.equals("ok")) {
                System.out.println("긍정");
                ok += 1;
            } else if (data.equals("no")) {
                System.out.println("부정");
                no += 1;
            } else {
                System.out.println("잘모르겠음");
                ect += 1;
            }
        }
        System.out.println("ok : " + ok);
        System.out.println("no : " + no);
        System.out.println("ect : " + ect);
    }
}
