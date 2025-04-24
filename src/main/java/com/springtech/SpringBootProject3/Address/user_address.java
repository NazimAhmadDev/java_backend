package com.springtech.SpringBootProject3.Address;

import com.springtech.SpringBootProject3.Model.Address_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface user_address extends JpaRepository<Address_Details,Integer> {
}
