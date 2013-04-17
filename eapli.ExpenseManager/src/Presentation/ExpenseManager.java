<<<<<<< HEAD
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
=======
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.ExpenseBootStrapper;
import eapli.ExpenseTypeBootStrapper;
import eapli.IncomeTypeBootStrapper;

/**
 *
 * @author 
 */
public class ExpenseManager {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {
            ExpenseBootStrapper boot=new ExpenseBootStrapper();
            ExpenseTypeBootStrapper bootType = new ExpenseTypeBootStrapper();
            IncomeTypeBootStrapper bootIncomeType = new IncomeTypeBootStrapper();
            MainMenu menu = new MainMenu();
            menu.mainLoop();
      }
}
>>>>>>> 5e6d348eb1b7d3c2884710a1d3659b80ff3f5394
