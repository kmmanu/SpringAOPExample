package org.manu.customer.bo;

public interface CustomerBo {

	void addCustomer();
	
	String addCustomerReturnValue();
	
	void addCustomerThrowException() throws Exception;
	
	String addCustomerAround(String name);
}