package lab3.droids.repair;

import lab3.droids.Droid;

public class Droid_buffer extends Droid_repair{

    /**
     * Constructor
     * @param name
     */
    public Droid_buffer(String name)
    {
        super(name);
    }

    /**
     * action for round dor healer
     * @param enemy
     */
    @Override
    public void action_round(Droid enemy, Droid teammate)
    {
        heal(teammate);
        if ((Droid.random.nextInt(15)+1) == 15 )
            teammate.setMin_damage(getMin_damage()+1);
        make_attack(enemy);
    }

    /**
     * Method toString
     * @return class var in string
     */
    @Override
    public String toString() {
        return super.toString() +  " " + "class: Buffer.";
    }
}
