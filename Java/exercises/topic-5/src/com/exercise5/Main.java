package com.exercise5;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}