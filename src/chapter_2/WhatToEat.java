package chapter_2;

public class WhatToEat {

    static void main() {
        int money = 100;

        if (money > 0 && money < 50) {
            System.out.println("Pizza");
        } else if (money >= 50 && money < 100) {
            System.out.println("IceCream");
        }  else if (money >= 100) {
            System.out.println("Coffee");
        } else {
            System.out.println("To much money");
        }
    }
}
