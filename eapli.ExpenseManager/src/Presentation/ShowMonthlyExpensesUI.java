/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;
import Controllers.MonthExpensesController;
import Model.Expense;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author i110459
 */
public class ShowMonthlyExpensesUI {
    


      public void run() {
          ExpenseRegisterController  ERC=new ExpenseRegisterController();
          
          List<Expense> listmonthly= ERC.getWeeklyExpenses();
          
          System.out.println("* * *  MONTHLY EXPENSES  * * *\n");
            
          for(int i=0;i<listmonthly.size();i++)
          {
              System.out.println(listmonthly.get(i).toString());
          }
             
      }
}
