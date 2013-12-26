package org.silk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="c_bpartner_location")
public class BpartnerLocation {
	@Id
	@Column(name="c_bpartner_location_id")
	private long id;
	private String name;
	private String phone;
	private String phone2;
	
	@ManyToOne
	@JoinColumn(name="c_bpartner_id")
	private Bpartner bpartner;
	
	
	@ManyToOne
	@JoinColumn(name="c_location_id")
	private Location location;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Bpartner getBpartner() {
		return bpartner;
	}
	public void setBpartner(Bpartner bpartner) {
		this.bpartner = bpartner;
	}
	
}
