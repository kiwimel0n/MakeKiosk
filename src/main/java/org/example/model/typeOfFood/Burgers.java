package org.example.model.typeOfFood;

import org.example.model.Product;

import java.util.LinkedList;


public class Burgers extends Product {
    public static LinkedList<Product> BurgerList = new LinkedList<>();

    //static을 넣어줌으로써 따로 클래스를 인스턴스화 하지않고 호출할 수 있다.
    public static void initBurgers(){
        Product burger1 = new Product("싸이버거",4.6, "바삭하고 매콤한 치킨 패티와 신선한 양상추가 조화를 이루는 맘스터치 시그니처 버거");
        Product burger2 = new Product("화이트갈릭버거",5.2, "부드러운 화이트갈릭소스에 프리미엄 더블햄과 통가슴살 패티까지 담은 묵직한 버거");
        Product burger3 = new Product("언빌리버블버거",6.2, "통새우, 에그프라이, 통가슴살 패티에 매콤한 스리라차마요소스를 더한 대확행 버거");
        Product burger4 = new Product("싸이플렉스버거",7.7, "통다리살 싸이패티가 2장! 압도적 사이즈의 FLEX, 리얼 입찢버거 싸이플렉스버거");
        Product burger5 = new Product("인크레더블버거",5.7, "프리미엄 더블햄, 에그프라이, 통다리살 패티에 아삭아삭한 양상추와 양파까지 풍성한 버거");

        BurgerList.clear();
        BurgerList.add(burger1);
        BurgerList.add(burger2);
        BurgerList.add(burger3);
        BurgerList.add(burger4);
        BurgerList.add(burger5);

    }
}
