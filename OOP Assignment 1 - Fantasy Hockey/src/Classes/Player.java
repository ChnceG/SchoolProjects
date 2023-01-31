package Classes;

public class Player {

    //region "Variables"
    private String playerName;
    private int goals;
    private int assists;
    //endregion

    //region "Player Method"
    public Player(String playerName, int goals, int assists) {
        this.playerName = playerName;
        this.goals = goals;
        this.assists = assists;
    }
    //endregion

    //region "Player Getters"
    public String getPlayerName() {
        return playerName;
    }
    public int getGoals() {
        return goals;
    }
    public int getAssists() {
        return assists;
    }
    //endregion

    //region "Print Player Details"
    public String toString() {
        return getPlayerName() + ": " + " G - " + getGoals() + " A - " + getAssists() + " Total - " + (getGoals()+getAssists());
    }
    //endregion
}
