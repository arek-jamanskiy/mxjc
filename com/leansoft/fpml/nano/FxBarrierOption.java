// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.math.BigDecimal;

/**
 * A type that describes an option with a put/call component, but also one or more associated barrier rates. If the market rate moves to reach a barrier rate a trigger event occurs. The trigger event may for example be necessary to enable the option, or may annul the option contract. [Since the barriers reduce the probability of exercise, the premium for an option with barriers is likely to be cheaper than one without].
 */
@RootElement(name = "fxBarrierOption", namespace = "http://www.fpml.org/FpML-5-0/reporting")
public class FxBarrierOption extends FxOptionLeg implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private BigDecimal spotRate;
	
	@Element
	private List<FxBarrier> fxBarrier;
	
	@Element
	private FxOptionPayout triggerPayout;
	
    
	/**
     * public getter
     *
     * An optional element used for FX forwards and certain types of FX OTC options. For deals consumated in the FX Forwards Market, this represents the current market rate for a particular currency pair. For barrier and digital/binary options, it can be useful to include the spot rate at the time the option was executed to make it easier to know whether the option needs to move "up" or "down" to be triggered.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getSpotRate() {
	    return this.spotRate;
	}
	
	/**
	 * public setter
	 *
     * An optional element used for FX forwards and certain types of FX OTC options. For deals consumated in the FX Forwards Market, this represents the current market rate for a particular currency pair. For barrier and digital/binary options, it can be useful to include the spot rate at the time the option was executed to make it easier to know whether the option needs to move "up" or "down" to be triggered.
     *
     * @param java.math.BigDecimal
	 */
	public void setSpotRate(BigDecimal spotRate) {
	    this.spotRate = spotRate;
	}
	/**
     * public getter
     *
     * Information about a barrier rate in a Barrier Option - specifying the exact criteria for a trigger event to occur.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.FxBarrier>
	 */
	public List<FxBarrier> getFxBarrier() {
	    return this.fxBarrier;
	}
	
	/**
	 * public setter
	 *
     * Information about a barrier rate in a Barrier Option - specifying the exact criteria for a trigger event to occur.
     *
     * @param java.util.List<com.leansoft.fpml.nano.FxBarrier>
	 */
	public void setFxBarrier(List<FxBarrier> fxBarrier) {
	    this.fxBarrier = fxBarrier;
	}
	/**
     * public getter
     *
     * The amount of currency which becomes payable if and when a trigger event occurs.
     *
     * @returns com.leansoft.fpml.nano.FxOptionPayout
	 */
	public FxOptionPayout getTriggerPayout() {
	    return this.triggerPayout;
	}
	
	/**
	 * public setter
	 *
     * The amount of currency which becomes payable if and when a trigger event occurs.
     *
     * @param com.leansoft.fpml.nano.FxOptionPayout
	 */
	public void setTriggerPayout(FxOptionPayout triggerPayout) {
	    this.triggerPayout = triggerPayout;
	}

}