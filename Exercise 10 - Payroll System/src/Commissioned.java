public class Commissioned extends Employee {
    private double grossSales;
    public Commissioned(String firstName, String lastName,double grossSales) {
        super(firstName, lastName);
        this.grossSales = grossSales;
    }
    public double calculateMonthlyPay() {
        return ((grossSales * 0.10) + 2000);
    }
}
