package org.example;

import org.example.view.OutputKiosk;
import org.example.control.Operation1;

import java.util.Scanner;

import static org.example.model.Order.orderList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Operation1 operate = new Operation1();
        orderList.clear();
        operate.kioskProcess();
    }
}