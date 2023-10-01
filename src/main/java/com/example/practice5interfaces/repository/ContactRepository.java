package com.example.practice5interfaces.repository;

import com.example.practice5interfaces.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
