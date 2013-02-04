// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A coding scheme used to describe the type or purpose of a cash flow or cash flow component.
 */
public class CashflowType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	private String value;
	
	@Attribute  
	private String cashflowTypeScheme;
	
    
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getValue() {
	    return this.value;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setValue(String value) {
	    this.value = value;
	}
	/**
	 * public getter
	 *
     * @returns java.lang.String
	 */
	public String getCashflowTypeScheme() {
	    return this.cashflowTypeScheme;
	}
	
	/**
	 * public setter
	 *
     * @param java.lang.String
	 */
	public void setCashflowTypeScheme(String cashflowTypeScheme) {
	    this.cashflowTypeScheme = cashflowTypeScheme;
	}

}