package com.ebrain.dto;

public class Customer_dto{
	
	/*@Override
	public String toString() {
		return "Customer_dto [id=" + id + ", name=" + name + ", code=" + code + ", email=" + email + ", phone=" + phone
				+ ", contact_person_name=" + contact_person_name + ", contact_person_phone=" + contact_person_phone
				+ ", status=" + status + ", create_date=" + create_date + ", created_by=" + created_by
				+ ", modified_date=" + modified_date + ", modified_by=" + modified_by + "]";
	}*/
	private String id;
	private String name;
	private String code;
	private String email;
	private String phone;
	private String contact_person_name;
	private String contact_person_phone;
	private String status;
	private String create_date;
	private String created_by;
	private String modified_date;
	private String modified_by;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getContact_person_name() {
		return contact_person_name;
	}
	public void setContact_person_name(String contact_person_name) {
		this.contact_person_name = contact_person_name;
	}
	public String getContact_person_phone() {
		return contact_person_phone;
	}
	public void setContact_person_phone(String contact_person_phone) {
		this.contact_person_phone = contact_person_phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getModified_date() {
		return modified_date;
	}
	public void setModified_date(String modified_date) {
		this.modified_date = modified_date;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public Customer_dto(String id,String name, String code, String email, String phone, String contact_person_name,
			String contact_person_phone, String status, String create_date, String created_by, String modified_date,
			String modified_by) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.email = email;
		this.phone = phone;
		this.contact_person_name = contact_person_name;
		this.contact_person_phone = contact_person_phone;
		this.status = status;
		this.create_date = create_date;
		this.created_by = created_by;
		this.modified_date = modified_date;
		this.modified_by = modified_by;
	}
	public Customer_dto(String name, String code, String email, String phone, String contact_person_name,
			String contact_person_phone, String status, String create_date, String created_by, String modified_date,
			String modified_by) {
		super();
		this.name = name;
		this.code = code;
		this.email = email;
		this.phone = phone;
		this.contact_person_name = contact_person_name;
		this.contact_person_phone = contact_person_phone;
		this.status = status;
		this.create_date = create_date;
		this.created_by = created_by;
		this.modified_date = modified_date;
		this.modified_by = modified_by;
	}

	
	
}
