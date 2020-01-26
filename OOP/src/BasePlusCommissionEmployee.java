// Inheritance Hierarchy and with Using protected Instance Variables
// video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson09_05
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private  double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialNumber, grossSales, commissionRate);

        if (baseSalary < 0.0){
            throw  new IllegalArgumentException("base must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0){
            throw  new IllegalArgumentException("base must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return  this.baseSalary;
    }

    @Override
    public double earnings() {
        // super already knows how to calc the earnings so calling the super classes method to invoke
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %.2f", "base salaried", super.toString(), "base sal", getBaseSalary());
    }
}