package org.example.model.typeoffood;

import org.example.model.Product;

import java.util.LinkedList;

public class SideAndSnack extends Product {

    public static LinkedList<Product> SASList = new LinkedList<>();

    public static void initSAS(){
        Product SAS1 = new Product("케이준양념감자",2, "케이준스타일의 바삭한 양념감자, 맘스터치의 베스트 사이드 메뉴");
        Product SAS2 = new Product("바삭크림치즈볼(4조각)",3.7, "바삭하고 쫀득하게 즐기는 치즈볼");
        Product SAS3 = new Product("코울슬로",1.8 , "입맛을 돋우는 양배추의 아삭한 식감과 상큼한 맛의 코울슬로");
        Product SAS4 = new Product("콘샐러드", 1.8 , "달콤한 스위트콘에 신선한 야채까지");

        SASList.clear();
        SASList.add(SAS1);
        SASList.add(SAS2);
        SASList.add(SAS3);
        SASList.add(SAS4);
    }

}
