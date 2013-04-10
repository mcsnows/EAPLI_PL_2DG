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
    
    private List<Expense> allExpenses;
    
    public ExpenseRecord(List<Expense> all){
        allExpenses=all;
    }
    
    public List<Expense> getMonthlyExpenses(String month){
        String[] aux=month.split("-");
        int[] auxM=new int[2];
        List<Expense> despesas=allExpenses;
        List<Expense> despmes = null;
        for(int i=0;i<despesas.size();i++){
            auxM[0]=despesas.get(i).getMonth();
            auxM[1]=despesas.get(i).getYear();
            if((Integer.parseInt(aux[0]))==auxM[0] && (Integer.parseInt(aux[1]))==auxM[1]){
                despmes.add(despesas.get(i));
            }   
        }
        return despesas;
    }
    
    public List<Expense> getWeeklyExpenses(String week){
        List<Expense> weekExpenses=null;
        for(int i=0; i<allExpenses.size(); i++){
            if(allExpenses.get(i).getDateOcurred().getWeekYear()==Integer.parseInt(week))
                weekExpenses.add(allExpenses.get(i));
        }
        return weekExpenses;
    }
    
    public float calculateExpensesBalance(){
        float balance = 0;
        for(int i = 0; i < allExpenses.size(); i++){
            balance = balance + allExpenses.get(i).getAmount().floatValue();
            
        }
        System.out.println("DEBUG - Balance: "+balance);
        return balance;
    }
    
}
