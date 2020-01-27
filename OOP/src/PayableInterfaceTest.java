/*
 Using Interface Payable to Process Invoices and Employees Polymorphically
 https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson10_16
*/
public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payables = new Payable[4];

        payables[0] = new Invoice("01234", "seat", 2, 375.00);
        payables[1] = new Invoice("56789", "tire", 2, 79.39);
        payables[2] = new SalariedEmployee("Liz", "Barnes", "123-45-6789", 800.00);
        payables[3] = new SalariedEmployee("Scott", "Qwerty", "111-11-1111", 1200.00);

        System.out.println("Invoices and Employees processed polymorphically");

        for (Payable currentPayable:payables) {
            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(),
                    "payment due", currentPayable.getPaymentAmount());
        }

    }
}
