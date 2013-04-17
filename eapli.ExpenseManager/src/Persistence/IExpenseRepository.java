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
