package com.crud.operation.customer.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.crud.operation.Entity.customer;



@EnableJpaRepositories
@Repository
public interface customerRepo  extends JpaRepository<customer,Integer>{
	
	
	

}
