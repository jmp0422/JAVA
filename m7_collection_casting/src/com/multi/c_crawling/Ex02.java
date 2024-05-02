package com.multi.c_crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
            Elements list = doc.select("td.first").select(".blind");
//            System.out.println(list);

            Element tag= list.get(0);
            System.out.println("전일가: " + tag.text());

            Element tag1= list.get(1);
            System.out.println("시가: " + tag1.text());

            Elements list1 = doc.select("div.today").select(".blind");
//            System.out.println(list1);

            Element tag2= list.get(0);
            System.out.println("현재가: " + tag2.text());


//            for (int i = 0; i < list.size(); i++) {
//                Element tag = list.get(i); //Element는 tag
//                System.out.println(tag.text());
//            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
