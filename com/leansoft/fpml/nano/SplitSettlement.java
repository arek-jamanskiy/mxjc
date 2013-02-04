// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * A type that supports the division of a gross settlement amount into a number of split settlements, each requiring its own settlement instruction.
 */
public class SplitSettlement implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private Money splitSettlementAmount;
	
	@Element
	private Routing beneficiaryBank;
	
	@Element
	private Routing beneficiary;
	
    
	/**
     * public getter
     *
     * One of the monetary amounts in a split settlement payment.
     *
     * @returns com.leansoft.fpml.nano.Money
	 */
	public Money getSplitSettlementAmount() {
	    return this.splitSettlementAmount;
	}
	
	/**
	 * public setter
	 *
     * One of the monetary amounts in a split settlement payment.
     *
     * @param com.leansoft.fpml.nano.Money
	 */
	public void setSplitSettlementAmount(Money splitSettlementAmount) {
	    this.splitSettlementAmount = splitSettlementAmount;
	}
	/**
     * public getter
     *
     * The bank that acts for the ultimate beneficiary of the funds in receiving payments.
     *
     * @returns com.leansoft.fpml.nano.Routing
	 */
	public Routing getBeneficiaryBank() {
	    return this.beneficiaryBank;
	}
	
	/**
	 * public setter
	 *
     * The bank that acts for the ultimate beneficiary of the funds in receiving payments.
     *
     * @param com.leansoft.fpml.nano.Routing
	 */
	public void setBeneficiaryBank(Routing beneficiaryBank) {
	    this.beneficiaryBank = beneficiaryBank;
	}
	/**
     * public getter
     *
     * The ultimate beneficiary of the funds. The beneficiary can be identified either by an account at the beneficiaryBank (qv) or by explicit routingInformation. This element provides for the latter.
     *
     * @returns com.leansoft.fpml.nano.Routing
	 */
	public Routing getBeneficiary() {
	    return this.beneficiary;
	}
	
	/**
	 * public setter
	 *
     * The ultimate beneficiary of the funds. The beneficiary can be identified either by an account at the beneficiaryBank (qv) or by explicit routingInformation. This element provides for the latter.
     *
     * @param com.leansoft.fpml.nano.Routing
	 */
	public void setBeneficiary(Routing beneficiary) {
	    this.beneficiary = beneficiary;
	}

}