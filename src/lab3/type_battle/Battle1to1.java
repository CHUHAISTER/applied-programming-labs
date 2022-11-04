package lab3.type_battle;

import lab3.droids.Droid;
import lab3.droids.damager.Droid_damager;
import lab3.droids.damager.Droid_doublegun;
import lab3.droids.damager.Droid_sniper;
import lab3.droids.repair.Droid_repair;

import static lab3.droids.Droid.random;


/**
 * The battle between two droids
 * Print all moves of droids in 1 to 1 battle
 */
public class Battle1to1 {
    private Droid attacker;         // The attacker for each round
    private Droid defender;         // The defender for each round
    private int currentRound = 0;   // The number of current round

    /**
     * Constructor
     * @param player1 The first droid of battle
     * @param player2 The second droid of battle
     */

    public Battle1to1(Droid player1, Droid player2) {
        initAttacker(player1, player2);
    }

    /**
     * The battle of to teams
     */
    public void battle(){

        // while all droids is alive - continue battle
        while(attacker.isAlive() && defender.isAlive()){

            numOfRound();
            if (attacker.getClass() == Droid_doublegun.class || attacker.getClass() == Droid_sniper.class) {
                attacker.action_round(defender);
            }
            else
                ((Droid_repair)attacker).action_round(defender, attacker);

            if (defender.getClass() == Droid_doublegun.class || defender.getClass() == Droid_sniper.class) {
                defender.action_round(attacker);
            }
            else
                ((Droid_repair)defender).action_round(attacker, defender);
            System.out.println(attacker);
            System.out.println(defender);
            initAttacker(attacker, defender);
        }
        // Print the winner
        System.out.println("\n-------------------------------------");
        if(attacker.isAlive()){
            System.out.println(attacker.getName() + " is a winner!");
        }else{
            System.out.println(defender.getName() + " is a winner!");
        }

        // Refresh droids after the battle
        attacker.refreshDroid();
        defender.refreshDroid();
    }


    /**
     * Print and change the current num of round
     */
    private void numOfRound(){
        currentRound++;
        System.out.println("-------------------------------------");
        System.out.println("Round " + currentRound);
    }

    /**
     * Method defines who is attacker and who is the defender for each round
     * @param player1 The first droid of battle
     * @param player2 The second droid of battle
     */
    public void initAttacker(Droid player1, Droid player2){
        if (random.nextBoolean()) {
            attacker = player1;
            defender = player2;
        } else {
            attacker = player2;
            defender = player1;
        }
    }
}
