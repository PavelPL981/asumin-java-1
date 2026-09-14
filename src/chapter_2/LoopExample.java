package chapter_2;

/**
 * 2.8 Циклы
 */

public class LoopExample {

    static void main() {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            if (i == 9) {
                break;
            }
            i++;
        }

        int a = 0;
        do {
            System.out.println("Hello!");
        } while (a > 0);
    }
}
