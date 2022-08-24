package com.PatilIT.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.PatilIT.blog.model.Contact;

@Service
public interface ContactServiceI {
	
	boolean saveContact(Contact contact);
	
	List<Contact> getAllContact();
	
	 Contact getContactById(Integer cid);
	 
	   boolean updateContact(Contact contact);
	   
	   boolean hardDeleteById(Integer cid);
	   
	  

}
