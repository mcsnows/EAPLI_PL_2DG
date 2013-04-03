/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;

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
}
