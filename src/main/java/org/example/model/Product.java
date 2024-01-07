package org.example.model;

public class Product extends Menu {

     double productPrice;

    public Product() {
        super();
    }

    public double getProductPrice(){

         return this.productPrice;
     }
    public Product(String menuName, double productPrice, String description ){
        super(menuName, description);
        this.productPrice = productPrice;

    }


}
