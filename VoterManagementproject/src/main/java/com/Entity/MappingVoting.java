package com.Entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MappingVoting {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Person.class);
		cfg.addAnnotatedClass(VotingCard.class);
		cfg.addAnnotatedClass(Address.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Address kpune = new Address();
		kpune.setPincode(411052);
		kpune.setCityname("Karwe Pune");

		VotingCard tms = new VotingCard();
		tms.setVoter_id("TMS1234");
		tms.setConstituency("Kothrud-Pune");
		
		VotingCard ars = new VotingCard();
		ars.setVoter_id("ARS5678");
		ars.setConstituency("Kothrud-Pune");
		
		VotingCard tka = new VotingCard();
		tka.setVoter_id("TKA6789");
		tka.setConstituency("Kothrud-Pune");

		Person p1 = new Person();
		p1.setAadhar_id(6242);
		p1.setName("Tejas Saraf");
		p1.setVoter_id(tms);
		p1.setAddress(kpune);
		Person p2 = new Person();
		p2.setAadhar_id(1232);
		p2.setName("Atul Raut");
		p2.setVoter_id(ars);
		p2.setAddress(kpune);
		Person p3 = new Person();
		p3.setAadhar_id(5678);
		p3.setName("Kiran Digrase");
		p3.setVoter_id(tka);
		p3.setAddress(kpune);
		
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		kpune.setPlist(list);
		session.save(kpune);
		tx.commit();
		session.close();
	}
}
