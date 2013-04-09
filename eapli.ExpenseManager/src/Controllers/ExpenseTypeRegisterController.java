/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import java.util.List;

/**
 *
 * @author Ricardo Rocha
 */
public class ExpenseTypeRegisterController {
    public ExpenseTypeRegisterController(){}
    public void registerExpenseType(String type)
    {
        ExpenseType expenseType = new ExpenseType(type);
        ExpenseTypeRepository repository = new ExpenseTypeRepository();
        repository.saveExpenseTypes(expenseType);
    }
    
    public List<ExpenseType> getAllExpenseType()
    {
        ExpenseTypeRepository repository = new ExpenseTypeRepository();
        return repository.getAllExpenseTypes();
    }
}
