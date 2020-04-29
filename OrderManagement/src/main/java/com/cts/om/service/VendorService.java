package com.cts.om.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.om.entities.Vendor;
import com.cts.om.repository.VendorRepository;
@Service
public class VendorService {
	@Autowired
	private VendorRepository repo;
	
	public List<Vendor> getvendors(){
		return (List<Vendor>) repo.findAll();
	}
	
	public void addVendor(Vendor vendor) {
		repo.save(vendor);
	}
	
	public void deleteVendor(Long vendorId) {
		repo.deleteById(vendorId);
	}
	
	public void updateVendor(Vendor vendor) {
		repo.save(vendor);
	}

}
