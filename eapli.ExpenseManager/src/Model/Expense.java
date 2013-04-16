/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import Model.ExpenseType;
//import Model.PaymentMeans; //quando existir

/**
 *
 * @author Jose Nuno Loureiro
 */
public class Expense {

    private String description;
    private BigDecimal amount;
    private PaymentMean paymentMean;
    private Date dateOcurred;
    private ExpenseType type;
    

    protected Expense() {
    }

    public Expense(String description, Date dateOccurred, BigDecimal amount) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
        this.dateOcurred = dateOcurred;
    }

//antiga data calendar
    public Expense(String desc, int year, int month, int day, BigDecimal amount) {
        this(desc, DateTime.newDate(year, month, day), amount);
    }

    public Expense(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        this.description = exp.description;
        this.amount = exp.amount;
        this.paymentMean = exp.paymentMean;
        this.dateOcurred = exp.dateOcurred;
        this.type=exp.type;
    }

    public Expense(String description, Date dateOccurred, BigDecimal amount, ExpenseType type) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
        this.dateOcurred = dateOcurred;
        this.type=type;
    }
    
    public Expense(String description, Date dateOccurred, BigDecimal amount, PaymentMean paymentMean, ExpenseType type) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
        this.paymentMean = paymentMean;
        this.dateOcurred = dateOcurred;
        this.type=type;
    }
    
    @Override
    public String toString() {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        double doubleAmount = this.amount.doubleValue();
        String s = "Description: " + this.description
                + "\nAmount: " + n.format(doubleAmount)  
                + "\n" + paymentMean
                +"\nDate: " + dateOcurred
                + "\n "+ type;
        return s;

    }

    public Date getDateOcurred() {
        return dateOcurred;
    }

    public BigDecimal getAmount() {
        return amount;
    }
    
    public int getMonth(){
        return dateOcurred.getMonth(); 
    }
    
    public int getYear(){
        return dateOcurred.getYear();
    }
}
