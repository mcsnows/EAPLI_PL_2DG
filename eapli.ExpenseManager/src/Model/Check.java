package Model;

<<<<<<< HEAD
/**
 *
 * @author i100623
 */
public class Check extends PaymentMean{
    
    private int countNumber;
    private int checkNumber;
    private String bank;

    public int getCountNumber() {
        return countNumber;
    }
    
    public void setCountNumber(int countNumber) {
        this.countNumber = countNumber;
    }

    public int getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(int checkNumber) {
=======
public class Check extends PaymentMean {
    
    private String accountNumber;
    private String checkNumber;
    private String bank;

    public Check(String accountNumber, String checkNumber, String bank) {
        super("Check");
        this.accountNumber = accountNumber;
        this.checkNumber = checkNumber;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
>>>>>>> 5e6d348eb1b7d3c2884710a1d3659b80ff3f5394
        this.checkNumber = checkNumber;
    }

    public String getBank() {
        return bank;
    }
<<<<<<< HEAD

=======
>>>>>>> 5e6d348eb1b7d3c2884710a1d3659b80ff3f5394
}
