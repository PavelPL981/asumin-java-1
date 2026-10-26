package chapter_3_OOP;

public class Box {

    double length;
    double width;
    double height;

    public double getVolume() {
        return length * width * height;
    }

    public void showVolume() {
        System.out.println(getVolume());
    }
}
