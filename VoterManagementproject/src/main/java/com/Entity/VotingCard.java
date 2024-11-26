package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class VotingCard {

	@Id
	private String voter_id;
	private String constituency;

	public VotingCard() {
		super();
	}

	public VotingCard(String voter_id, String constituency) {
		super();
		this.voter_id = voter_id;
		this.constituency = constituency;
	}

	public String getVoter_id() {
		return voter_id;
	}

	public void setVoter_id(String voter_id) {
		this.voter_id = voter_id;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}


	@Override
	public String toString() {
		return "VotingCard [voter_id=" + voter_id + ", constituency=" + constituency + "]";
	}
}
