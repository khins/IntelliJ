/*Creating and using a CommissionEmployee class
* video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson09_02
* */

public class CommissionEmployee extends Object {
    private final String firstName;
    private final String lastName;
    private final String socialNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialNumber, double grossSales
            , double commissionRate) {
        if (grossSales < 0.0){
            throw new IllegalArgumentException("gross must be >=0.0");
        }

        if (commissionRate <= 0.0 || commissionRate > = 1.0){
            throw new IllegalArgumentException("rate between 0 and 1");
        }

        this.firstName= firstName;
        this.lastName = lastName;
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
        this.socialNumber= socialNumber;
    }

    public String getFirstName() {
        return  this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSocialNumber() {
        return  this.socialNumber;
    }

    public void setGrossSales(double grossSales){
        if (grossSales < 0.0){
            throw new IllegalArgumentException("gross must be >=0.0");
        }

        this.grossSales = grossSales;
    }

    public  void setCommissionRate(double commissionRate){
        if (commissionRate <= 0.0 || commissionRate > = 1.0){
            throw new IllegalArgumentException("rate between 0 and 1");
        }

        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    public double earnings() {
        return  commissionRate * grossSales;
    }
}
