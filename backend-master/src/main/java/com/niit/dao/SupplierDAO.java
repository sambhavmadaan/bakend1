package com.niit.dao;

import java.util.List;

import com.niit.modal.Supplier;

public interface SupplierDAO {

	public boolean addSupplier(Supplier supplier);
	public boolean updateSupplier(Supplier supplier);
	public boolean deleteSupplier(Supplier supplier);
	
	public Supplier getSupplier(int suppId);
	public List<Supplier> listsupplier();
	
}
