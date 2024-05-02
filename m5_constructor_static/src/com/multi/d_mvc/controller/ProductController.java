package com.multi.d_mvc.controller;

import com.multi.d_mvc.model.dto.Product;

public class ProductController {

    private Product pro = null;

    public void insertProduct(String name, String brand, int price) {
        pro = new Product(name, brand, price);
    }

    //조회
    public Product selectProduct(){
        return pro;
    }

    //가격수정
    public void updatePrice(int price){
        pro.setPrice(price);
    }


}
