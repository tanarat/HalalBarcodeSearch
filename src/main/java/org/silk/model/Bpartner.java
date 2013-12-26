package org.silk.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="c_bpartner")
public class Bpartner implements IModelBase{
	@Id
	@Column(name="c_bpartner_id")
	private long id;
	private String name;
	private String url;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpartner")
	private Set<BpartnerLocation> bpartnerLocations = new HashSet<BpartnerLocation>();
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Set<BpartnerLocation> getBpartnerLocations() {
		return bpartnerLocations;
	}
	public void setBpartnerLocations(Set<BpartnerLocation> bpartnerLocations) {
		this.bpartnerLocations = bpartnerLocations;
	}
	
}
