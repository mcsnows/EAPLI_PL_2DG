/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Model.ExpenseType;
import Persistence.ExpenseRepository;
import java.util.List;

/**
 *
 * @author i110459
 */
public class GivenMonthExpensesController {
    
    public List<Expense> getMonthlyExpensesList(String date){
        ExpenseRepository repo=new ExpenseRepository();
        ExpenseRecord ER=new ExpenseRecord(repo.getAllExpenses());
        return ER.getMonthlyExpensesList(date);
    }
    
    public List<Expense> getFMonthlyExpenses(ExpenseType type,String date){
        ExpenseRepository repo=new ExpenseRepository();
        return null;
    }
    
    
}
