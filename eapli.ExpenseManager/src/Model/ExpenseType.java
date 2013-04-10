/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ricardo Rocha
 */
public class ExpenseType {
    private String description;
    
    public ExpenseType(){}
  
    public ExpenseType(String description)
    {
        this.description = description;
    }
    public ExpenseType(ExpenseType expenseType)
    {
        this.description = expenseType.getdescription();
    }
    public String getdescription()
    {
        return description;
    }
    
    public String toString()
    {
        return "Type: " + description;
    }
}
