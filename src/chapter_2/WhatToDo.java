package chapter_2;

/**
 * 2.6 Типы данных. Boolean
 */

public class WhatToDo {

    static void main() {
        boolean isGoodWeather = true;
        boolean isNight = false;

        if (isNight) {
            System.out.println("Sleep");
        }
        if (!isNight && isGoodWeather) {
            System.out.println("Go for a walk");
        }
        if (!isNight && !isGoodWeather) {
            System.out.println("Read a book");
        }
    }
}
