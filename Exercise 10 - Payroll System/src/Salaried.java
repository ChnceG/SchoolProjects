public class Salaried extends Employee {
    private int yearsOfService;
    public Salaried(String firstName, String lastName, int yearsOfService) {
        super(firstName, lastName);
        this.yearsOfService = yearsOfService;
    }
    public double calculateMonthlyPay() {
        return (50000.00 / 12 + (yearsOfService + 0.01));
    }
}
