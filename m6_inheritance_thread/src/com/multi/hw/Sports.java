package com.multi.hw;

public class Sports {
    private String sort;

    public Sports(String sort) {
        this.sort = sort;
    }

    public void sweat(){
        System.out.println("땀흘리다");
    }

    public void funny(){
        System.out.println("즐기다");
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "sort='" + sort + '\'' +
                '}';
    }
}
