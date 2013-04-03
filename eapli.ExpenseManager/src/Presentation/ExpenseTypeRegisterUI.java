/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseTypeRegisterController;
import eapli.util.Console;

/**
 *
 * @author Ricardo Rocha
 */
public class ExpenseTypeRegisterUI {
    
      public ExpenseTypeRegisterUI() {
      }

      public void run() {
            System.out.println("* * *  REGISTER AN EXPENSE TYPE * * *\n");
            String type = Console.readLine("EXPENSE TYPE");
            ExpenseTypeRegisterController controller = new ExpenseTypeRegisterController();
            controller.registerExpenseType(type);

            System.out.println("expense type recorded.");
      }

}
