/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

/**
 *
 * @author Jose Nuno Loureiro
 */
public class PersistenceRegistry {
    //SINGLETON
    
    private PersistenceRegistry(){
    }
    
    private static PersistenceRegistry instance = null;
    
    public static PersistenceRegistry getInstance(){
        if(instance==null){
            instance = new PersistenceRegistry();
        }
        
        return instance;
     }
    
    public IExpenseRepository expenseRepository(){
        return new ExpenseRepository();
    }
    
    public IExpenseTypeRepository expenseTypeRepository(){
        return new ExpenseTypeRepository();
    }
}
