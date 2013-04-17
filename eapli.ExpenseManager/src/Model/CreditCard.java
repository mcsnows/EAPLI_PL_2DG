package Model;

import java.util.Date;

<<<<<<< HEAD
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
=======

public class CreditCard extends PaymentMean {
    
    private String accountNumber;
    private String cvc;
    private String bank;
    private Date expirationValue;

    public CreditCard(String accountNumberCC, String CVC, String bankCC, Date validade) {
        super("Credit Card");
        this.accountNumber = accountNumberCC;
        this.cvc = CVC;
        this.bank = bankCC;
        this.expirationValue = validade;
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    
     public String getCvc(){
>>>>>>> 5e6d348eb1b7d3c2884710a1d3659b80ff3f5394
        return cvc;
    }
     
     public String getBank(){
        return bank;
    }
}
