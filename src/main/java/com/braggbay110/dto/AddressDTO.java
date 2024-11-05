package com.braggbay110.dto;

import java.util.List;
import java.util.Date;
import java.sql.Timestamp;
import java.time.Year;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class AddressDTO {

	private Integer addressId;

	private String line1;

	private String line2;

	private String city;

	private String state;

	private String postalCode;

	private String country;






}
