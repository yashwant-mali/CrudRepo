package com.crud.operation.customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.operation.DTO.customerDTO;
import com.crud.operation.DTO.customerSaveDTO;
import com.crud.operation.DTO.customerUpdateDTO;
import com.crud.operation.Service.customerService;


@RestController    /*RESTfull API Means Identify*/
@CrossOrigin(origins = "http://localhost:4200")     /*Angular , react thread part access annotation*/
@RequestMapping("api/v1/customer")  /* API worked path*/


public class customerContorller {
	
	@Autowired  /*Controller to requst handle and working this annotation*/
	private customerService Customerservice ;
	
	
	
	
	@PostMapping(path = "/save")
	public String savecustomer(@RequestBody customerSaveDTO CustomerSaveDTO) {
		
		
		String id = Customerservice.addCustomer(CustomerSaveDTO);
		return id;
		
	}
	

	@GetMapping(path = "/getAllcustomer")
	public List<customerDTO> getAllcustomer() {
		
		List<customerDTO> allcustomer = Customerservice.getAllcustomer();
	
		return allcustomer;
		
		
	}
	
	
	@PostMapping(path = "/update")
	public String savecustomer(@RequestBody customerUpdateDTO CustomerupdateDTO) {
		
		
		String id = Customerservice.updatecustomer(CustomerupdateDTO);
		return id;
		
	}
	
	

}
