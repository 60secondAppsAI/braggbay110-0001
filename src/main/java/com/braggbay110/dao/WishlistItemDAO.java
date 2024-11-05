package com.braggbay110.dao;

import java.util.List;

import com.braggbay110.dao.GenericDAO;
import com.braggbay110.domain.WishlistItem;





public interface WishlistItemDAO extends GenericDAO<WishlistItem, Integer> {
  
	List<WishlistItem> findAll();
	






}


