/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;
import Controllers.ExpenseRegisterController;
import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import eapli.util.DateTime;
//import Model.PaymentMeans; //quando existir
import java.util.Calendar;
import java.util.List;
/**
 *
 * @author 
 */
public class ExpenseRegisterUI extends BaseUI{
      public ExpenseRegisterUI() {
      }
      
      
      public void run() {
          
            System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
            String desc = Console.readLine("Description:\n");
              int year = Console.readInteger("Year:\n");
              int month = Console.readInteger("Month (1-12):\n");
              int day = Console.readInteger("Day:\n");
              
            Calendar date = DateTime.newCalendarDate(year, month, day); // Date do tipo Calendar
            
            double value = Console.readDouble("Amount:\n"); //valor da despesa
            BigDecimal amount = new BigDecimal(value);
            String comment = Console.readLine("Comment\n"); //Comentário da despesa

            ExpenseRegisterController controller = new ExpenseRegisterController();
            displayListExpenseType(controller.getExpenseTypes()); //listar os tipos de despesa
            
            int position = Console.readInteger("Select an expense type:\n");
            ExpenseType type = controller.getExpenseTypes().get(position-1);
            controller.registerExpense(desc, date, amount, type);
            
            
            //controller.getPayentMeans();

            System.out.println("Expense recorded. \n");
      }
      
      //Mostra as ExpenseTypes
      private void displayListExpenseType(List<ExpenseType> list) {
            int i=0;
            System.out.println("List of Expense Types \n");
            for (ExpenseType type : list) {
                  i=i+1;
                  System.out.println(i+" --> " + type);
            }
      }
      
//      private void displayListPaymentMeans(List<PaymentMeans> list) {
//            int i=0;
//            System.out.println("List of Payment Means \n");
//            for (PaymentMeans paymentmeans : list) {
//                  i=i+1;
//                  System.out.println("Payment Means "+i+"\n" + paymentmeans);
//            }
//      }

    @Override
    public void header() {
        System.out.println("---REGISTER AN EXPENSE---");
    }
}
