package Presentation;

import Model.Expense;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author i100623
 */
public class MainMenu {

    public MainMenu() {}

    public void mainLoop() {
        int op;
        do {
            op = menu();
            switch (op) {
                case 0:
                    System.out.println("bye bye ...");
                    return;
                case 1:
                    ExpenseRegisterUI ui = new ExpenseRegisterUI();
                    ui.run();
                    break;
//                case 2:
//                    List<Expense> lista = new List<Expense>();
//                    lista.getAllExpenses();
            }
        } while (op != 0);
    }
    
    private static int menu(){
        System.out.println("========================");
        System.out.println("    EXPENSE MANAGER   ");
        System.out.println("========================\n\n");
        System.out.println("1.Register an expense");
        System.out.println("2.Listar despesas");
        System.out.println("0.Exit \n\n");
        
        int option=Console.readInteger("Please choose an option: ");
        return option;
    }
}
