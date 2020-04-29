package com.cts.om.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="vendor")
public class Vendor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long vandor_Id;
	
	@NotNull
	@Size(max=50)
	@Column(unique=true)
	@NotBlank(message="Name Cant be blank")
	private String name;
	
	@NotNull
	@Size(max=10)
	@Column(unique=true)
	@NotBlank(message="Address  cant be blank")
	private String address;
	
	@NotNull
	@Size(max=10)
	@Column(unique=true)
	@NotBlank(message="phone number cant be blank")
	private String phone;
	
	@NotNull
	@Size(max=50)
	@Column(unique=true)
	@NotBlank(message="Email cant be blank")
	private String email;

	public Long getVandor_Id() {
		return vandor_Id;
	}

	public void setVandor_Id(Long vandor_Id) {
		this.vandor_Id = vandor_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
