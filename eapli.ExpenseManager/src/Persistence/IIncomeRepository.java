/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Income;
import java.util.List;

/**
 *
 * @author José Nuno Loureiro
 */
public interface IIncomeRepository {
    void saveIncome(Income inc);
    List<Income> getAllIncomes();
}
