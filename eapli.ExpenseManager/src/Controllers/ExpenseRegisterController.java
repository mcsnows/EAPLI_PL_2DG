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
import Persistence.IExpenseTypeRepository;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
/**
 *
 * @author 
 */
public class ExpenseRegisterController {
      public ExpenseRegisterController() {
      }

      public void registerExpense(String desc, Calendar date, BigDecimal amount) {
            Expense expense = new Expense(desc, date, amount);
            ExpenseRepository controller=new ExpenseRepository();
            controller.saveExpense(expense);
      }

    public List<ExpenseType> getExpenseTypes() {
        ExpenseTypeRepository etr = new ExpenseTypeRepository();
        return etr.getAllExpenseTypes();
    }
    
    public List<Expense> getWeeklyExpenses()
    {
        ExpenseRepository ERepo=new ExpenseRepository();
        List<Expense> listExpenses=ERepo.getAllExpenses();
        ExpenseRecord ERec=new ExpenseRecord(listExpenses);
        
        return ERec.getWeeklyExpenses();
        
    }
    
     public List<Expense> getMonthlyExpenses()
    {
        ExpenseRepository ERepo=new ExpenseRepository();
        List<Expense> listExpenses=ERepo.getAllExpenses();
        ExpenseRecord ERec=new ExpenseRecord(listExpenses);
        
        return ERec.getMonthlyExpenses();
        
    }
      
      
}
