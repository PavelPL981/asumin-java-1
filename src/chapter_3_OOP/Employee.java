package chapter_3_OOP;

public class Employee {

    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("Name: " + this.name + ", grade: "
                + this.position + ", salary: " + this.salary);
    }
}
