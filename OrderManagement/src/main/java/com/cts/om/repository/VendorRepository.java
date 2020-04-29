package com.cts.om.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.om.entities.Vendor;

@Repository
public interface VendorRepository extends CrudRepository<Vendor, Long> {

}
