package chapter_2;

/**
 * 2.10 Цикл For each
 */

public class ForEachExample {

    static void main() {
        String[] names = {
                "Ivan",
                "Petr",
                "Olga",
                "Dina",
                "John",
                "Alex"
                };

        for (String name : names) {
            System.out.println(name);
        }
    }
}
