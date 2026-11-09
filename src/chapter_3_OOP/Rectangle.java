package chapter_3_OOP;

public class Rectangle {

    private double length;
    private double width;

    public void setSides(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return this.length * this.width;
    }
}
