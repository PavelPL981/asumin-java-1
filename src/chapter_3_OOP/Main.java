package chapter_3_OOP;

public class Main {

    static void main() {
        MyMath myMath = new MyMath();
        System.out.println(MyMath.multiple(10, 2));
        System.out.println(MyMath.multiple(10.5, 2.8));
        System.out.println(MyMath.multiple(5));

        double sqrt = Math.sqrt(36);
        System.out.println(sqrt);

        System.out.println(Math.min(10, 5));

        Monster monster = new Monster();
        //monster.voice();
        monster.voice(2);
        monster.voice(3, "AAAA");

    }
}
