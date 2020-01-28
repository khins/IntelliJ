/*
* Creating and using a CommissionEmployee class
* c:\Users\kevin\Documents\Learning Library\Java\java_with_vscode\bin>java -classpath "C:\Users\kevin\Documents\Learning Library\Java\IntelliJ\OOP\out\production\OOP" CommissionEmployeeTest
Emp Info obtained by get methods

First name is:  Walter

Last name is:  Mathers

SSN is:  555-12

gross sales is:  10000.00

commission rate is:  0.60

updated emp... :

commission employee: Walter Mathers
ssn: : 555-12
gross sales: : 5000.00
com rate: : 0.10
* */
public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Walter",
                "Mathers",
                "555-12",
                 10000,
                0.6
                );

        BasePlusCommissionEmployee bpEmp = new BasePlusCommissionEmployee("Steve",
                "Rogers",
                "777-88",
                9875,
                0.5,
                76000);

        System.out.println("Emp Info obtained by get methods");
        System.out.printf("%n%s %s%n", "First name is: ", employee.getFirstName());
        System.out.printf("%n%s %s%n", "BP First name is: ", bpEmp.getFirstName());

        System.out.printf("%n%s %s%n", "Last name is: ", employee.getLastName());
        System.out.printf("%n%s %s%n", "BP Last name is: ", bpEmp.getLastName());

        System.out.printf("%n%s %s%n", "SSN is: ", employee.getSocialSecurityNumber());
        System.out.printf("%n%s %s%n", "BP SSN is: ", bpEmp.getSocialSecurityNumber());

        System.out.printf("%n%s %.2f%n", "gross sales is: ", employee.getGrossSales());
        System.out.printf("%n%s %.2f%n", "BP gross sales is: ", bpEmp.getGrossSales());

        System.out.printf("%n%s %.2f%n", "commission rate is: ", employee.getCommissionRate());
        System.out.printf("%n%s %.2f%n", "BP commission rate is: ", bpEmp.getCommissionRate());

        employee.setCommissionRate(.1);
        employee.setCommissionRate(.1);
        bpEmp.setCommissionRate(.7);
        employee.setGrossSales(5000);
        bpEmp.setGrossSales(10000);

        System.out.printf("%n%s:%n%n%s%n", "updated emp... ", employee);
        System.out.printf("%n%s:%n%n%s%n", "BP updated emp... ", bpEmp);

    }
}
