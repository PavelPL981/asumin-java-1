package chapter_2;

/**
 * 2.9 Массивы
 */

public class ArrayExample {

    static void main() {
        String[] namesOfMonth = new String[12];
        namesOfMonth[0] = "January";
        namesOfMonth[1] = "February";
        namesOfMonth[2] = "March";
        namesOfMonth[3] = "April";
        namesOfMonth[4] = "May";
        namesOfMonth[5] = "June";
        namesOfMonth[6] = "July";
        namesOfMonth[7] = "August";
        namesOfMonth[8] = "September";
        namesOfMonth[9] = "October";
        namesOfMonth[10] = "November";
        namesOfMonth[11] = "December";

        for (int i = 0; i < namesOfMonth.length; i++) {
            if (i == 11) {
                System.out.println((i + 1) + ": " + namesOfMonth[i] + ".");
                break;
            }
            System.out.println((i + 1) + ": " + namesOfMonth[i] + ",");
        }
    }
}
