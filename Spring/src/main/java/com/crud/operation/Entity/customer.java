/*Entity is Database field setups page*/

package com.crud.operation.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "customer")
public class customer {

	@Id
	@Column(name = "customer_id" , length = 50)
	@GeneratedValue(strategy = GenerationType.AUTO)  /*sql auto_increment annotation*/
	private int customerid;
	
	@Column(name = "customer_name" , length = 50)
	private String customername;
	
	@Column(name = "customer_address" , length = 60)
	private String customeraddress;
	
	@Column(name = "mobile" , length = 12)
	private int mobile;

	/**
	 * @param customerid
	 * @param customername
	 * @param customeraddress
	 * @param mobile
	 */
	public customer(int customerid, String customername, String customeraddress, int mobile) {
		 super();
		this.customerid = customerid;
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.mobile = mobile;
	}

	public customer() {

	}
	
	
	public customer(String customername, String customeraddress, int mobile) {
		super();
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.mobile = mobile;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
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
		return "customer [customerid=" + customerid + ", customername=" + customername + ", customeraddress="
				+ customeraddress + ", mobile=" + mobile + "]";
	}
	
	
	
	
	
}
