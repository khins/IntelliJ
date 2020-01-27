public class Invoice implements Payable {
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerTerm;

    @Override
    public String toString() {
        return "Invoice{" +
                "partNumber='" + getPartNumber() + '\'' +
                ", partDescription='" + getPartDescription() + '\'' +
                ", quantity=" + getQuantity() +
                ", pricePerTerm=" + getPricePerTerm() +
                '}';
    }

    public void setQuantity(int quantity) {
        if (quantity < 0 ) {
            throw new IllegalArgumentException("Quantity must be >= 0");
        }
        this.quantity = quantity;
    }

    public void setPricePerTerm(double pricePerTerm) {
        if (pricePerTerm < 0.0) {
            throw new IllegalArgumentException("Price per item must be >= 0");
        }
        this.pricePerTerm = pricePerTerm;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {

        return quantity;
    }

    public double getPricePerTerm() {
        return pricePerTerm;
    }

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerTerm) {
        if (quantity < 0 ) {
            throw new IllegalArgumentException("Quantity must be >= 0");
        }
        if (pricePerTerm < 0.0) {
            throw new IllegalArgumentException("Price per item must be >= 0");
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerTerm = pricePerTerm;
    }

    @Override // to calculate the total cost
    public double getPaymentAmount() {
        return getQuantity() * getPricePerTerm();
    }
}
