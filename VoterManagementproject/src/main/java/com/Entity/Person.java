package com.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int Aadhar_id;
	private String name;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "voter_id")
	VotingCard voter_id;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "address")
	private Address address;

	public Person() {
		super();
	}

	public Person(int aadhar_id, String name, VotingCard voter_id, Address address) {
		super();
		Aadhar_id = aadhar_id;
		this.name = name;
		this.voter_id = voter_id;
		this.address = address;
	}

	public int getAadhar_id() {
		return Aadhar_id;
	}

	public void setAadhar_id(int aadhar_id) {
		Aadhar_id = aadhar_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VotingCard getVoter_id() {
		return voter_id;
	}

	public void setVoter_id(VotingCard voter_id) {
		this.voter_id = voter_id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Preson [Aadhar_id=" + Aadhar_id + ", name=" + name + ", voter_id=" + voter_id + "]";
	}

}
