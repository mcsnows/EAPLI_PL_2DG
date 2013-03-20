package Presentation;

import Model.Expense;
import Presentation.MainMenu;
import eapli.ExpenseBootstarpper;
import java.util.ArrayList;

/**
 *
 * @author i100623
 */
public class ExpenseManager {

    public static void main(String[] args) {
        ExpenseBootstarpper boot = new ExpenseBootstarpper();
        
        MainMenu menu = new MainMenu();
        menu.mainLoop();

//        
        

    }
}
