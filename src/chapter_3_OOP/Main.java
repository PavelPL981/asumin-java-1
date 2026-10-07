package chapter_3_OOP;

public class Main {

    static void main() {
        Box box1 = new Box();
        box1.height = 10;
        box1.width = 10;
        box1.length = 10;

        Box box2 = new Box();
        box2.height = 20;
        box2.width = 20;
        box2.length = 20;

        Box box3 = box2;
        box3.length = 0;

        double volume1 = box1.height * box1.width * box1.length;
        System.out.println("Volume of Box1 is: " + volume1);

        double volume2 = box2.height * box2.width * box2.length;
        System.out.println("Volume of Box2 is: " + volume2);

        Human human1 = new Human("Petr", 40, 90.4);
        Human human2 = new Human("John", 10, 30.6);
        Human human3 = new Human("Olga", 18, 56.8);

        double averageAge = (human1.getAge() +  human2.getAge() + human3.getAge()) / 3.0;
        System.out.println("Average Age is: " + averageAge);
    }
}
