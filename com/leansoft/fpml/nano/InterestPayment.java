// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * A payment requested by the agent bank from each lender for the accrued interest amount for the certain period for the certain loan contract
 */
public class InterestPayment implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private InterestCalculationMethodEnum calculationMethod;
	
	@Element
	private Date paymentDate;
	
	@Element
	private ParticipationAmount amount;
	
    
	/**
	 * public getter
	 *
     * @returns com.leansoft.fpml.nano.InterestCalculationMethodEnum
	 */
	public InterestCalculationMethodEnum getCalculationMethod() {
	    return this.calculationMethod;
	}
	
	/**
	 * public setter
	 *
     * @param com.leansoft.fpml.nano.InterestCalculationMethodEnum
	 */
	public void setCalculationMethod(InterestCalculationMethodEnum calculationMethod) {
	    this.calculationMethod = calculationMethod;
	}
	/**
     * public getter
     *
     * Date on which interest was paid to the lender by the agent bank.>
     *
     * @returns java.util.Date
	 */
	public Date getPaymentDate() {
	    return this.paymentDate;
	}
	
	/**
	 * public setter
	 *
     * Date on which interest was paid to the lender by the agent bank.>
     *
     * @param java.util.Date
	 */
	public void setPaymentDate(Date paymentDate) {
	    this.paymentDate = paymentDate;
	}
	/**
     * public getter
     *
     * Interest amount paid by the borrower to the agent bank and lender share of it
     *
     * @returns com.leansoft.fpml.nano.ParticipationAmount
	 */
	public ParticipationAmount getAmount() {
	    return this.amount;
	}
	
	/**
	 * public setter
	 *
     * Interest amount paid by the borrower to the agent bank and lender share of it
     *
     * @param com.leansoft.fpml.nano.ParticipationAmount
	 */
	public void setAmount(ParticipationAmount amount) {
	    this.amount = amount;
	}

}