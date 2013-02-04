// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type describing the dividend return conditions applicable to the swap.
 */
public class Return implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private ReturnTypeEnum returnType;
	
	@Element
	private DividendConditions dividendConditions;
	
    
	/**
     * public getter
     *
     * Defines the type of return associated with the equity swap.
     *
     * @returns com.leansoft.fpml.nano.ReturnTypeEnum
	 */
	public ReturnTypeEnum getReturnType() {
	    return this.returnType;
	}
	
	/**
	 * public setter
	 *
     * Defines the type of return associated with the equity swap.
     *
     * @param com.leansoft.fpml.nano.ReturnTypeEnum
	 */
	public void setReturnType(ReturnTypeEnum returnType) {
	    this.returnType = returnType;
	}
	/**
     * public getter
     *
     * Specifies the conditions governing the payment of the dividends to the receiver of the equity return. With the exception of the dividend payout ratio, which is defined for each of the underlying components.
     *
     * @returns com.leansoft.fpml.nano.DividendConditions
	 */
	public DividendConditions getDividendConditions() {
	    return this.dividendConditions;
	}
	
	/**
	 * public setter
	 *
     * Specifies the conditions governing the payment of the dividends to the receiver of the equity return. With the exception of the dividend payout ratio, which is defined for each of the underlying components.
     *
     * @param com.leansoft.fpml.nano.DividendConditions
	 */
	public void setDividendConditions(DividendConditions dividendConditions) {
	    this.dividendConditions = dividendConditions;
	}

}