package Model;

import java.util.Date;

/**
 *
 * @author i100623
 */
public class CreditCard extends PaymentMean{
    
    private int countNumber;
    private int cvc;
    private String bank;
    private Date expirationValue;
    
    public int getCountNumber(){
        return countNumber;
    }
    
     public int getCvc(){
        return cvc;
    }
     
     public String getBank(){
        return bank;
    }
}
