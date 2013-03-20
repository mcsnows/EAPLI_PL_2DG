package Controllers;

import Model.Expense;
import Persistence.ExpenseRepository;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author i100623
 */
public class ExpenseRegisterController {

    public ExpenseRegisterController() {}
    
    public void registerExpense(String what,Date date,BigDecimal amount){
        Expense expense= new Expense(what,date,amount);
        //ContaCorrente.getInstance().expenseRepository.saveExpense(expense);
        ExpenseRepository repo = new ExpenseRepository();
        repo.saveExpense(expense);
    }
    
}
