package com.ex;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Category electronics = new Category("전자제품");


        Product p1 = new Product("Galaxy S24", 1200000, "최신 안드로이드 스마트폰", 30);
        Product p2 = new Product("iPhone 15", 1350000, "Apple의 최신 스마트폰", 30);
        Product p3 = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 15);
        Product p4 = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 50);

        electronics.getProducts().add(p1);
        electronics.getProducts().add(p2);
        electronics.getProducts().add(p3);
        electronics.getProducts().add(p4);


        Category clothes = new Category("의류");
        Category food = new Category("식품");


        List<Category> categories = new ArrayList<>();
        categories.add(electronics);
        categories.add(clothes);
        categories.add(food);


        Customer customer = new Customer("홍길동", "hong1234@example.com", "GOLD");


        CommerceSystem commerceSystem = new CommerceSystem(categories);
        commerceSystem.start();
    }
}


