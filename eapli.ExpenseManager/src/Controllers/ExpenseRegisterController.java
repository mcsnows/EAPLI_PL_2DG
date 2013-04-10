/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Model.ExpenseType;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import Persistence.IExpenseRepository;
import Persistence.IExpenseTypeRepository;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Jose Nuno Loureiro
 */
public class ExpenseRegisterController {
      public ExpenseRegisterController() {
      }

      public void registerExpense(String desc, Calendar date, BigDecimal amount, ExpenseType type) {
            Expense expense = new Expense(desc, date, amount, type);
            IExpenseRepository controller= Persistence.PersistenceRegistry.getInstance().expenseRepository();
            controller.saveExpense(expense);
      }

    public List<ExpenseType> getExpenseTypes() {
        ExpenseTypeRepository etr = new ExpenseTypeRepository();
        return etr.getAllExpenseTypes();
    }
    
   
      
      
}
