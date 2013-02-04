// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * An abstract base class for all swap types which have a single netted leg, such as Variance Swaps, and Correlation Swaps.
 */
public abstract class NettedSwapBase extends Product implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private List<ClassifiedPayment> additionalPayment;
	
	@Element
	private ExtraordinaryEvents extraordinaryEvents;
	
    
	/**
     * public getter
     *
     * Specifies additional payment(s) between the principal parties to the netted swap.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.ClassifiedPayment>
	 */
	public List<ClassifiedPayment> getAdditionalPayment() {
	    return this.additionalPayment;
	}
	
	/**
	 * public setter
	 *
     * Specifies additional payment(s) between the principal parties to the netted swap.
     *
     * @param java.util.List<com.leansoft.fpml.nano.ClassifiedPayment>
	 */
	public void setAdditionalPayment(List<ClassifiedPayment> additionalPayment) {
	    this.additionalPayment = additionalPayment;
	}
	/**
     * public getter
     *
     * Where the underlying is shares, specifies events affecting the issuer of those shares that may require the terms of the transaction to be adjusted.
     *
     * @returns com.leansoft.fpml.nano.ExtraordinaryEvents
	 */
	public ExtraordinaryEvents getExtraordinaryEvents() {
	    return this.extraordinaryEvents;
	}
	
	/**
	 * public setter
	 *
     * Where the underlying is shares, specifies events affecting the issuer of those shares that may require the terms of the transaction to be adjusted.
     *
     * @param com.leansoft.fpml.nano.ExtraordinaryEvents
	 */
	public void setExtraordinaryEvents(ExtraordinaryEvents extraordinaryEvents) {
	    this.extraordinaryEvents = extraordinaryEvents;
	}

}