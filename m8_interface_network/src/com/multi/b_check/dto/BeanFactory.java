package com.multi.b_check.dto;

public class BeanFactory {
    public static Object getBean(String name){
        Singer singer = null;

        if(name.equals("IU")){
            singer = new IU();

        }else{
            singer = new BlackPink();
        }

        return singer;
    }
}
