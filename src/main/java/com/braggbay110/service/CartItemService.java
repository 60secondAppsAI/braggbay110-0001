package com.braggbay110.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbay110.domain.CartItem;
import com.braggbay110.dto.CartItemDTO;
import com.braggbay110.dto.CartItemSearchDTO;
import com.braggbay110.dto.CartItemPageDTO;
import com.braggbay110.dto.CartItemConvertCriteriaDTO;
import com.braggbay110.service.GenericService;
import com.braggbay110.dto.common.RequestDTO;
import com.braggbay110.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface CartItemService extends GenericService<CartItem, Integer> {

	List<CartItem> findAll();

	ResultDTO addCartItem(CartItemDTO cartItemDTO, RequestDTO requestDTO);

	ResultDTO updateCartItem(CartItemDTO cartItemDTO, RequestDTO requestDTO);

    Page<CartItem> getAllCartItems(Pageable pageable);

    Page<CartItem> getAllCartItems(Specification<CartItem> spec, Pageable pageable);

	ResponseEntity<CartItemPageDTO> getCartItems(CartItemSearchDTO cartItemSearchDTO);
	
	List<CartItemDTO> convertCartItemsToCartItemDTOs(List<CartItem> cartItems, CartItemConvertCriteriaDTO convertCriteria);

	CartItemDTO getCartItemDTOById(Integer cartItemId);







}





