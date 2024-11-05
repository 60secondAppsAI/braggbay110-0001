package com.braggbay110.dao;

import java.util.List;

import com.braggbay110.dao.GenericDAO;
import com.braggbay110.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


