package Model;

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
        this.checkNumber = checkNumber;
    }

    public String getBank() {
        return bank;
    }

}
