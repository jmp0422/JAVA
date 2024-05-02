package com.multi.c_crawling;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        //크롤링 순서
        //1. 사이트 연결
        //2. 해당 페이지 다운로드(html)
        //3. 원하는 위치의 정보를 추출해냄

        Connection con = Jsoup.connect("https://www.naver.com/");
        System.out.println("1. 사이트연결 성공!!");

        Document doc = null;
        try{
            doc = con.get();
            System.out.println("2. 해당페이지 다운로드 성공!!"); //index.html
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//            System.out.println(doc);
            Elements list = doc.select("a");
            System.out.println(list.size());

            for(int i=0; i<list.size(); i++){
                Element tag = list.get(i); // Element는 태그를 나타냄
                System.out.println(tag.text());
            }

        }catch(IOException e){
            e.printStackTrace();
        }


        try {
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            Document doc1 = Jsoup.connect("https://news.naver.com/").get();
            Elements list2 = doc1.select("a");
            System.out.println(list2.size());
            for(int i = 0; i< list2.size(); i++){
                Element tag2 = list2.get(i);
                System.out.println(tag2.text());
            }
        }catch (IOException e ){
            e.printStackTrace();
        }


    }
}
