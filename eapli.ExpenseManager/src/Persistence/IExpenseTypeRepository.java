/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;
import java.util.List;


/**
 *
 * @author Ricardo Rocha
 */
public interface IExpenseTypeRepository {
 
    void saveExpenseTypes(ExpenseType exp);
    List<ExpenseType> getAllExpenseTypes();
    /*ExpenseType getLastExpenseTypes();*/
}
