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
        return baseSalary + (getCommissionRate() * getGrossSales());
    }

    @Override // overrides the super class
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "ssn: ", socialNumber,
                "gross sales: ", grossSales,
                "com rate: ", commissionRate,
                "base sal: ", baseSalary);
    }
}
