package chapter_2;

public class VariableHomework {

    public static void calculate(int days) {
        int year = days / 365;
        int month = (days - (year * 365)) / 30;
        int day = days - (year * 365) -  (month * 30);
        System.out.println("year: " + year);
        System.out.println("month: " + month);
        System.out.println("day: " + day);
    }

    static void main() {
        calculate(10000);
    }
}
