package org.example.model.typeOfFood;

import org.example.model.Product;

import java.util.LinkedList;

public class Drinks extends Product {
    public static LinkedList<Product> DrinkList = new LinkedList<>();

    public static void initDrinks(){
        Product Drink1 = new Product("콜라", 2.0,"버거의 단짝! 기름끼를 내려줄 탄산량! 시원하게 한잔하세요");
        Product Drink2 = new Product("사이다", 2.0, "시원한 청량감으로 답답함을 내려줄 사이다");
        Product Drink3 = new Product("에이드", 3.5,"세가지 맛 이 있는 에이드를 골라주세요");
        Product Drink4 = new Product("커피", 2.5,"아메리카노입니다.");

        DrinkList.clear();
        DrinkList.add(Drink1);
        DrinkList.add(Drink2);
        DrinkList.add(Drink3);
        DrinkList.add(Drink4);

    }
}
