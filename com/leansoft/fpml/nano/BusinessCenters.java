// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.fpml.nano;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * A type for defining financial business centers used in determining whether a day is a business day or not. A list of business centers may be ordered in the document alphabetically based on business center code. An FpML document containing an unordered business center list is still regarded as a conformant document.
 */
public class BusinessCenters implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	private List<BusinessCenter> businessCenter;
	
	@Attribute  
	private String id;
	
    
	/**
	 * public getter
	 *
     * @returns java.util.List<com.leansoft.fpml.nano.BusinessCenter>
	 */
	public List<BusinessCenter> getBusinessCenter() {
	    return this.businessCenter;
	}
	
	/**
	 * public setter
	 *
     * @param java.util.List<com.leansoft.fpml.nano.BusinessCenter>
	 */
	public void setBusinessCenter(List<BusinessCenter> businessCenter) {
	    this.businessCenter = businessCenter;
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