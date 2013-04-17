<<<<<<< HEAD
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Expense;
import java.util.List;

/**
 *
 * @author i100623
 */
public interface IExpenseRepository {
    void saveExpense(Expense exp);
    List<Expense>getAllExpenses();
    Expense getLastExpense();
    
}
=======
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Expense;
import java.util.List;

/**
 *
 * @author Outsider
 */
public interface IExpenseRepository {
    void saveExpense(Expense exp);
    List<Expense> getAllExpenses();
    Expense getLastExpense();
}
>>>>>>> 5e6d348eb1b7d3c2884710a1d3659b80ff3f5394
