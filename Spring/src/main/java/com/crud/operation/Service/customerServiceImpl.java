package com.crud.operation.Service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.operation.DTO.customerDTO;
import com.crud.operation.DTO.customerSaveDTO;
import com.crud.operation.DTO.customerUpdateDTO;
import com.crud.operation.Entity.customer;
import com.crud.operation.customer.Repo.customerRepo;

@Service
public class customerServiceImpl implements customerService {

	@Autowired
	private customerRepo CustomerRepo;

	@Override
	public String addCustomer(customerSaveDTO customerSaveDTO) {

		customer Customer = new customer(

				0, customerSaveDTO.getCustomername(), customerSaveDTO.getCustomeraddress(), customerSaveDTO.getMobile()
		);
		CustomerRepo.save(Customer);
		return Customer.getCustomername();
	}

	@Override
	public List<customerDTO> getAllcustomer() {

		List<customer> getCustomer = CustomerRepo.findAll();
		List<customerDTO> customerDTOlist = new ArrayList<>();
		for (customer a : getCustomer) {
			customerDTO CustomerDTO = new customerDTO(
					a.getCustomerid(), a.getCustomername(), a.getCustomeraddress(), a.getMobile()
					);
			customerDTOlist.add(CustomerDTO);
			
		}
		return customerDTOlist;
	}

	@Override
	public String updatecustomer(customerUpdateDTO customerupdateDTO) {

		if(CustomerRepo.existsById(customerupdateDTO.getCustomerid())) {
			customer Customer = CustomerRepo.getById(customerupdateDTO.getCustomerid());
			
			
			Customer.setCustomername(customerupdateDTO.getCustomername());
			Customer.setCustomeraddress(customerupdateDTO.getCustomeraddress());
			Customer.setMobile(customerupdateDTO.getMobile());
			CustomerRepo.save(Customer);
			
		}
			else {
				System.out.println("Customer id not found..!!!");
			}
			
			
	
		
		return null;
	}

	

}
