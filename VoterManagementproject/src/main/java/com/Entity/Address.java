package com.Entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Address {

	@Id
	
	private int pincode;
	private String cityname;
	
	@OneToMany(mappedBy = "address" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Person> plist = new ArrayList<>();

	public Address() {
		super();
	}

	public Address(int pincode, String cityname, List<Person> plist) {
		super();
		this.pincode = pincode;
		this.cityname = cityname;
		this.plist = plist;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public List<Person> getPlist() {
		return plist;
	}

	public void setPlist(List<Person> plist) {
		this.plist = plist;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", cityname=" + cityname + ", plist=" + plist + "]";
	}
}
