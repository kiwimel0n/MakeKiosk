package org.example.view;

import org.example.model.Menu;
import org.example.model.Order;
import org.example.model.Product;
import org.example.model.typeoffood.Burgers;
import org.example.model.typeoffood.Chickens;
import org.example.model.typeoffood.Drinks;
import org.example.model.typeoffood.SideAndSnack;


import java.util.LinkedList;

import static org.example.model.Order.orderList;

public class OutputKiosk {
    public static Product addCart1 = null;

    public LinkedList<Menu> MenuList = new LinkedList<>();

    
    public void initMenu() {
        Menu Menu1 = new Menu("Burgers", "주문 즉시 바로 조리해 맛있는 맘스터치 버거~!");
        Menu Menu2 = new Menu("Chickens", "맘스터치만의 조리법으로 겉바속촉한 맘스터치 치킨~");
        Menu Menu3 = new Menu("SideAndSnack", "어떤 메뉴와도 어울려 먹을 수 있는 사이드메뉴");
        Menu Menu4 = new Menu("Drinks", "맘스터치 요리와 궁합인 음료수들");

        MenuList.clear();
        MenuList.add(Menu1);
        MenuList.add(Menu2);
        MenuList.add(Menu3);
        MenuList.add(Menu4);

    }


    public void displayLine() {
        System.out.println("---------------------------------------------------------");
    }

    public void welcomeMessage() {
        System.out.println("\n" + "    올바른 음식을 통해 건강, 행복, 즐거운 미래를 만들어가는");
        System.out.println("              맘스터치에 오신것을 환영합니다.");
    }
    
    //메인 메뉴화면 출력
    public void displayMainMenu() {
        welcomeMessage();
        displayLine();
        initMenu();
        System.out.println("                    [맘스터치 메뉴]" + "\n");
        for (int i = 0; i < MenuList.size(); i++) {
            Menu Menu = MenuList.get(i);
            System.out.printf("%d. %-15s| %s\n", i + 1, Menu.getMenuName(), Menu.getDescription());
        }
        System.out.println();
        displayLine();
        System.out.println("                    [ 주문 메뉴 ]" + "\n");
        System.out.printf("%d. %-10s| %s\n", 5, "Order", "장바구니를 확인 후 주문합니다");
        System.out.printf("%d. %-10s| %s\n", 6, "Cancel", "진행중인 주문을 취소합니다");
        displayLine();
    }


    //상세메뉴 출력
    public void displayCategoryMenu(int menuNumber) {
        Drinks.initDrinks();
        Burgers.initBurgers();
        Chickens.initChickens();
        SideAndSnack.initSAS();

        Order.addPurchase.clear();

        switch (menuNumber) {
            case 1:
                Order.addPurchase = new LinkedList<>(Burgers.BurgerList);
                welcomeMessage();
                System.out.println("\n" + "아래 상품 메뉴판을 보시고 상품을 골라 입력해주세요.");
                System.out.println(" [ Burgers MENU ] ");
                System.out.println();
                for (int bList = 0; bList < Burgers.BurgerList.size(); bList++) {
                    Product Burger = Burgers.BurgerList.get(bList);
                    System.out.printf("%d. %-8s| W %.1f | %s\n", bList + 1, Burger.getMenuName(), Burger.getProductPrice(), Burger.getDescription());

                }
                displayLine();
                break;
            case 2:
                Order.addPurchase = new LinkedList<>(Chickens.ChickenList);
                welcomeMessage();
                System.out.println("\n" + "아래 상품 메뉴판을 보시고 상품을 골라 입력해주세요.");
                System.out.println(" [ Chickens MENU ] ");
                System.out.println();
                for (int cList = 0; cList < Chickens.ChickenList.size(); cList++) {
                    Product Chicken = Chickens.ChickenList.get(cList);
                    System.out.printf("%d. %-8s| W %.1f | %s\n", cList + 1, Chicken.getMenuName(), Chicken.getProductPrice(), Chicken.getDescription());
                }
                displayLine();

                break;
            case 3:
                Order.addPurchase = new LinkedList<>(SideAndSnack.SASList);
                welcomeMessage();
                System.out.println("\n" + "아래 상품 메뉴판을 보시고 상품을 골라 입력해주세요.");
                System.out.println(" [ SideAndSnack MENU ] ");
                System.out.println();
                for (int sList = 0; sList < SideAndSnack.SASList.size(); sList++) {
                    Product SAS = SideAndSnack.SASList.get(sList);
                    System.out.printf("%d. %-8s| W %.1f | %s\n", sList + 1, SAS.getMenuName(), SAS.getProductPrice(), SAS.getDescription());

                }
                displayLine();
                break;
            case 4:
                Order.addPurchase = new LinkedList<>(Drinks.DrinkList);
                welcomeMessage();
                System.out.println("\n" + "아래 상품 메뉴판을 보시고 상품을 골라 입력해주세요.");
                System.out.println(" [ Drinks MENU ] ");
                System.out.println();
                for (int dList = 0; dList < Drinks.DrinkList.size(); dList++) {
                    Product Drink = Drinks.DrinkList.get(dList);
                    System.out.printf("%d. %-8s| W %.1f | %s\n", dList + 1, Drink.getMenuName(), Drink.getProductPrice(), Drink.getDescription());

                }
                displayLine();
                break;
            case 5:
                System.out.println("아래와 같이 주문 하시겠습니까?");
                System.out.println(" [ Order ] ");
                double totalPrice = 0;
                for(Product orderListCheck : orderList) {
                    System.out.printf(" %-8s| W %.1f | %s\n", orderListCheck.getMenuName(), orderListCheck.getProductPrice(), orderListCheck.getDescription());
                    totalPrice += orderListCheck.getProductPrice();
                }
                System.out.println("\n"+ " [ Total ] "+ "\n"+ "W " + totalPrice+ "\n");
                System.out.println("1. 주문"+"\t\t"+"2. 메뉴판");
                break;
            case 6:
                System.out.println("진행하던 주문을 취소하겠습니까?");
                System.out.println("1. 확인"+"\t\t"+"2. 취소");
                break;
            default:
                System.out.println("잘못된 메뉴 선택입니다. 다시 선택해 주세요.");
                displayLine();
                displayLine();
                displayLine();
                displayLine();
                displayMainMenu();

        }
    }

    //구매화면 출력
    public void displayPurchaseMenu(int menuSelect) {
        addCart1 = Order.addPurchase.get(menuSelect-1);
        System.out.printf(" %-8s| W %.1f | %s\n", addCart1.getMenuName(),addCart1.getProductPrice(), addCart1.getDescription());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인\t\t2. 취소");
        displayLine();
    }

    //주문완료 화면
    public void perfOrder(){
        System.out.println("주문이 완료되었습니다.!"+"\n");
        System.out.println("대기번호는 [ 1 ] 번 입니다.");


    }

}
