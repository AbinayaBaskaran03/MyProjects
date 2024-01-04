package com.ebrain.dto;

public class CustomerAddress_dto {
	
	private String id;
	private String customer_id;
	private String address_type;
	private String address_line1;
	private String address_line2;
	private String city;
	private String state;
	private String country;
	private String postal_code;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getAddress_type() {
		return address_type;
	}
	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}
	public String getAddress_line1() {
		return address_line1;
	}
	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}
	public String getAddress_line2() {
		return address_line2;
	}
	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public CustomerAddress_dto(String id, String customer_id, String address_type, String address_line1,
			String address_line2, String city, String state, String country, String postal_code) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.address_type = address_type;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postal_code = postal_code;
	}
	
	
	
	
	
}
