package lab3.droids.repair;

import lab3.droids.Droid;

public class Droid_doubleheal extends Droid_repair{
    /**
     * Constructor
     * @param name
     */
    public Droid_doubleheal(String name)
    {
        super(name);
    }

    /**
     * action for round dor healers
     * @param enemy
     */
    @Override
    public void action_round(Droid enemy, Droid teammate)
    {
        heal(teammate);
        heal(teammate);
        make_attack(enemy);
    }
    /**
     * Method toString
     * @return class var in string
     */
    @Override
    public String toString() {
        return super.toString() +  " " + "class: Doubleheal.";
    }
}
