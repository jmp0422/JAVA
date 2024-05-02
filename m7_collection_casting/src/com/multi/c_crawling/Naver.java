package com.multi.c_crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Naver {
    public String[] crawl(String code){
        String[] result = null;
        try{
            Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code="+code).get();

            Elements list = doc.select("h2>a");
            if(!list.isEmpty()){
                String name = list.get(0).text();
                System.out.println("회사이름 : " + name);

                Elements list2 = doc.select("span.code");
                String code2 = list2.get(0).text();
                System.out.println("회사코드: " + code2);

                Elements list1 = doc.select("div.today").select(".blind");

                String now = list1.get(0).text();//현재가
                String dif = list1.get(1).text(); //차이
                String percent = list1.get(2).text(); //증감비율


                System.out.println("현재가: " + now);
                System.out.println("어제와의 차이: " + dif);
                System.out.println("증감비율: " + percent);
                System.out.println("-------------------------------------------");

                result = new String[]{name, code, now, dif, percent};

            }

        }catch(IOException e){
            throw new RuntimeException(e);
        }
        return result;
    }
}
