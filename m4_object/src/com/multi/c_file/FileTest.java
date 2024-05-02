package com.multi.c_file;

import java.io.File;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) {

        File f = new File("text.txt");

        boolean result = f.exists();
        System.out.println(result);
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());

        File folder = new File(".");
        System.out.println(folder.isDirectory());
        String[] list = folder.list();
        System.out.println(Arrays.toString(list));
    }
}
