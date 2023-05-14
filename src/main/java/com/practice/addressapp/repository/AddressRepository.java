package com.practice.addressapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.practice.addressapp.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	

	// id, lane1, lane2, state, zipcode, employee_id
	@Query(nativeQuery = true, value = "Select ea.id, ea.lane1, ea.lane2, ea.state, ea.zipcode from addressapp.address ea where ea.employee_id =:employeeId")
	Address findAddressByEmployeeId(@Param("employeeId") int employeeId);

}
