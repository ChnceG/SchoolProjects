package Classes;
import java.text.NumberFormat;
import java.util.Random;
import java.text.DecimalFormat;

public class Team {
    //region "Variables"
    private String teamName;
    private static final Random rng = new Random();
    private static final double BUDGET_MAX = 100000;
    private final double budget;
    private int totalGoals;
    private int totalAssists;
    private int totalGA;
    private String rating;
    private static NumberFormat dec = new DecimalFormat("#0.00"); // needed for formatting
    //endregion

    //region "Standard Team Function"
    public Team(String teamName) {
        this.teamName = teamName;
        this.budget = teamBudget();
    }
    //endregion

    //region "Getters for Team Info"
    public String getTeamName() {
        return teamName;
    }
    public int getTotalGoals() {
        return totalGoals;
    }
    public int getTotalAssists() {
        return totalAssists;
    }
    public int getTotalGA() {
        return totalGA;
    }
    public double getBudget() {
        return budget;
    }
    public String getRating() {
        return rating;
    }
    //endregion

    // Team Budget uses a random number generator to generate a budget for a team
    //region "Team Budget"
    public double teamBudget() {
        return rng.nextDouble(BUDGET_MAX);
    }
    //endregion

    //Find Team rating adds up Goals and Assists and correlates them to a rating by the * system
    //region "Find Team Rating"
    public void teamRating(int totalGoals, int totalAssists) {
        this.totalGoals = totalGoals;
        this.totalAssists = totalAssists;
        totalGA = totalGoals + totalAssists;
        if (totalGA > 20) {
            rating = "***";
        }
        else if (totalGA >= 10) {
            rating = "**";
        }
        else if (totalGA > 0) {
            rating = "*";
        }
        else {
            rating = "0";
        }
    }
    //endregion

    //region "Print Team Details"
    public String toString() {
        return getTeamName() + ": G - " + getTotalGoals() + " A - " + getTotalAssists() + " Total - " + getTotalGA()
                + " Budget - $" + dec.format(getBudget()) + "\nRating: " + getRating() + " stars\n";
    }
    //endregion
}
