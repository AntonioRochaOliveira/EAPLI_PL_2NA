/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.*;
import Persistence.PaymentTypeRepository;
import Persistence.PersistenceFactory;

/**
 *
 * @author Abilio
 */
public class PaymentTypeController extends BasicController{
    
    private PaymentTypeRepository pRepository = PersistenceFactory.buildPersistenceFactory().paymentTypeRepository();
    
    public PaymentTypeController() {}
    
    public void registerPaymentType(String alias, int cod_sys) {
        PaymentType paymentType = new PaymentType(alias);
        pRepository.AddPaymentType(paymentType);
    }
    
    public void registerCard(String alias, int card_nr, String Bank_name) {
        Card card = new Card(alias,card_nr,Bank_name);
        pRepository.AddPaymentType(card);
    }
    
    public void registerCheque(String alias, String Bank_name) {
        Cheque cheque = new Cheque(alias,Bank_name);
        pRepository.AddPaymentType(cheque);
    }
    
    public void registerCash(String alias, String currency) {
        Cash cash = new Cash(alias,currency);
        pRepository.AddPaymentType(cash);
    }
    
    public void registerPaypal(String alias, String user) {
        Paypal paypal = new Paypal(alias,user);
        pRepository.AddPaymentType(paypal);
    }
    
    public String listPaymentTypeList() {
        return pRepository.listPaymentTypeList();
    }   
}
