/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseTypeRegisterController;
import Model.ExpenseType;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author Ricardo Rocha
 */
public class ExpenseTypeRegisterUI {
        
      private ExpenseTypeRegisterController controller = new ExpenseTypeRegisterController();
      public ExpenseTypeRegisterUI() {
      }

      public void run() {

            List<ExpenseType> listExpenseType = controller.getAllExpenseType();
          
            System.out.println("\n* * * ALL EXPENSETYPES * * *");
            for (int i = 0; i < listExpenseType.size(); i++) {
                System.out.println(listExpenseType.get(i).getType());
            }
            
            String type = Console.readLine("\nRegister expense type please:");
            controller.registerExpenseType(type);

            System.out.println("Expense type recorded.");
      }

}
