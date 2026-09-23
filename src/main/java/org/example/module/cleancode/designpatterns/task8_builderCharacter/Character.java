package org.example.module.cleancode.designpatterns.task8_builderCharacter;

public class Character {
    private String health;
    private int damage;
    private int armor;
    private String magic;

    public Character(String health, int damage, int armor, String magic) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.magic = magic;
    }

    public Character(Builder builder) {
        this.health = builder.health;
        this.damage = builder.damage;
        this.armor = builder.armor;
        this.magic = builder.magic;
    }

    static class Builder{
        private String health;
        private int damage;
        private int armor;
        private String magic;

        public Builder setHealth(String health) {
            this.health = health;
            return this;
        }

        public Builder setDamage(int damage) {
            this.damage = damage;
            return this;
        }

        public Builder setArmor(int armor) {
            this.armor = armor;
            return this;
        }

        public Builder setMagic(String magic) {
            this.magic = magic;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }
}
