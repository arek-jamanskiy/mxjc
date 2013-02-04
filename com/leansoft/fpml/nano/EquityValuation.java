// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type for defining how and when an equity option is to be valued.
 */
public class EquityValuation implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private AdjustableDateOrRelativeDateSequence valuationDate;
	
	@Element
	private AdjustableRelativeOrPeriodicDates valuationDates;
	
	@Element
	private TimeTypeEnum valuationTimeType;
	
	@Element
	private BusinessCenterTime valuationTime;
	
	@Element
	private Boolean futuresPriceValuation;
	
	@Element
	private Boolean optionsPriceValuation;
	
	@Attribute  
	private String id;
	
    
	/**
     * public getter
     *
     * The term "Valuation Date" is assumed to have the meaning as defined in the ISDA 2002 Equity Derivatives Definitions.
     *
     * @returns com.leansoft.fpml.nano.AdjustableDateOrRelativeDateSequence
	 */
	public AdjustableDateOrRelativeDateSequence getValuationDate() {
	    return this.valuationDate;
	}
	
	/**
	 * public setter
	 *
     * The term "Valuation Date" is assumed to have the meaning as defined in the ISDA 2002 Equity Derivatives Definitions.
     *
     * @param com.leansoft.fpml.nano.AdjustableDateOrRelativeDateSequence
	 */
	public void setValuationDate(AdjustableDateOrRelativeDateSequence valuationDate) {
	    this.valuationDate = valuationDate;
	}
	/**
     * public getter
     *
     * Specifies the interim equity valuation dates of the swap.
     *
     * @returns com.leansoft.fpml.nano.AdjustableRelativeOrPeriodicDates
	 */
	public AdjustableRelativeOrPeriodicDates getValuationDates() {
	    return this.valuationDates;
	}
	
	/**
	 * public setter
	 *
     * Specifies the interim equity valuation dates of the swap.
     *
     * @param com.leansoft.fpml.nano.AdjustableRelativeOrPeriodicDates
	 */
	public void setValuationDates(AdjustableRelativeOrPeriodicDates valuationDates) {
	    this.valuationDates = valuationDates;
	}
	/**
     * public getter
     *
     * The time of day at which the calculation agent values the underlying, for example the official closing time of the exchange.
     *
     * @returns com.leansoft.fpml.nano.TimeTypeEnum
	 */
	public TimeTypeEnum getValuationTimeType() {
	    return this.valuationTimeType;
	}
	
	/**
	 * public setter
	 *
     * The time of day at which the calculation agent values the underlying, for example the official closing time of the exchange.
     *
     * @param com.leansoft.fpml.nano.TimeTypeEnum
	 */
	public void setValuationTimeType(TimeTypeEnum valuationTimeType) {
	    this.valuationTimeType = valuationTimeType;
	}
	/**
     * public getter
     *
     * The specific time of day at which the calculation agent values the underlying.
     *
     * @returns com.leansoft.fpml.nano.BusinessCenterTime
	 */
	public BusinessCenterTime getValuationTime() {
	    return this.valuationTime;
	}
	
	/**
	 * public setter
	 *
     * The specific time of day at which the calculation agent values the underlying.
     *
     * @param com.leansoft.fpml.nano.BusinessCenterTime
	 */
	public void setValuationTime(BusinessCenterTime valuationTime) {
	    this.valuationTime = valuationTime;
	}
	/**
     * public getter
     *
     * The official settlement price as announced by the related exchange is applicable, in accordance with the ISDA 2002 definitions.
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getFuturesPriceValuation() {
	    return this.futuresPriceValuation;
	}
	
	/**
	 * public setter
	 *
     * The official settlement price as announced by the related exchange is applicable, in accordance with the ISDA 2002 definitions.
     *
     * @param java.lang.Boolean
	 */
	public void setFuturesPriceValuation(Boolean futuresPriceValuation) {
	    this.futuresPriceValuation = futuresPriceValuation;
	}
	/**
     * public getter
     *
     * The official settlement price as announced by the related exchange is applicable, in accordance with the ISDA 2002 definitions.
     *
     * @returns java.lang.Boolean
	 */
	public Boolean getOptionsPriceValuation() {
	    return this.optionsPriceValuation;
	}
	
	/**
	 * public setter
	 *
     * The official settlement price as announced by the related exchange is applicable, in accordance with the ISDA 2002 definitions.
     *
     * @param java.lang.Boolean
	 */
	public void setOptionsPriceValuation(Boolean optionsPriceValuation) {
	    this.optionsPriceValuation = optionsPriceValuation;
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