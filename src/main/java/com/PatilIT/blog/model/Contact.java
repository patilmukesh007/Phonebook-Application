package com.PatilIT.blog.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="CONTACT_DETAILS")
@NoArgsConstructor
@Getter
@Setter
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="CONTACT_ID")
	private Integer contactId;
	@Column(name ="CONTACT_NAME")
	private String contactName;
	@Column(name ="CONTACT_NUMBER")
	private String contactNumber;
	@Column(name ="CONTACT_EMAIL")
	private String contactEmail;
	@Column(name ="ACTIVE_SWITCH")
	private Character activeSwitch;
	@Column(name ="CREATED_DATE",updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	@Column(name ="UPDATED_DATE",insertable = false)
	@UpdateTimestamp
	private LocalDate updateDate;

	
	

}
