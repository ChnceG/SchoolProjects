import java.util.ArrayList;
import java.lang.*;
public class Main {
    public static void main(String[] args) {

        Employee Bob = new Commissioned("Bob", "Loblaw", 40000.00);
        Employee Sue = new Salaried("Sue", "Me", 10);
        Employee Tina = new PieceWorker("Tina", "Zena", 1000);
        Employee Richard = new Manager("Richard", "Rich", 2000.00);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(Bob);
        employees.add(Sue);
        employees.add(Tina);
        employees.add(Richard);
        for (Employee employee : employees) {
            System.out.println("\n" + employee.getName());
            System.out.println("Pay Type: " + employee.getClass().getSimpleName());
            System.out.printf("Monthly Pay: $%.2f\n", employee.calculateMonthlyPay());
        }
    }
}