/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.IncomeType;
import java.util.List;

/**
 *
 * @author Nuno
 */
public interface IIncomeTypeRepository {
      void saveIncomeTypes(IncomeType incomeType);
      List<IncomeType> getAllIncomeTypes();
    /*ExpenseType getLastExpenseTypes();*/
}
