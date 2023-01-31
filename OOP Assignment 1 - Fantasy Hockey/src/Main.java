import java.util.Scanner;
import Classes.*;

public class Main {
    public static final int TOTAL_TEAMS = 3;
    public static final int TOTAL_PLAYERS = 3;

    // Was having issues with try and catch and found this solution worked to have the user give an Int in the form of a string and convert it.
    // Made to make sure the user inputs a positive number. Main data validation
    public static int getIntFromUser(Scanner kb) {
        boolean flag = true;
        int reply = -1;
        while(flag) {
            try {
                String input = kb.nextLine();
                reply = Integer.parseInt(input);
                if (reply < 0) {
                    System.out.println("Please enter a positive number!");
                    continue;
                }
                flag = false;
            }
            catch (NumberFormatException E) {
                System.out.println("Invalid Input! ");
            }
        }
        return reply;
    }
    public static void main(String[] args) {

        // Variables
        int goals, assists;
        Scanner kb = new Scanner(System.in);
        // Arrays for Team and Player
        Team[] hockeyLeague = new Team[TOTAL_TEAMS];
        Player[][] hockeyPlayer = new Player[TOTAL_TEAMS][TOTAL_PLAYERS];
        String teamName;

        // Loop to iterate through the Hockey League (# of Teams) and assigns names
        System.out.println("FANTASY HOCKEY APPLICATION \nTEAM ENTRY \n================================");
        for(int i = 0; i < hockeyLeague.length; i++) {
            boolean checkLength = false;
            System.out.println("Enter name for team # " + (i+1) + ": ");
            // Data Validation to check for length of each team name.
            // Would've made another function out of this but this one and the name check one are a little too different
            while (!checkLength) {
                teamName = kb.nextLine();
                if (teamName.length() < 3) {
                    System.out.println("The name has to be more than 3 characters! Please enter a new name! ");
                }
                else {
                    Team hockeyTeam = new Team(teamName);
                    hockeyLeague[i] = hockeyTeam;
                    checkLength = true;
                }
            }
        }
        // Iterates through the List of teams, while going through each player on those teams to assign names to players
        System.out.println("PLAYER ENTRY \n================================");
        for (int i = 0; i < hockeyLeague.length; i++) {
            int teamGoals = 0, teamAssists = 0;
            System.out.println("Enter players for " + hockeyLeague[i].getTeamName());
            for (int j = 0; j < hockeyPlayer.length; j++) {
                boolean checkLength = false;
                System.out.println("Enter name for player #" + (j+1) + ": ");
                String playerName = "";
                // Data Validation to check for length of each team name.
                while (!checkLength) {
                    playerName = kb.nextLine();
                    if (playerName.length() < 3) {
                        System.out.println("The name has to be more than 3 characters! Please enter a new name! ");
                    }
                    else {
                        checkLength = true;
                    }
                }
                // Assigning number of goals while also calling getIntFromUser for data validation
                System.out.println("Enter number of goals for " + playerName + ":");
                goals = getIntFromUser(kb);
                teamGoals += goals;

                // Assigning number of assists while also calling getIntFromUser for data validation
                System.out.println("Enter number of assists for " + playerName + ":");
                assists = getIntFromUser(kb);
                teamAssists += assists;

                // At the end of every loop, assign Name+Goals+Assists to a hockeyPlayer,
                // then assign them to the correct team
                Player player = new Player(playerName, goals, assists);
                hockeyPlayer[i][j] = player;
            }
            // Calculates team rating
            hockeyLeague[i].teamRating(teamGoals, teamAssists);
        }
        // Prints out stats for each team
        System.out.println("REPORT: Stats per Team \n================================");
        // Goes through each team and calls the toString function in Team to print out the stats
        for (Team team : hockeyLeague) {
            System.out.println(team);
        }
        // Prints out stats for each player by going through each team and each player on each team
        System.out.println("REPORT: Stats per Player \n================================");
        for (int i = 0; i < hockeyLeague.length; i++) {
            var league = hockeyLeague[i];
            // Calls the toString function in player to print out the stats
            for (int j = 0; j < hockeyPlayer.length; j++) {
                var player = hockeyPlayer[i][j];
                System.out.println(league.getTeamName() + "\n" + player);
            }
        }
    }
}