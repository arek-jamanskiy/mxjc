// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

/**
 * The specification of how an FX OTC option with a trigger payout will be paid if the trigger condition is met. The contract will specify whether the payout will occur immediately or on the original value date of the option.
 */
public enum PayoutEnum {

    /**
     * If the trigger is hit, the option payout will not be paid now but will be paid on the value date of the original option.
     */
    DEFERRED("Deferred"),
  

    /**
     * If the trigger is hit, the option payout will be paid immediately (i.e., spot from the payout date).
     */
    IMMEDIATE("Immediate");
  
  
    private final String value;
  
    PayoutEnum(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static PayoutEnum fromValue(String v) {
        if (v != null) {
            for (PayoutEnum c: PayoutEnum.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}