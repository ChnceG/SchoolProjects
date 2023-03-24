public class PieceWorker extends Employee {
    private int unitsProduced;
    public PieceWorker(String firstName, String lastName, int unitsProduced) {
        super(firstName, lastName);
        this.unitsProduced = unitsProduced;
    }
    public double calculateMonthlyPay() {
        return (unitsProduced);
    }
}
