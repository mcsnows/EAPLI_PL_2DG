package Presentation;

import Controllers.ExpenseRegisterController;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author i100623
 */
public class ExpenseRegisterUI {

    public ExpenseRegisterUI() {}
    
    public void run(){
        System.out.println("* * * REGISTER AN EXPENSE * * * \n");
        String what = Console.readLine("Description:");
        Date date=Console.readDate("When (dd-MM-yyyy):");
        double value = Console.readDouble("Amount: ");
        BigDecimal amount= new BigDecimal(value);
        
        ExpenseRegisterController controller= new ExpenseRegisterController();
//        controller.registerExpense(what,date,amount,);
        controller.registerExpense(what,date,amount);
        
        System.out.println("Expense recorded.");
        
    }
}
