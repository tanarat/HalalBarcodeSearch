package org.silk.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HSC_Halal_Product")
public class Product {
	@Id
	@Column(name="hsc_halal_product_id")
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="halal_no")
	private String halalNo;
	@Column(name="upc")
	private String upc;
	@Column(name="valid_from")
	private Date halalValidFrom;
	@Column(name="valid_to")
	private Date halalValidTo;
	
	private Bpartner owner;
	private String description;
	private boolean halalExpired;
	
	public Product() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHalalNo() {
		return halalNo;
	}

	public void setHalalNo(String halalNo) {
		this.halalNo = halalNo;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public Date getHalalValidFrom() {
		return halalValidFrom;
	}

	public void setHalalValidFrom(Date halalValidFrom) {
		this.halalValidFrom = halalValidFrom;
	}

	public Date getHalalValidTo() {
		return halalValidTo;
	}

	public void setHalalValidTo(Date halalValidTo) {
		this.halalValidTo = halalValidTo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isHalalExpired() {
		return halalExpired;
	}

	public void setHalalExpired(boolean halalExpired) {
		this.halalExpired = halalExpired;
	}
	
	
	
}
