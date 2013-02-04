// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A cashflow component with optional calculation details that explain how the cashflow amount was computed.
 */
public class CalculationDetails implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private GrossCashflow grossCashflow;
	
	@Element
	private List<CashflowObservation> observationElements;
	
	@Element
	private CashflowCalculationElements calculationElements;
	
    
	/**
     * public getter
     *
     * Payment details of this cash flow component, including currency, amount and payer/payee.
     *
     * @returns com.leansoft.fpml.nano.GrossCashflow
	 */
	public GrossCashflow getGrossCashflow() {
	    return this.grossCashflow;
	}
	
	/**
	 * public setter
	 *
     * Payment details of this cash flow component, including currency, amount and payer/payee.
     *
     * @param com.leansoft.fpml.nano.GrossCashflow
	 */
	public void setGrossCashflow(GrossCashflow grossCashflow) {
	    this.grossCashflow = grossCashflow;
	}
	/**
     * public getter
     *
     * The underlyer rate or price observation(s) used to compute the amount of this cashflow component.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.CashflowObservation>
	 */
	public List<CashflowObservation> getObservationElements() {
	    return this.observationElements;
	}
	
	/**
	 * public setter
	 *
     * The underlyer rate or price observation(s) used to compute the amount of this cashflow component.
     *
     * @param java.util.List<com.leansoft.fpml.nano.CashflowObservation>
	 */
	public void setObservationElements(List<CashflowObservation> observationElements) {
	    this.observationElements = observationElements;
	}
	/**
	 * public getter
	 *
     * @returns com.leansoft.fpml.nano.CashflowCalculationElements
	 */
	public CashflowCalculationElements getCalculationElements() {
	    return this.calculationElements;
	}
	
	/**
	 * public setter
	 *
     * @param com.leansoft.fpml.nano.CashflowCalculationElements
	 */
	public void setCalculationElements(CashflowCalculationElements calculationElements) {
	    this.calculationElements = calculationElements;
	}

}