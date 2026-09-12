package chapter_2;

/**
 * 2.7 Типы данных. String
 */

public class StringTest {

    static void main() {
        String name = "John";
        int age = 30;
        String result = "Hello \"" + name + "\"!\nYou are " + age + " years old.";
        System.out.println(result);
    }
}
