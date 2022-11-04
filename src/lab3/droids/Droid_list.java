package lab3.droids;

import lab3.droids.Droid;
import lab3.droids.damager.Droid_doublegun;
import lab3.droids.damager.Droid_sniper;
import lab3.droids.repair.Droid_buffer;
import lab3.droids.repair.Droid_doubleheal;

import java.util.ArrayList;
import java.util.Scanner;

import static lab3.Controller.Correct.checkCorrect;

/**
 * Class for all droid
 */
public class Droid_list {
    private ArrayList<Droid> droids = new ArrayList<>();

    /**
     * Add droid
     * @param dr
     */
    public void addDroid(Droid dr)
    {
        droids.add(dr);
    }

    /**
     * Print all droids that was created
     */
    public void printDroids(){
        System.out.println('\n'+ "Droids:");
        for(Droid droid : droids){
            System.out.println(droid);
        }
    }

    /**
     * Droid for index
     * @param index
     * @return Droid for index
     */
    public Droid get(int index)
    {
        return droids.get(index);
    }

    /**
     * Delete droid for index
     * @param index
     * @return Droid for index
     */
    public void remove(int index)
    {
        droids.remove(index);
    }

    /**
     * Add droid in list
     * @param one
     */
    public void add(Droid one)
    {
        droids.add(one);
    }

    /**
     * Add droid list  in list
     * @param list
     */
    public void addALL(ArrayList<Droid> list)
    {
        droids.addAll(list);
    }


    /**
     * Return size list
     * @return size list
     */
    public int size()
    {
        return droids.size();
    }

    public void createDroid()
    {
        System.out.println("Type droid:");
        System.out.println("1 - repair, 2 - damager");

        int type = checkCorrect(1,2);
        int type2;
        String name;
        switch (type)
        {
            case 1:
                System.out.println("Subtype droid:");
                System.out.println("1 - doublerepair, 2 - buffer");
                type2 = checkCorrect(1,2);
                System.out.println("Name droid: ");
                name = input.next();
                switch (type2)
                {
                    case 1 -> droids.add(new Droid_doubleheal(name));
                    case 2 -> droids.add(new Droid_buffer(name));
                }
                break;
            case 2:
                System.out.println("Subtype droid:");
                System.out.println("1 - sniper, 2 - doublegun");
                type2 = checkCorrect(1,2);
                System.out.println("Name droid: ");
                name = input.next();
                switch (type2)
                {
                    case 1 -> droids.add(new Droid_sniper(name));
                    case 2 -> droids.add(new Droid_doublegun(name));
                }
                break;
        }


    }
    Scanner input = new Scanner(System.in);

}
