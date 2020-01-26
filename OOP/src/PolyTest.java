// Assigning superclass and subclass references to superclass and subclass variables
// video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson10_01s
public class PolyTest {
    public static void main(String[] args) {
        CommissionEmployee ce = new CommissionEmployee("Roger","Waters","123", 5000, .25);
        BasePlusCommissionEmployee bce = new BasePlusCommissionEmployee("Indiana","Jones", "999", 1000, .25, 96000);

        System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee toString", "with super class reference to super class object: ", ce.toString());
        System.out.printf("%s %s:%n%n%s%n%n", "Call BPCommissionEmployee toString", "with sub class reference to subclass object: ", bce.toString());

        // this is a super class variable aimed at a subclass object
        CommissionEmployee ce2 = bce;
        System.out.printf("%s %s:%n%n%s%n%n", "Call BPCommissionEmployee toString", "with sub class reference to subclass object: ", ce2.toString());

    }
}
