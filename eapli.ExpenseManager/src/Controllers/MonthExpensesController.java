/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Persistence.ExpenseRepository;
import java.util.List;

/**
 *
 * @author i110459
 */
public class MonthExpensesController {
    
    public List<Expense> getMonthExpenses(String month){
        List<Expense> despesas=ExpenseRecord.getMonthExpenses(month);
        return despesas;
    }
}
