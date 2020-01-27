/*
 Polymorphic Processing, Operator instanceof and Downcasting
 https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson10_09
*/
public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Proce", "999-99-9999", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "444-44-4444", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        System.out.println("Employees processed individually");
        System.out.printf("%n%s%n%s: %,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%n%s%n%s: %,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%n%s%n%s: %,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%n%s%n%s: %,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed poly:%n%n");
        for (Employee currentEmployee: employees) {
            System.out.println(currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                //downcast employee refernce to BasePlusCommissionEmployee ref
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                //System.out.printf(" %,.2f%n%n", employee.getBaseSalary());
               System.out.printf("new base salary with 10%% increase is: $%,.2f%n%n", employee.getBaseSalary());
            }
            System.out.printf("earned %,.2f%n%n", currentEmployee.earnings());
        }

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("Employee %d is a %s%n", i, employees[i].getClass().getName());
        }
    }
}
