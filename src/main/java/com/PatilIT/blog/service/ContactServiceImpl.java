package com.PatilIT.blog.service;

import java.util.List;
import java.util.Optional;

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
     
	@Override
	public List<Contact> getAllContact() {
		List<Contact> allContact = contactRepo.findAll();
		return allContact;
	}
	
	@Override
	public Contact getContactById(Integer cid) {
		Contact findById = contactRepo.findById(cid).get();
		return findById;
	}
	
	@Override
	public boolean updateContact(Contact contact) {
		Contact update = contactRepo.save(contact);
		if(update==null) {
			return false;
		}else {
		return true;
		}
	}

	@Override
	public boolean hardDeleteById(Integer cid) {
		
//		boolean existsById = contactRepo.existsById(cid);
//		if(existsById) {
//		contactRepo.deleteById(cid);
//		return true;
//		}else {
//			return false;
//		}
		
		Optional<Contact> findById = contactRepo.findById(cid);
		if(findById.isPresent()) {
			contactRepo.deleteById(cid);
			return true;
		}else {
			return false;
		}
	}
}
