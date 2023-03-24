public class Manager extends Employee {
    private double monthlyBonusAmount;
    public Manager(String firstName, String lastName, double monthlyBonusAmount) {
        super(firstName, lastName);
        this.monthlyBonusAmount = monthlyBonusAmount;
    }
    public double calculateMonthlyPay() {
        return ((100000.00 / 12) + monthlyBonusAmount);
    }
}
