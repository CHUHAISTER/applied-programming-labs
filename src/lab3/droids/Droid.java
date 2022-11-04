package lab3.droids;

import java.util.Random;
/**
 * The base abstract class of droid
 * That has base characteristic of every droid like name, health, isAlive, etc
 */
public abstract class Droid {
    private String name; //name droid
    private int health;  //current hp
    private int maxhealth; //max hp
    private int armor; //armor class
    private boolean isAlive; // demonstrate: dead or live
    private int min_damage = 0; // min damage
    private int power_weapon_prof; //bonus for attack
    private int dice_damage;


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
     * Setter weapon_prof
     * @param power_weapon_prof
     */
    public void setPower_weapon_prof(int power_weapon_prof) {
        this.power_weapon_prof = power_weapon_prof;
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
     * Getter dice damage
     * @return dice_damage
     */
    public int getDice_damage() {
        return dice_damage;
    }

    /**
     * Setter dice damage
     * @param dice_damage
     */
    public void setDice_damage(int dice_damage) {
        this.dice_damage = dice_damage;
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
        if(isAlive != false) {
            if (ch_health + health <= 0) {
                this.health = 0;
                this.isAlive = false;
            } else if (ch_health + this.health > this.maxhealth) {
                this.health = maxhealth;
            } else {
                this.health += ch_health;
            }
        }
    }

    /**
     * refresh data for droid
     */
    public void refreshDroid()
    {
        this.isAlive = true;
        this.health = this.maxhealth;
        this.min_damage = 1;
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
                ", min_damage=" + min_damage +
                ", power_weapon_prof=" + power_weapon_prof +
                ", dice_damage=" + dice_damage +
                '}';
    }

    /**
     * Func for damage enemy
     * @param enemy
     */
    public void make_attack(Droid enemy)
    {
        int make_attack = Droid.random.nextInt(20) + 1;
        int damage;
        if (make_attack == 20)
        {
            damage = ((2 * Droid.random.nextInt(this.dice_damage)+1)+this.min_damage);
            enemy.chagehealth(-damage);
            System.out.println("Critical shot from the " + this.name + " to the " + enemy.getName() + " for "+ damage
                    +" damage!");
        }
        else if (make_attack + this.power_weapon_prof >= enemy.getArmor())
        {
            damage = ((Droid.random.nextInt(this.dice_damage)+1)+this.min_damage);
            enemy.chagehealth(-damage);
            System.out.println("Shot from the " + this.name + " to the " + enemy.getName() + " for "+ damage
                    +" damage!");
        }
        else
        {
            System.out.println("\u001B[33m"+ "Terrible shot from " + this.name + "!" + "\u001B[0m");
        }
    }

    /**
     * action for round dor droids
     * @param enemy
     */
    public void action_round(Droid enemy)
    {
        make_attack(enemy);
    }

}
