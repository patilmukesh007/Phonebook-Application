package com.PatilIT.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PatilIT.blog.model.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
