package com.SoftwareAg;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "customer")
public class XmlPOJO {
	 private int custNo;
	    private String custName;
	    private String custCountry;
	    
	    
	    @XmlAttribute
		public int getCustNo() {
			return custNo;
		}
		public void setCustNo(int custNo) {
			this.custNo = custNo;
		}
		
		@XmlElement
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		
		@XmlElement   
		public String getCustCountry() {
			return custCountry;
		}
		public void setCustCountry(String custCountry) {
			this.custCountry = custCountry;
		}
		
		
	    
	   
	
	
	
}
