package Contoh3;

public class Human extends Character {
    protected int strength;
    
    public Human(String name, int level, int health, int strength) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.strength = strength;
    }

    public void specialAttack(Character target) {
        target.health = target.health - 10 - strength;
    }
}

