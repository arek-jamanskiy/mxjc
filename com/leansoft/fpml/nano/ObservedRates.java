// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * A type that describes prior rate observations within average rate options. Periodically, an average rate option agreement will be struck whereby some rates have already been observed in the past but will become part of computation of the average rate of the option. This structure provides for these previously observed rates to be included in the description of the trade.
 */
public class ObservedRates implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Date observationDate;
	
	@Element
	private BigDecimal observedRate;
	
    
	/**
     * public getter
     *
     * A specific date for which an observation against a particular rate will be made and will be used for subsequent computations.
     *
     * @returns java.util.Date
	 */
	public Date getObservationDate() {
	    return this.observationDate;
	}
	
	/**
	 * public setter
	 *
     * A specific date for which an observation against a particular rate will be made and will be used for subsequent computations.
     *
     * @param java.util.Date
	 */
	public void setObservationDate(Date observationDate) {
	    this.observationDate = observationDate;
	}
	/**
     * public getter
     *
     * The actual observed rate before any required rate treatment is applied, e.g. before converting a rate quoted on a discount basis to an equivalent yield. An observed rate of 5% would be represented as 0.05.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getObservedRate() {
	    return this.observedRate;
	}
	
	/**
	 * public setter
	 *
     * The actual observed rate before any required rate treatment is applied, e.g. before converting a rate quoted on a discount basis to an equivalent yield. An observed rate of 5% would be represented as 0.05.
     *
     * @param java.math.BigDecimal
	 */
	public void setObservedRate(BigDecimal observedRate) {
	    this.observedRate = observedRate;
	}

}