package com.braggbay110.dao;

import java.util.List;

import com.braggbay110.dao.GenericDAO;
import com.braggbay110.domain.Order;





public interface OrderDAO extends GenericDAO<Order, Integer> {
  
	List<Order> findAll();
	






}


