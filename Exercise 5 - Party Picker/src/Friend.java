public class Friend extends Person{
    private String foodToBring;

    public Friend(String firstName, String lastName, boolean isInvited, String foodToBring) {
        super(firstName, lastName, isInvited);
        this.foodToBring = foodToBring;
    }
    public String getFoodToBring() {
        return foodToBring;
    }
    public String checkIsInvited() {
        if(isInvited()) {
            return "They are invited to the party!";
        }
        else {
            return "They are NOT invited to the party!";
        }
    }
    @Override
    public String toString() {
        return getFullName() + " is bringing " + getFoodToBring() + ". " + checkIsInvited();
    }
}
