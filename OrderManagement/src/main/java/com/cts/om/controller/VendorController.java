package com.cts.om.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.om.entities.Vendor;
import com.cts.om.service.VendorService;

@RestController
@RequestMapping("/vendor")
public class VendorController {
	@Autowired
	VendorService service;
	
	@RequestMapping("/all")
	List<Vendor> getOrder(){
		return service.getvendors();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/add")
	void addVendor(@RequestBody Vendor vendor) {
		service.addVendor(vendor);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	void updateVendor(@RequestBody Vendor vendor) {
		service.updateVendor(vendor);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/deleteId")
	void deleteVendor(@PathVariable Long vendorId) {
		service.deleteVendor(vendorId);
	}

}
