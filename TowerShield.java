package com.example.playground.Generics1;

public abstract class TowerShield implements Shield {
    public abstract int punchDamage();

    @Override
    public String toString() {
        return String.format("Защита %d  урон удара щитом %d", defence(), punchDamage());
    }
}