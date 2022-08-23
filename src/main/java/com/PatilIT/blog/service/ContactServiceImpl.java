package com.PatilIT.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PatilIT.blog.model.Contact;
import com.PatilIT.blog.repository.ContactRepo;

@Service
public class ContactServiceImpl implements ContactServiceI {

	@Autowired
	private ContactRepo contactRepo;

	@Override
	public boolean saveContact(Contact contact) {
		Contact save = contactRepo.save(contact);
		if(save!=null) {
			return true;
		}else {
		return false;
	}
	}

	
}
