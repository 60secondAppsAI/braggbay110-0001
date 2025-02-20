package com.braggbay110.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;
import java.sql.Timestamp;
import java.time.Year;
import jakarta.persistence.Transient;



@Entity
@Table(name="addresss")
@Getter @Setter @NoArgsConstructor
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  	@Column(name="address_id")
	private Integer addressId;
    
  	@Column(name="line1")
	private String line1;
    
  	@Column(name="line2")
	private String line2;
    
  	@Column(name="city")
	private String city;
    
  	@Column(name="state")
	private String state;
    
  	@Column(name="postal_code")
	private String postalCode;
    
  	@Column(name="country")
	private String country;
    
	




}
