/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.ExpenseRepository;
import eapli.util.DateTime;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author i110459
 */
public class ExpenseRecord {
    
    public static List<Expense> getMonthExpenses(String month){
        String[] aux=month.split("-");
        int[] auxM=new int[2];
        ExpenseRepository repo=new ExpenseRepository();
        List<Expense> despesas=repo.getAllExpenses();
        List<Expense> despmes = null;
        for(int i=0;i<despesas.size();i++){
            auxM[0]=despesas.get(i).getDateOcurred().MONTH;
            auxM[1]=despesas.get(i).getDateOcurred().YEAR;
            if((Integer.parseInt(aux[0]))==auxM[0] && (Integer.parseInt(aux[1]))==auxM[1]){
                despmes.add(despesas.get(i));
            }   
        }
        return despesas;
    }
}
