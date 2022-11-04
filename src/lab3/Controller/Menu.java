package lab3.Controller;

import lab3.droids.Droid_list;
import lab3.droids.Team;
import lab3.droids.Droid;
import lab3.type_battle.Battle1to1;
import lab3.type_battle.BattleTeamtoTeam;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static lab3.Controller.Correct.checkCorrect;

public class Menu {
    private Droid_list droidList;                    // The list of droids
    private ConsoleOrFile resOfBattle = new ConsoleOrFile(); // The output of battle


    /**
     * Constructor
     * @param droidList The list of droids
     */
    public Menu(Droid_list droidList) throws FileNotFoundException {
        this.droidList = droidList;
        callMenu();
    }

    /**
     * Call menu for game
     * Options:
     * add droid, print droids, start game
     */
    public void callMenu() throws FileNotFoundException {
        while(true){
            System.out.println("\n-------------------------------------");
            System.out.println("What you want to do??? Type the num:");
            System.out.println("1 - Add new droid");
            System.out.println("2 - Print all droids");
            System.out.println("3 - Start the game");
            System.out.println("0 - Exit");
            System.out.println("-------------------------------------");

            int option = checkCorrect(0, 3);

            switch (option) {
                case 1 -> droidList.createDroid();
                case 2 -> droidList.printDroids();
                case 3 -> startGame();
                case 0 -> {
                    return;
                }
            }
        }
    }

    /**
     * Start the game 1 to 1 or team to team
     */
    public void startGame() throws FileNotFoundException {
        System.out.println("\n-------------------------------------");
        System.out.println("Which game do you want?");
        System.out.println("1 - Battle 1 to 1");
        System.out.println("2 - Battle team to team");
        System.out.println("-------------------------------------");

        int battle = checkCorrect(1, 2);

        switch (battle) {
            case 1 -> battle1to1();
            case 2 -> battleTeams();
        }
    }

    /**
     * Creates two teams and starts a battle between them
     * also save the battle to file if it`s necessary
     */
    public void battleTeams() throws FileNotFoundException {
        // Creating first team
        Team firteam = new Team();
        createTeam(firteam);

        // Creating second team
        Team secteam = new Team();
        createTeam(secteam);

        BattleTeamtoTeam battle = new BattleTeamtoTeam(firteam, secteam);
        // Save battle
        resOfBattle.FileOrNot();
        // Start battle
        battle.battle();
        resOfBattle.changeRegime();

        // The members of team are not used now so put
        // them in list inNotUsed
        droidList.addALL(firteam.getTeam());
        droidList.addALL(secteam.getTeam());
    }

    /**
     * Chooses two droids and starts a battle between them
     * also save the battle to file if it`s necessary
     */
    public void battle1to1() throws FileNotFoundException {
        // Choose droids
        Droid firDroid = chooseCharacter();
        Droid secDroid = chooseCharacter();

        Battle1to1 battle = new Battle1to1(firDroid, secDroid);
        // where save the battle
        resOfBattle.FileOrNot();
        // start the battle
        battle.battle();
        resOfBattle.changeRegime();

        droidList.add(firDroid);
        droidList.add(secDroid);
    }

    /**
     * Choose player for 1 to 1 battle
     * @return The droid that was chosen
     */
    public Droid chooseCharacter() {
        System.out.println("\n-------------------------------------");
        System.out.println("Player! Choose your character!");
        // Print all not used droids
        for(int i = 0; i < droidList.size(); i++){
            System.out.println(i + 1 + " - " + droidList.get(i));
        }
        System.out.println("-------------------------------------");

        int num = checkCorrect(1, droidList.size());

        Droid droid = droidList.get(num - 1);
        droidList.remove(num - 1);
        return droid;
    }

    /**
     * Creating a new team
     * @param team The team that was created
     */
    public void createTeam(Team team){

        System.out.println("\n-------------------------------------");
        System.out.println("Now we creating a team!");
        System.out.println("Write the name of team:");

        // Enter the name of team
        String name = input.next();
        team.setName(name);

        ArrayList<Droid> teamMem = new ArrayList<>(); // The members of team

        while(true){
            System.out.println("-------------------------------------");
            // Print all not used droids
            for(int i = 0; i < droidList.size(); i++){
                System.out.println(i + 1 + " - " + droidList.get(i));
            }
            System.out.println("0 - End adding members to team");
            System.out.println("-------------------------------------");

            int num = checkCorrect(0, droidList.size());

            if (num == 0){
                break;
            }

            // add new member to the team
            teamMem.add(droidList.get(num - 1));
            droidList.remove(num - 1);
        }
        // set the members of the team
        team.setTeam(teamMem);
    }

    Scanner input = new Scanner(System.in);
}

