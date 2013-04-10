/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.util.Console;
/**
 *
 * @author mcn
 */
public class MainMenu {
      public MainMenu() {
      }

      public void mainLoop() {
            int op;
            do {
                  op = menu();
                  switch (op) {
                        case 0:
                              System.out.println("bye bye ...");
                              break;
                        case 1:
                              ExpenseRegisterUI ui = new ExpenseRegisterUI();
                              ui.run();
                              break;
                        case 2:
                              ShowExpensesUI showExpensesUI = new ShowExpensesUI();
                              showExpensesUI.loop();
                              break;
                        case 3:
                              ExpenseTypeRegisterUI uiType = new ExpenseTypeRegisterUI();
                              uiType.run();
                              break;
                        case 4:
                              ShowWeeklyExpensesUI SWE=new ShowWeeklyExpensesUI();
                              //SWE.run();
                              break;
                  
                        case 5:
                              ShowMonthlyExpensesUI meUI=new ShowMonthlyExpensesUI();
                              //meUI.run();
                              break;
                        case 6:
                              IncomeTypeRegisterUI incomeTypeUI = new IncomeTypeRegisterUI();
                              incomeTypeUI.run();
                              break;
                  }
            } while (op != 0);

      }

      private static int menu() {
            System.out.println("===================");
            System.out.println("  EXPENSE MANAGER  ");
            System.out.println("===================\n");
            System.out.println("1. Register an expense");
            System.out.println("2. Show expenses");
            System.out.println("3. Register expenses type");
            System.out.println("4. Show month expenses");
            System.out.println("6. Register income type");
            System.out.println("0. Exit\n\n");

            int option = Console.readInteger("Please choose an option");
            return option;
      }
}
