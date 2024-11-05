package com.braggbay110.dao;

import java.util.List;

import com.braggbay110.dao.GenericDAO;
import com.braggbay110.domain.Product;





public interface ProductDAO extends GenericDAO<Product, Integer> {
  
	List<Product> findAll();
	






}


