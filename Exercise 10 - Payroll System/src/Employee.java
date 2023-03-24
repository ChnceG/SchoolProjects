public abstract class Employee {
    private String firstName;
    private String lastName;
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public abstract double calculateMonthlyPay();
    public String getName() {
        return firstName + " " + lastName;
    }
}
