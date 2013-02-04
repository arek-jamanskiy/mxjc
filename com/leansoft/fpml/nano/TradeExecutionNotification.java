// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * Notification that a trade has been executed.
 */
@RootElement(name = "tradeExecutionNotification", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class TradeExecutionNotification extends NotificationMessage implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Trade trade;
	
	@Element
	private List<Party> party;
	
    
	/**
	 * public getter
	 *
     * @returns com.leansoft.fpml.nano.Trade
	 */
	public Trade getTrade() {
	    return this.trade;
	}
	
	/**
	 * public setter
	 *
     * @param com.leansoft.fpml.nano.Trade
	 */
	public void setTrade(Trade trade) {
	    this.trade = trade;
	}
	/**
	 * public getter
	 *
     * @returns java.util.List<com.leansoft.fpml.nano.Party>
	 */
	public List<Party> getParty() {
	    return this.party;
	}
	
	/**
	 * public setter
	 *
     * @param java.util.List<com.leansoft.fpml.nano.Party>
	 */
	public void setParty(List<Party> party) {
	    this.party = party;
	}

}