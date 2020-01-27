/* Concrete Subclass CommissionEmployee
 * video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson09_02
 * video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson10_07
 * */

public class CommissionEmployee extends Employee {
    /* in inheritance, when you have protected members, whether they are instance variables or methods of a class,
    those protected members are not only accessible to the class in which they are declared,
    but also to every subclass of that particular class */

    // returned members back to private
    private double grossSales;
    private double commissionRate;

    /**
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     * @param grossSales
     * @param commissionRate
     */
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;

        if (grossSales < 0.0) {
            throw new IllegalArgumentException("gross must be >=0.0");
        }

        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("rate between 0 and 1");
        }

        this.grossSales = grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("gross must be >=0.0");
        }

        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("rate between 0 and 1");
        }

        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    public double getGrossSales() {
        return this.grossSales;
    }

    @Override
    public double earnings() {
        // even within own class its better to use the get methods for manipulating data
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "grossSales=" + getGrossSales() +
                ", commissionRate=" + getCommissionRate() +
                ", super=" + super.toString() +
                '}';
    }
}
