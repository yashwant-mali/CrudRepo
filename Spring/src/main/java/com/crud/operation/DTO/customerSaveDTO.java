package com.crud.operation.DTO;

public class customerSaveDTO {

	
	private String customername;
	private String customeraddress;
	private int mobile;

	/**
	 * @param customerid
	 * @param customername
	 * @param customeraddress
	 * @param mobile
	 */
	public customerSaveDTO( String customername, String customeraddress, int mobile) {
		super();
		
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.mobile = mobile;
	}

	public customerSaveDTO() {

	}

	

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "customerDTO [customerid=" +  ", customername=" + customername + ", customeraddress="
				+ customeraddress + ", mobile=" + mobile + "]";
	}

}
