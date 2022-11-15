package com.exercise2;

public class IVA {
    public static double getTotalPrice(double price) {
        return price + (price * 0.18);
    }

    public static void main(String[] args) {
        System.out.println("Price before IVA: " + 18.00);
        System.out.println("Price after IVA: " + getTotalPrice(18.00));
    }
}
