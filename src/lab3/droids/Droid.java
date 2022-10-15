package lab3.droids;

import java.util.Random;
/**
 * The base class of droid
 * That has base characteristic of every droid like name, health, isAlive, etc
 */
public class Droid {
    private String name; //name droid
    private int health;  //current hp
    private int maxhealth; //max hp
    private int armor; //armor class
    private boolean isAlive; // demonstrate: dead or live
    private int min_damage; // min damage
    private int power_weapon_prof;


    public static Random random = new Random(); //var fo all random variables

    /**
     * Constructor
     * @param name
     * @param maxhealth
     * @param armor
     */
    public Droid(String name, int maxhealth, int armor)
    {
        this.name = name;
        this.maxhealth = maxhealth;
        this.health = maxhealth;
        this.armor = armor;
        this.isAlive = true;
        this.power_weapon_prof = Droid.random.nextInt(4) + 1;
    }

    /**
     * Getter name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter
     * @return health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Bonus for attack
     * @return power_weapon_prof
     */
    public int getPower_weapon_prof() {
        return power_weapon_prof;
    }

    /**
     * Getter max hp
     * @return maxhealth
     */
    public int getMaxhealth() {
        return maxhealth;
    }

    /**
     * Getter min damage
     * @return min_damage
     */
    public int getMin_damage() {
        return min_damage;
    }

    /**
     * Getter armor class
     * @return armor
     */
    public int getArmor() {
        return armor;
    }

    /**
     * Getter dead or live
     * @return isAlive
     */
    public boolean isAlive() {
        return isAlive;
    }

    /**
     * Setter mindamage
     * @param min_damage
     */
    public void setMin_damage(int min_damage) {
        this.min_damage = min_damage;
    }

    /**
     * Function for all change health
     * @param ch_health
     */
    public void chagehealth(int ch_health) {
        if(ch_health + health < 0)
        {
            this.health = 0;
            this.isAlive = false;
        } else if (ch_health + this.health > this.maxhealth) {
            this.health = maxhealth;
        }
        else
        {
            this.health += ch_health;
        }
    }


    /**
     * Method toString
     * @return class var in string
     */
    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", maxhealth=" + maxhealth +
                ", armor=" + armor +
                ", isAlive=" + isAlive +
                '}';
    }
}
