package org.example.model.typeoffood;

import org.example.model.Product;

import java.util.LinkedList;

public class Chickens extends Product {
    public static LinkedList<Product> ChickenList = new LinkedList<>();

    public static void initChickens(){
        Product Chicken1 = new Product("후라이드싸이순살", 11.9, "케이준 양념 레시피로 더 바삭하고 스파이시한 닭다리살 순살치킨");
        Product Chicken2 = new Product("맘스양념싸이순살",13.9, "국내산 벌꿀 함유 매콤달콤 특제 양념소스의 닭다리살 순살치킨");
        Product Chicken3 = new Product("간장마늘싸이순살",13.9, "알싸한 마늘 향과 특제 간장소스의 닭다리살 순살치킨");
        Product Chicken4 = new Product("치즈뿌치싸이순살(체다)",13.9, "체다치즈맛 시즈닝과 싸이순살의 만남! 체다치즈의 고소함과 짭잘한 시즈닝이 중독적인 닭다리살 순살치킨");

        ChickenList.clear();
        ChickenList.add(Chicken1);
        ChickenList.add(Chicken2);
        ChickenList.add(Chicken3);
        ChickenList.add(Chicken4);
    }

}
