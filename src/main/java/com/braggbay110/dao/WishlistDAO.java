package com.braggbay110.dao;

import java.util.List;

import com.braggbay110.dao.GenericDAO;
import com.braggbay110.domain.Wishlist;





public interface WishlistDAO extends GenericDAO<Wishlist, Integer> {
  
	List<Wishlist> findAll();
	






}


