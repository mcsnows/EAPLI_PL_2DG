<<<<<<< HEAD
<<<<<<< HEAD
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Date;

/**
 *
 * @author i100623
 */
public class Expense {
    private String description;
    private BigDecimal amount;
    
    public Expense (String description, Date dateOccurred, BigDecimal amount ){
        if(description==null || dateOccurred==null || amount==null){
            throw new IllegalArgumentException();
        }
        
       //cannot record a negative expense or a zero EUR expense
        
       if(amount.signum()==-1 ||amount.signum()==0){
           throw new IllegalArgumentException();
       }
       this.description=description;
       this.amount=amount;
    }
    
    
    public Expense(String description, int year, int month, int day, BigDecimal amount){
        this(description,DateTime.newDate(year, month, day),amount);
    }
    
    public Expense(Expense exp){
        this.description=exp.description;
        this.amount=exp.amount;
    }
    
//    public String toString(){
//        NumberFormat n = NumberFormat.getCurrencyInstance(n);
//    }
//    
}
=======
=======
>>>>>>> 1490363b9ee249607636b3832627d58faf4d02d3
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
<<<<<<< HEAD
    private Calendar dateOcurred;
=======
    private Date dateOccurred;
>>>>>>> 1490363b9ee249607636b3832627d58faf4d02d3
    private ExpenseType type;
    

    protected Expense() {
    }

<<<<<<< HEAD
    public Expense(String description, Calendar dateOccurred, BigDecimal amount) {
=======
    public Expense(String description, Date dateOccurred, BigDecimal amount) {
>>>>>>> 1490363b9ee249607636b3832627d58faf4d02d3
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
<<<<<<< HEAD
        this.dateOcurred = dateOcurred;
=======
        this.dateOccurred = dateOccurred;
>>>>>>> 1490363b9ee249607636b3832627d58faf4d02d3
    }

//antiga data calendar
    public Expense(String desc, int year, int month, int day, BigDecimal amount) {
<<<<<<< HEAD
        this(desc, DateTime.newCalendarDate(year, month, day), amount);
=======
        this(desc, DateTime.newDate(year, month, day), amount);
>>>>>>> 1490363b9ee249607636b3832627d58faf4d02d3
    }

    public Expense(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        this.description = exp.description;
        this.amount = exp.amount;
<<<<<<< HEAD
        this.paymentMean = paymentMean;
        this.dateOcurred = dateOcurred;
        this.type=type;
    }

    public Expense(String description, Calendar dateOccurred, BigDecimal amount, ExpenseType type) {
=======
        this.paymentMean = exp.paymentMean;
        this.dateOccurred = exp.dateOccurred;
        this.type=exp.type;
    }

    public Expense(String description, Date dateOccurred, BigDecimal amount, ExpenseType type) {
>>>>>>> 1490363b9ee249607636b3832627d58faf4d02d3
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
<<<<<<< HEAD
        this.dateOcurred = dateOcurred;
        this.type=type;
    }
    
    public Expense(String description, Calendar dateOccurred, BigDecimal amount, PaymentMean paymentMean, ExpenseType type) {
=======
        this.dateOccurred = dateOccurred;
        this.type=type;
    }
    
    public Expense(String description, Date dateOccurred, BigDecimal amount, PaymentMean paymentMean, ExpenseType type) {
>>>>>>> 1490363b9ee249607636b3832627d58faf4d02d3
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
<<<<<<< HEAD
        this.dateOcurred = dateOcurred;
=======
        this.dateOccurred = dateOccurred;
>>>>>>> 1490363b9ee249607636b3832627d58faf4d02d3
        this.type=type;
    }
    
    @Override
    public String toString() {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        double doubleAmount = this.amount.doubleValue();
        String s = "Description: " + this.description
                + "\nAmount: " + n.format(doubleAmount)  
                + "\n" + paymentMean
<<<<<<< HEAD
                +"\nDate: " + dateOcurred
=======
                +"\nDate: " + dateOccurred
>>>>>>> 1490363b9ee249607636b3832627d58faf4d02d3
                + "\n "+ type;
        return s;

    }

<<<<<<< HEAD
    public Calendar getDateOcurred() {
        return dateOcurred;
=======
    public Date getDateOcurred() {
        return dateOccurred;
>>>>>>> 1490363b9ee249607636b3832627d58faf4d02d3
    }

    public BigDecimal getAmount() {
        return amount;
    }
    
    public int getMonth(){
<<<<<<< HEAD
        return dateOcurred.MONTH; 
    }
    
    public int getYear(){
        return dateOcurred.YEAR;
    }
}
>>>>>>> 5e6d348eb1b7d3c2884710a1d3659b80ff3f5394
=======
        Calendar c=null;
        c.setTime(dateOccurred);
        return c.MONTH; 
    }
    
    public int getYear(){
        Calendar c=null;
        c.setTime(dateOccurred);
        return c.YEAR;
    }
    
    public ExpenseType getExpenseType(){
        return type;
    }
}
>>>>>>> 1490363b9ee249607636b3832627d58faf4d02d3
