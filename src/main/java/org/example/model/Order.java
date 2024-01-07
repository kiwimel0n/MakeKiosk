package org.example.model;

import java.util.LinkedList;

public class Order extends Product {

   // int quantity = 0;
    double totalPrice = 0;

    public static LinkedList<Product> addPurchase = new LinkedList<>();

    public static LinkedList<Product> orderList = new LinkedList<>();
    public static LinkedList<Product> addCart =new LinkedList<>();
   /* public static LinkedList<Order> orderList = new LinkedList<>();
    public Order(String menuName,int quantity ,double productPrice,String description){
            super(menuName,productPrice,description);
            this.quantity = quantity;
    }*/

}
