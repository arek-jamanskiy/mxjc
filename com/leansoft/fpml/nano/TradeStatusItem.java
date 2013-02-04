// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type used in trade status enquiry messages which relates a trade identifier to its current status value.
 */
public class TradeStatusItem implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private TradeIdentifier tradeIdentifier;
	
	@Element
	private TradeStatusValue tradeStatusValue;
	
    
	/**
     * public getter
     *
     * An instance of a unique trade identifier.
     *
     * @returns com.leansoft.fpml.nano.TradeIdentifier
	 */
	public TradeIdentifier getTradeIdentifier() {
	    return this.tradeIdentifier;
	}
	
	/**
	 * public setter
	 *
     * An instance of a unique trade identifier.
     *
     * @param com.leansoft.fpml.nano.TradeIdentifier
	 */
	public void setTradeIdentifier(TradeIdentifier tradeIdentifier) {
	    this.tradeIdentifier = tradeIdentifier;
	}
	/**
     * public getter
     *
     * The trade status value.
     *
     * @returns com.leansoft.fpml.nano.TradeStatusValue
	 */
	public TradeStatusValue getTradeStatusValue() {
	    return this.tradeStatusValue;
	}
	
	/**
	 * public setter
	 *
     * The trade status value.
     *
     * @param com.leansoft.fpml.nano.TradeStatusValue
	 */
	public void setTradeStatusValue(TradeStatusValue tradeStatusValue) {
	    this.tradeStatusValue = tradeStatusValue;
	}

}