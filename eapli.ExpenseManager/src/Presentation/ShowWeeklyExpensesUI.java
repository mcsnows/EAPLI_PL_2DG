/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;
import Controllers.ShowExpensesController;
import Model.Expense;
import Model.ExpenseType;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author 
 */
public class ShowWeeklyExpensesUI {
      public ShowWeeklyExpensesUI() {
      }

      public void run() {
          ExpenseRegisterController  ERC=new ExpenseRegisterController();
          
          List<Expense> listWeekly= ERC.getWeeklyExpenses();
          
          System.out.println("* * *  WEEKLY EXPENSES  * * *\n");
            
            displayListExpenseType(controller.getExpenseTypes());
//            controller.getPayentMeans();

            System.out.println("Expense recorded. \n");
      }
      
      }
}
