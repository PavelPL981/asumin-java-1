package chapter_3_OOP;

public class Box {

    double length;
    double width;
    double height;

    public Box(int side) {
        this(side, side, side);
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box (Box another) {
        this(another.length, another.width, another.height);
    }

    public int compare(Box anjtherBox) {
        int result;
        double currentVolume = getVolume();
        double anotherVolume = anjtherBox.getVolume();
        if (currentVolume > anotherVolume) {
            result = 1;
        } else if (currentVolume < anotherVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    public Box copy() {
        return new Box(length, width, height);
    }

    public Box increase() {
        return new Box(2 * length, 2 * width, 2 * height);
    }

    public double getVolume() {
        return length * width * height;
    }

    public void showVolume() {
        System.out.println(getVolume());
    }
}
