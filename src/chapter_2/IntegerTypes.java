package chapter_2;

public class IntegerTypes {

    static void main() {
        int speed = 300_000;
        long distance = 365L * 24 * 60 * 60 * speed;
        System.out.println(distance);

        int a = 5;
        a++;
        System.out.println(a);

        byte b = 127;
        b++;
        System.out.println(b);

        b = (byte) (b + 10);
        System.out.println(b);
    }
}
