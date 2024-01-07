package org.example.model;

public class Menu {
    String menuName;
    String description;

    public Menu() {

    }

    public Menu(String menuName, String description){
        this.menuName = menuName;
        this.description = description;
    }

    public String getMenuName() {

        return this.menuName;
    }

    public String getDescription() {

        return this.description;
    }
}
