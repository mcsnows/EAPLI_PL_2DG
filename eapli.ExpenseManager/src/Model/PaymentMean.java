package Model;

/**
 *
 * @author i100623
 */
public abstract class PaymentMean {
    
    private String description;
    private String paymentType;
    
    public String getDescription() {
        return description;
    }
    public String getPaymentType() {
        return paymentType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }


}
