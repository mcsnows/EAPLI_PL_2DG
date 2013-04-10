/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;
import Controllers.MonthlyExpensesController;
import Model.Expense;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author i110459
 */
public class ShowMonthlyExpensesUI {



      public void run() {
          MonthlyExpensesController  MEC=new MonthlyExpensesController();
          String date=Console.readLine("Qual o mes pretendido?(mm-yyyy)");
          
          List<Expense> listmonthly= MEC.getMonthlyExpenses(date);
          
          System.out.println("* * *  MONTHLY EXPENSES  * * *\n");
            
          for(int i=0;i<listmonthly.size();i++)
          {
              System.out.println(listmonthly.get(i).toString());
          }
             
      }
}
