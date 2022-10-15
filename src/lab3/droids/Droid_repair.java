package lab3.droids;

public class Droid_repair extends Droid {
    public Droid_repair(String name)
    {
        super(name,  6, Droid.random.nextInt(13)+10);
        setMin_damage(1);
    }

}
