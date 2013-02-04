// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

/**
 * Element to define how to deal with a none standard calculation period within a swap stream.
 */
public enum StubPeriodTypeEnum {

    /**
     * If there is a non regular period remaining it is left shorter than the streams calculation period frequency and placed at the start of the stream
     */
    SHORT_INITIAL("ShortInitial"),
  

    /**
     * If there is a non regular period remaining it is left shorter than the streams calculation period frequency and placed at the end of the stream
     */
    SHORT_FINAL("ShortFinal"),
  

    /**
     * If there is a non regular period remaining it is placed at the start of the stream and combined with the adjacent calculation period to give a long first calculation period
     */
    LONG_INITIAL("LongInitial"),
  

    /**
     * If there is a non regular period remaining it is placed at the end of the stream and combined with the adjacent calculation period to give a long last calculation period
     */
    LONG_FINAL("LongFinal");
  
  
    private final String value;
  
    StubPeriodTypeEnum(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static StubPeriodTypeEnum fromValue(String v) {
        if (v != null) {
            for (StubPeriodTypeEnum c: StubPeriodTypeEnum.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}