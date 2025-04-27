package com.example.address_book_app_validation.repository;

import com.example.address_book_app_validation.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Contact,Long> {

}
