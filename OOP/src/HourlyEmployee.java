/*
 Concrete Subclass HourlyEmployee
 video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson10_06
*/
public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }

        this.wage = wage;
    }

    public void setHours(double hours) {
        if ((hours < 0.0 || hours > 168)) {
            throw new IllegalArgumentException("Hours must be between 0.0 and 168");
        }

        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if ((hours < 0.0 || hours > 168)) {
            throw new IllegalArgumentException("Hours must be between 0.0 and 168");
        }

        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }

        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double earnings() {
        if (getHours() <= 40) {
            return getWage() * getHours();
        } else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wage=" + getWage() +
                ", hours=" + getHours() +
                ", super=" + super.toString() +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
