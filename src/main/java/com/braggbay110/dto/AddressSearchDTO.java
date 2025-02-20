package com.braggbay110.dto;

import java.sql.Timestamp;
import java.time.Year;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AddressSearchDTO {

	private Integer page = 0;
	private Integer size;
	private String sortBy;
	private String sortOrder;
	private String searchQuery;

	private Integer addressId;
	
	private String line1;
	
	private String line2;
	
	private String city;
	
	private String state;
	
	private String postalCode;
	
	private String country;
	
}
