package chapter_3_OOP;

public class Main {

    static void main() {
        Box current = new Box(10);
        Box another = new Box(20);

        int compare = current.compare(another);
        System.out.println(compare);

        Box box = new Box(current);

        current.showVolume();
        another.showVolume();
        box.showVolume();

        Box copy = box.copy();
        copy.showVolume();

        Box big = box.increase();
        big.showVolume();
    }
}
