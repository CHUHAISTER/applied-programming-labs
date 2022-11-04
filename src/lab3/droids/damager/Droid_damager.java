package lab3.droids.damager;

import lab3.droids.Droid;

public abstract class Droid_damager extends Droid{
    /**
     * Constructor
     * @param name
     */
    public Droid_damager(String name)
    {
        super(name,  20, Droid.random.nextInt(4)+12);
        setMin_damage(3);
        setDice_damage(6);
    }
    @Override
    /**
     * refresh data for droid
     */
    public void refreshDroid()
    {
        super.refreshDroid();
        this.setMin_damage(3);
    }

}
