package com.PatilIT.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PatilIT.blog.model.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
