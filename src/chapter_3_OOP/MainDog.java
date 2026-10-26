package chapter_3_OOP;

public class MainDog {

    static void main() {
        Dog dog = new Dog("Alyi", "korgi", 18.4, 5);

        String info = dog.infoAboutDog();
        System.out.println(info);

        dog.run();
    }
}
