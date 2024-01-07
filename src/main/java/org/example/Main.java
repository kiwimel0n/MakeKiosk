package org.example;

import org.example.control.KioskHandler;

import static org.example.model.Order.orderList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        KioskHandler operate = new KioskHandler();
        orderList.clear();
        operate.kioskProcess();
    }
}