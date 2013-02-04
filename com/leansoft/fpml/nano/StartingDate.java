// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type specifying the date from which the early termination clause can be exercised.
 */
public class StartingDate implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private DateReference dateRelativeTo;
	
	@Element
	private AdjustableDate adjustableDate;
	
    
	/**
     * public getter
     *
     * Reference to a date defined elswhere in the document
     *
     * @returns com.leansoft.fpml.nano.DateReference
	 */
	public DateReference getDateRelativeTo() {
	    return this.dateRelativeTo;
	}
	
	/**
	 * public setter
	 *
     * Reference to a date defined elswhere in the document
     *
     * @param com.leansoft.fpml.nano.DateReference
	 */
	public void setDateRelativeTo(DateReference dateRelativeTo) {
	    this.dateRelativeTo = dateRelativeTo;
	}
	/**
     * public getter
     *
     * Date from which early termination clause can be exercised
     *
     * @returns com.leansoft.fpml.nano.AdjustableDate
	 */
	public AdjustableDate getAdjustableDate() {
	    return this.adjustableDate;
	}
	
	/**
	 * public setter
	 *
     * Date from which early termination clause can be exercised
     *
     * @param com.leansoft.fpml.nano.AdjustableDate
	 */
	public void setAdjustableDate(AdjustableDate adjustableDate) {
	    this.adjustableDate = adjustableDate;
	}

}