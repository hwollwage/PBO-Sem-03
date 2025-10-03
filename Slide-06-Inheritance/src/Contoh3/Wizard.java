package Contoh3;

public class Wizard extends Character {
    protected int spell;

    public Wizard(String name, int level, int health, int spell) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.spell = spell;
    }

    public void magic(Character target) {
        target.health -= 50;
        spell -= 1;
    }
}
