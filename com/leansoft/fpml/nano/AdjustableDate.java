// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type for defining a date that shall be subject to adjustment if it would otherwise fall on a day that is not a business day in the specified business centers, together with the convention for adjusting the date.
 */
public class AdjustableDate implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private IdentifiedDate unadjustedDate;
	
	@Element
	private BusinessDayAdjustments dateAdjustments;
	
	@Element
	private IdentifiedDate adjustedDate;
	
	@Attribute  
	private String id;
	
    
	/**
     * public getter
     *
     * A date subject to adjustment.
     *
     * @returns com.leansoft.fpml.nano.IdentifiedDate
	 */
	public IdentifiedDate getUnadjustedDate() {
	    return this.unadjustedDate;
	}
	
	/**
	 * public setter
	 *
     * A date subject to adjustment.
     *
     * @param com.leansoft.fpml.nano.IdentifiedDate
	 */
	public void setUnadjustedDate(IdentifiedDate unadjustedDate) {
	    this.unadjustedDate = unadjustedDate;
	}
	/**
     * public getter
     *
     * The business day convention and financial business centers used for adjusting the date if it would otherwise fall on a day that is not a business date in the specified business centers.
     *
     * @returns com.leansoft.fpml.nano.BusinessDayAdjustments
	 */
	public BusinessDayAdjustments getDateAdjustments() {
	    return this.dateAdjustments;
	}
	
	/**
	 * public setter
	 *
     * The business day convention and financial business centers used for adjusting the date if it would otherwise fall on a day that is not a business date in the specified business centers.
     *
     * @param com.leansoft.fpml.nano.BusinessDayAdjustments
	 */
	public void setDateAdjustments(BusinessDayAdjustments dateAdjustments) {
	    this.dateAdjustments = dateAdjustments;
	}
	/**
     * public getter
     *
     * The date once the adjustment has been performed. (Note that this date may change if the business center holidays change).
     *
     * @returns com.leansoft.fpml.nano.IdentifiedDate
	 */
	public IdentifiedDate getAdjustedDate() {
	    return this.adjustedDate;
	}
	
	/**
	 * public setter
	 *
     * The date once the adjustment has been performed. (Note that this date may change if the business center holidays change).
     *
     * @param com.leansoft.fpml.nano.IdentifiedDate
	 */
	public void setAdjustedDate(IdentifiedDate adjustedDate) {
	    this.adjustedDate = adjustedDate;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getId() {
	    return this.id;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setId(String id) {
	    this.id = id;
	}

}