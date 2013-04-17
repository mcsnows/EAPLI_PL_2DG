/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Income;
import Model.IncomeType;
import Persistence.IIncomeRepository;
import Persistence.IIncomeTypeRepository;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author José Nuno Loureiro
 */
public class IncomeRegisterController {
     public IncomeRegisterController() {
      }

      public void registerIncome(String desc, Calendar date, BigDecimal amount, IncomeType type) {
            Income income = new Income(desc, date, amount, type);
            IIncomeRepository controller= Persistence.PersistenceRegistry.getInstance().incomeRepository();
            controller.saveIncome(income);
      }
      
    public List<IncomeType> getIncomeTypes() {
        IIncomeTypeRepository itr = Persistence.PersistenceRegistry.getInstance().incomeTypeRepository();
        return itr.getAllIncomeTypes();
    }
    
}
