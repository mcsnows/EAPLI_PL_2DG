/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Model.Expense;
import Persistence.ExpenseRepository;
import Persistence.IExpenseRepository;
import java.math.BigDecimal;

/**
 *
 * @author Outsider
 */
public class ExpenseBootStrapper {
    
    static{
        IExpenseRepository repo = new ExpenseRepository();
        
        repo.saveExpense(new Expense("Autocarro",2013,3,4,new BigDecimal(2.4)));
        repo.saveExpense(new Expense("Almoço",2013,3,5,new BigDecimal(12.4)));
        repo.saveExpense(new Expense("Sapatilhas",2013,3,4,new BigDecimal(123.4)));
        repo.saveExpense(new Expense("Cinema",2013,3,4,new BigDecimal(5.0)));
    }
}
