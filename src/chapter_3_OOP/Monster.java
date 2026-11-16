package chapter_3_OOP;

public class Monster {

    int eyes;
    int arms;
    int legs;

    public Monster() {
        this(2, 2, 2);
    }

    public Monster(int value) {
        this(value, value, value);
    }

    public Monster(int eyes, int arms, int legs) {
        this.eyes = eyes;
        this.arms = arms;
        this.legs = legs;
    }

    void voice() {
        voice(1, "Grrrrrr!!!!");
    }

    void voice(int count) {
        for (int i = 0; i < count; i++) {
            voice(count, "Grrrrrr!!!!");
        }
    }

    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}
