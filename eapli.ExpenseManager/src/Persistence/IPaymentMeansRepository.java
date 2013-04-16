/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentMean;
import java.util.List;

/**
 *
 * @author José Nuno Loureiro
 */
public interface IPaymentMeansRepository {
    void savePaymentMean(PaymentMean pm);
    List<PaymentMean> getAllPaymentMean();
    
}
