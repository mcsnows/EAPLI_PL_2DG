<<<<<<< HEAD
package Model;

/**
 *
 * @author i100623
 */
public abstract class PaymentMean {
    
    private String description;
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
=======
package Model;

public class PaymentMean {
    
    private String description;
    
    public PaymentMean(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String toString(){
        return "Payment Mean: " + description;
    }
}
>>>>>>> 5e6d348eb1b7d3c2884710a1d3659b80ff3f5394
