package com.tuyano.spring.boot.myapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="placeData")
public class PlaceData {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(length=50,nullable=false)
	private String name;

	@Column
	private String address;

	@Column(length=200,nullable=false)
	private String postcode;

	public PlaceData() {
		super();
	}

	public PlaceData(String name,String address,String postcode) {
		this();
		this.name=name;
		this.address=address;
		this.postcode=postcode;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "PlaceData [id="+id+", name="+name+", address="+address+" postcode="+postcode+"]";
	}


}
