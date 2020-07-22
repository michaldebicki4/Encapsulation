package com.company;

public class EnchancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnchancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 200){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0)
        {
            System.out.println("UMARTY");
        }
    }

    public int getHitPoints() {
        return hitPoints;

    }
}
