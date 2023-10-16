package com.crud.operation.Service;

import java.util.List;

import com.crud.operation.DTO.customerDTO;
import com.crud.operation.DTO.customerSaveDTO;
import com.crud.operation.DTO.customerUpdateDTO;

public interface customerService {

	String addCustomer(customerSaveDTO customerSaveDTO);

	 List<customerDTO> getAllcustomer();

	String updatecustomer(customerUpdateDTO customerupdateDTO);	

}
