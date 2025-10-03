package Contoh3;

public class Angel extends Character {
    protected int potion;

    public Angel(String name, int level, int health, int potion) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.potion = potion;
    }

    public void cure(Character target) {
        target.health = 100;
        potion -= 1;
    }
}