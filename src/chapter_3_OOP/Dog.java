package chapter_3_OOP;

public class Dog {

    private String nick;
    private String breed;
    private double weight;
    private int speed;

    public Dog(String nick, String breed, double weight, int speed) {
        this.nick = nick;
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
    }

    public String infoAboutDog() {
        return nick + " " + breed + " " + weight + " " + speed;
    }

    public void run() {
        for (int i = 0; i < speed; i++) {
            System.out.println("run");
        }
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
