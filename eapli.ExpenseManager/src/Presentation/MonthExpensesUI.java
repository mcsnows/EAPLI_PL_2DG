/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.MonthExpensesController;
import Model.Expense;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author i110459
 */
public class MonthExpensesUI {
    
    public void run(){
        String month=Console.readLine("Qual o mês e ano(mm-yyyy)?");
        MonthExpensesController mec=new MonthExpensesController();
        List<Expense> despesas=mec.getMonthExpenses(month);
        for(int i=0;i<despesas.size();i++){
            System.out.println(despesas.get(i));
        }
    }
}
