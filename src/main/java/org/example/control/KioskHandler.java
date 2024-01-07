package org.example.control;

import static org.example.model.Order.orderList;
import static org.example.view.OutputKiosk.addCart1;
import org.example.view.OutputKiosk;

import java.util.Scanner;

public class KioskHandler {


    //장바구니 구매확정
    public void addToCart(){
        orderList.add(addCart1);
        System.out.printf("%s 가 장바구니에 추가되었습니다.", addCart1.getMenuName());
        kioskProcess();
    }

    //장바구니 넣기 취소
    public void menuSelectCancel(int menuIdx) {
        OutputKiosk kiosk = new OutputKiosk();
        kiosk.displayCategoryMenu(menuIdx);
    }

    //구매화면 과정
    public void purchaseProcess(int menuCheck, int menuIdx, int menuSelect){
        OutputKiosk kiosk = new OutputKiosk();
        Scanner Scanner = new Scanner(System.in);
        if (menuCheck == 1) {
            addToCart();
        } else if (menuCheck == 2) {
            menuSelectCancel(menuIdx);
        } else {
            System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            kiosk.displayPurchaseMenu(menuSelect);
            menuCheck = Scanner.nextInt();
            purchaseProcess(menuCheck, menuIdx, menuSelect);

        }
    }

    //주문취소 화면 과정
    public void cancelAddCart(){
        Scanner Scanner = new Scanner(System.in);
        int menuCancel = Scanner.nextInt();
        if(menuCancel == 1){
            orderList.clear();
            System.out.println("진행하던 주문이 취소되었습니다.");
            kioskProcess();
        }else if(menuCancel == 2){
            kioskProcess();
        }
    }

    //키오스크 동작과정
    public void kioskProcess(){
        Scanner Scanner = new Scanner(System.in);
        OutputKiosk kiosk = new OutputKiosk();

        int menuIdx;
        int menuSelect;
        int menuCheck;
        do {
            kiosk.displayMainMenu();
            menuIdx = Scanner.nextInt();
            kiosk.displayCategoryMenu(menuIdx);
            if(menuIdx >=1 && menuIdx <= 4){
                menuSelect = Scanner.nextInt();
                kiosk.displayPurchaseMenu(menuSelect);
                menuCheck = Scanner.nextInt();
                purchaseProcess(menuCheck, menuIdx, menuSelect);
                kioskProcess();
            }else if(menuIdx == 5){
                menuSelect = Scanner.nextInt();
                if(menuSelect == 1 ){
                    kiosk.perfOrder();
                    orderList.clear();
                    kioskProcess();
                }else if (menuSelect == 2){
                    kioskProcess();
                }
            }else if(menuIdx == 6){
                cancelAddCart();
            }

        } while(menuIdx < 7);
        menuIdx = 8;

    }
}
