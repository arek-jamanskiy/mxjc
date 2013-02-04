// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigInteger;
import java.util.List;
import java.math.BigDecimal;

/**
 * A type defining multiple exercises. As defining in the 2000 ISDA Definitions, Section 12.4. Multiple Exercise, the buyer of the option has the right to exercise all or less than all the unexercised notional amount of the underlying swap on one or more days in the exercise period, but on any such day may not exercise less than the minimum notional amount or more than the maximum notional amount, and if an integral multiple amount is specified, the notional exercised must be equal to or, be an integral multiple of, the integral multiple amount.
 */
public class MultipleExercise implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private List<ScheduleReference> notionalReference;
	
	@Element
	private BigDecimal integralMultipleAmount;
	
	@Element
	private BigDecimal minimumNotionalAmount;
	
	@Element
	private BigInteger minimumNumberOfOptions;
	
	@Element
	private BigDecimal maximumNotionalAmount;
	
	@Element
	private BigInteger maximumNumberOfOptions;
	
    
	/**
     * public getter
     *
     * A pointer style reference to the associated notional schedule defined elsewhere in the document. This element has been made optional as part of its integration in the OptionBaseExtended, because not required for the options on securities.
     *
     * @returns java.util.List<com.leansoft.fpml.nano.ScheduleReference>
	 */
	public List<ScheduleReference> getNotionalReference() {
	    return this.notionalReference;
	}
	
	/**
	 * public setter
	 *
     * A pointer style reference to the associated notional schedule defined elsewhere in the document. This element has been made optional as part of its integration in the OptionBaseExtended, because not required for the options on securities.
     *
     * @param java.util.List<com.leansoft.fpml.nano.ScheduleReference>
	 */
	public void setNotionalReference(List<ScheduleReference> notionalReference) {
	    this.notionalReference = notionalReference;
	}
	/**
     * public getter
     *
     * A notional amount which restricts the amount of notional that can be exercised when partial exercise or multiple exercise is applicable. The integral multiple amount defines a lower limit of notional that can be exercised and also defines a unit multiple of notional that can be exercised, i.e. only integer multiples of this amount can be exercised.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getIntegralMultipleAmount() {
	    return this.integralMultipleAmount;
	}
	
	/**
	 * public setter
	 *
     * A notional amount which restricts the amount of notional that can be exercised when partial exercise or multiple exercise is applicable. The integral multiple amount defines a lower limit of notional that can be exercised and also defines a unit multiple of notional that can be exercised, i.e. only integer multiples of this amount can be exercised.
     *
     * @param java.math.BigDecimal
	 */
	public void setIntegralMultipleAmount(BigDecimal integralMultipleAmount) {
	    this.integralMultipleAmount = integralMultipleAmount;
	}
	/**
     * public getter
     *
     * The minimum notional amount that can be exercised on a given exercise date. See multipleExercise.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getMinimumNotionalAmount() {
	    return this.minimumNotionalAmount;
	}
	
	/**
	 * public setter
	 *
     * The minimum notional amount that can be exercised on a given exercise date. See multipleExercise.
     *
     * @param java.math.BigDecimal
	 */
	public void setMinimumNotionalAmount(BigDecimal minimumNotionalAmount) {
	    this.minimumNotionalAmount = minimumNotionalAmount;
	}
	/**
     * public getter
     *
     * The minimum number of options that can be exercised on a given exercise date.
     *
     * @returns java.math.BigInteger
	 */
	public BigInteger getMinimumNumberOfOptions() {
	    return this.minimumNumberOfOptions;
	}
	
	/**
	 * public setter
	 *
     * The minimum number of options that can be exercised on a given exercise date.
     *
     * @param java.math.BigInteger
	 */
	public void setMinimumNumberOfOptions(BigInteger minimumNumberOfOptions) {
	    this.minimumNumberOfOptions = minimumNumberOfOptions;
	}
	/**
     * public getter
     *
     * The maximum notional amount that can be exercised on a given exercise date.
     *
     * @returns java.math.BigDecimal
	 */
	public BigDecimal getMaximumNotionalAmount() {
	    return this.maximumNotionalAmount;
	}
	
	/**
	 * public setter
	 *
     * The maximum notional amount that can be exercised on a given exercise date.
     *
     * @param java.math.BigDecimal
	 */
	public void setMaximumNotionalAmount(BigDecimal maximumNotionalAmount) {
	    this.maximumNotionalAmount = maximumNotionalAmount;
	}
	/**
     * public getter
     *
     * The maximum number of options that can be exercised on a given exercise date. If the number is not specified, it means that the maximum number of options corresponds to the remaining unexercised options.
     *
     * @returns java.math.BigInteger
	 */
	public BigInteger getMaximumNumberOfOptions() {
	    return this.maximumNumberOfOptions;
	}
	
	/**
	 * public setter
	 *
     * The maximum number of options that can be exercised on a given exercise date. If the number is not specified, it means that the maximum number of options corresponds to the remaining unexercised options.
     *
     * @param java.math.BigInteger
	 */
	public void setMaximumNumberOfOptions(BigInteger maximumNumberOfOptions) {
	    this.maximumNumberOfOptions = maximumNumberOfOptions;
	}

}