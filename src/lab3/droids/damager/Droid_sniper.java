package lab3.droids.damager;

public class Droid_sniper extends Droid_damager{

    /**
     * Constructor
     * @param name
     */
    public Droid_sniper(String name)
    {
        super(name);
        setPower_weapon_prof(getPower_weapon_prof() + 7);
        setMin_damage(getMin_damage() + 2);
    }

    @Override
    /**
     * refresh data for droid
     */
    public void refreshDroid()
    {
        super.refreshDroid();
        this.setMin_damage(5);
    }

    /**
     * Method toString
     * @return class var in string
     */
    @Override
    public String toString() {
        return super.toString() +  " " + "class: Sniper.";
    }
}
