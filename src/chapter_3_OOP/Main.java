package chapter_3_OOP;

public class Main {

    static void main() {
        Rectangle rectangle = new Rectangle();
        rectangle.setSides(100, 80.5);
        double result = rectangle.calculateArea();
        System.out.println(result);
    }
}
