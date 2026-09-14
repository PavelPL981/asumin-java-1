package chapter_2;

public class ForEachTask {

    static void main() {
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 100 + i;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
