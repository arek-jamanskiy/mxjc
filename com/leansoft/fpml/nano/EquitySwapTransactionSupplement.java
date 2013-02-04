// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type for defining Equity Swap Transaction Supplement
 */
@RootElement(name = "equitySwapTransactionSupplement", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class EquitySwapTransactionSupplement extends ReturnSwapBase implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Boolean mutualEarlyTermination;
	
	@Element
	private Boolean multipleExchangeIndexAnnexFallback;
	
	@Element
	private Country localJurisdiction;
	
    
	/**
     * public getter
     *
     * Used for specifying whether the Mutual Early Termination Right that is detailed in the Master Confirmation will apply.
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getMutualEarlyTermination() {
	    return this.mutualEarlyTermination;
	}
	
	/**
	 * public setter
	 *
     * Used for specifying whether the Mutual Early Termination Right that is detailed in the Master Confirmation will apply.
     *
     * @param java.lang.Boolean
	 */
	public void setMutualEarlyTermination(Boolean mutualEarlyTermination) {
	    this.mutualEarlyTermination = mutualEarlyTermination;
	}
	/**
     * public getter
     *
     * Used for specifying whether additional annex terms for trades with underlyers that are listed on multiple exchanges, as defined in the European Master Confirmation, will apply.
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getMultipleExchangeIndexAnnexFallback() {
	    return this.multipleExchangeIndexAnnexFallback;
	}
	
	/**
	 * public setter
	 *
     * Used for specifying whether additional annex terms for trades with underlyers that are listed on multiple exchanges, as defined in the European Master Confirmation, will apply.
     *
     * @param java.lang.Boolean
	 */
	public void setMultipleExchangeIndexAnnexFallback(Boolean multipleExchangeIndexAnnexFallback) {
	    this.multipleExchangeIndexAnnexFallback = multipleExchangeIndexAnnexFallback;
	}
	/**
     * public getter
     *
     * Local Jurisdiction is a term used in the AEJ Master Confirmation, which is used to determine local taxes, which shall mean taxes, duties, and similar charges imposed by the taxing authority of the Local Jurisdiction If this element is not present Local Jurisdiction is Not Applicable
     *
     * @returns com.leansoft.fpml.nano.Country
	 */
	public Country getLocalJurisdiction() {
	    return this.localJurisdiction;
	}
	
	/**
	 * public setter
	 *
     * Local Jurisdiction is a term used in the AEJ Master Confirmation, which is used to determine local taxes, which shall mean taxes, duties, and similar charges imposed by the taxing authority of the Local Jurisdiction If this element is not present Local Jurisdiction is Not Applicable
     *
     * @param com.leansoft.fpml.nano.Country
	 */
	public void setLocalJurisdiction(Country localJurisdiction) {
	    this.localJurisdiction = localJurisdiction;
	}

}