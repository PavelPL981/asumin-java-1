package chapter_2;

public class LoopTask {

    static void main() {
        for (int i = 1000; i > 0 ; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
