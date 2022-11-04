package lab3.droids;

import lab3.droids.damager.Droid_doublegun;
import lab3.droids.damager.Droid_sniper;
import lab3.droids.repair.Droid_repair;

import java.util.ArrayList;
import java.util.LinkedList;

public class Team {
    private String name;            // The name of the team
    private ArrayList<Droid> team = new ArrayList<>(); // All members of team
    private LinkedList<Droid> isAlive = new LinkedList<>();
    /**
     * Constructor
     * @param name The name of team
     */
    public Team(String name) {
        this.name = name;
    }

    /**
     * Constroctor without parametr
     */
    public Team() {   }

    /**
     * Set Team
     * @param team
     */
    public void setTeam(ArrayList<Droid> team)
    {
        this.team = team;
        isAlive.addAll(team);
    }

    /**
     * Method that check if team alive
     * @return true - if team alive, false - another case
     */
    public boolean ifTeamAlive(){
        changeAliveList();
        return !isAlive.isEmpty();
    }

    /**
     * Change the list of alive droids in team
     */
    public void changeAliveList(){
        isAlive.removeIf(droid -> !droid.isAlive());
    }

    /**
     * Get Team
     *
     * @return
     */
    public ArrayList<Droid> getTeam()
    {
        return team;
    }

    /**
     * Setter name
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Print all members of team
     */
    public void printTeam(){
        System.out.println('\n' + getName() + " team:");
        for(Droid droid : team){
            System.out.println(droid);
        }
    }

    /**
     * Get the name of the team
     * @return The name of the team
     */
    public String getName() {
        return name;
    }


    /**
     * Refresh all statuses of droid in the team
     * (refresh droid after the battle, set alive, active, health)
     */
    public void setAllAlive(){
        for(Droid droid : team){
            droid.refreshDroid();
        }
    }

    /**
     * Get the list of alive team members
     * @return The list of alive team members
     */
    public LinkedList<Droid> getIsAlive() {
        return isAlive;
    }

    /**
     * Find the droid with min health
     * @return The droid with min health
     */
    public Droid minHealth(){

        double HP = isAlive.get(0).getHealth();
        int min = 0;

        for(int i = 1; i < isAlive.size(); i++){
            if (isAlive.get(i).getHealth() < HP){
                min = i;
                HP = isAlive.get(i).getHealth();
            }
        }
        return isAlive.get(min);
    }

    /**
     * All droids attack the enemy team
     */
    public void attack(Team enemy_team)
    {
        int k_enem = enemy_team.isAlive.size();
        for (Droid droid : getIsAlive()) {
            if (droid.getClass() == Droid_doublegun.class || droid.getClass() == Droid_sniper.class) {
                droid.action_round(enemy_team.isAlive.get(Droid.random.nextInt(k_enem)));
            }
            else
                ((Droid_repair)droid).action_round(enemy_team.isAlive.get(Droid.random.nextInt(k_enem)), minHealth()  );
        }
    }
}
