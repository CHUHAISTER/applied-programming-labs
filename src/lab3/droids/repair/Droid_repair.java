package lab3.droids.repair;

import lab3.droids.Droid;

public  abstract class Droid_repair extends Droid {
    private int max_heal;
    /**
     * Constructor
     * @param name
     */
    public Droid_repair(String name)
    {
        super(name,  16, Droid.random.nextInt(4)+14);
        setMin_damage(1);
        setDice_damage(4);
        this.max_heal = 4;
    }

    /**
     * Setter max value heal
     * @param max_heal
     */
    public void setMax_heal(int max_heal) {
        this.max_heal = max_heal;
    }

    /**
     * Func heal teammate
     * @param teammate
     */
    public void heal(Droid teammate)
    {
        int power_heal = Droid.random.nextInt(max_heal)+1;
        chagehealth(power_heal);
        System.out.println("Repair from" + this.getName() +" to " + teammate.getName() +" for " + power_heal +"hp .");
    }

    /**
     * action for round dor healers
     * @param enemy, teammate
     */
    public void action_round(Droid enemy, Droid teammate)
    {
        make_attack(enemy);
        heal(teammate);
    }
}
