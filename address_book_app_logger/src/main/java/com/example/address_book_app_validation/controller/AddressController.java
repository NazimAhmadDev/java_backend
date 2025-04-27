package com.example.address_book_app_validation.controller;


import com.example.address_book_app_validation.model.Contact;
import com.example.address_book_app_validation.repository.AddressRepository;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class AddressController {

    private static final Logger logger = LoggerFactory.getLogger(AddressController.class);

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping
    public ResponseEntity<Contact> createContact(@Valid @RequestBody Contact contact) {
        logger.info("Creating new contact: {}", contact.getName());
        Contact savedContact = addressRepository.save(contact);
        logger.info("Contact created successfully with ID: {}", savedContact.getId());
        return ResponseEntity.ok(savedContact);
    }

    @GetMapping
    public ResponseEntity<List<Contact>> getAllContacts() {
        logger.info("Fetching all contacts");
        List<Contact> contacts = addressRepository.findAll();
        logger.info("Total contacts fetched: {}", contacts.size());
        return ResponseEntity.ok(contacts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable Long id) {
        logger.info("Fetching contact with ID: {}", id);
        Contact contact = addressRepository.findById(id).orElse(null);

        if (contact != null) {
            logger.info("Contact found: {}", contact.getName());
            return ResponseEntity.ok(contact);
        } else {
            logger.warn("Contact not found with ID: {}", id);
            return ResponseEntity.notFound().build();
        }
    }

}
