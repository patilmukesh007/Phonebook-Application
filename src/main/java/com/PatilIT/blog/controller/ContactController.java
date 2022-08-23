package com.PatilIT.blog.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PatilIT.blog.model.Contact;
import com.PatilIT.blog.service.ContactServiceI;

@RestController
public class ContactController {
	
	@Autowired
	private ContactServiceI contactServiceI;
	
	@PostMapping(value="/saveContact" , consumes="application/json")
	public ResponseEntity<String> saveContact(@RequestBody Contact contact){
		boolean saveContact = contactServiceI.saveContact(contact);
		if(saveContact==true) {
			String msg="Data save Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}else {
			String msg="Data not save Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		}
	}
	@GetMapping(value = "/getAllContact", produces = "application/json")
	public ResponseEntity<List<Contact>> getAllContact() {
		List<Contact> allContact = contactServiceI.getAllContact();
		if(allContact!=null) {
			return new ResponseEntity<List<Contact>>(allContact, HttpStatus.OK);
		}else {
			String msg="Data not Found";
		return new ResponseEntity(msg, HttpStatus.BAD_REQUEST);
		}
		}
	
	@GetMapping(value = "/getContactById/{cId}", produces = "application/json")
	public ResponseEntity<Contact> getContactById(@PathVariable Integer cId) {
		Contact contactById = contactServiceI.getContactById(cId);
		return new ResponseEntity<Contact>(contactById, HttpStatus.OK);
		}
}
