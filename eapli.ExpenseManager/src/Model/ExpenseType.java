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
    private String type;
    
    public ExpenseType(){}
  
    public ExpenseType(String type)
    {
        this.type = type;
    }
    public ExpenseType(ExpenseType expenseType)
    {
        this.type = expenseType.getType();
    }
    public String getType()
    {
        return type;
    }
}
