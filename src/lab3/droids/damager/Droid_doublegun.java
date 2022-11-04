package lab3.droids.damager;

import lab3.droids.Droid;

public class Droid_doublegun extends Droid_damager{

    /**
     * Constructor
     * @param name
     */
    public Droid_doublegun(String name)
    {
        super(name);
    }

    @Override
    public void action_round(Droid enemy)
    {
        make_attack(enemy);
        make_attack(enemy);
    }

    /**
     * Method toString
     * @return class var in string
     */
    @Override
    public String toString() {
        return super.toString() +  " " + "class: Doublegun.";
    }
}
