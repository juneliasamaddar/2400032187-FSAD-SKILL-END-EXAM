package com.klef.fsad.exam;

import org.hibernate.cfg.Configuration;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;public class ClientDemo {
	public static void main(String args[])
	{
		ClientDemo demo = new ClientDemo(); 
		//demo.addClient();
		demo.updateClient();
	}
	public void addClient()
	{
	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");

	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();

	    Transaction t = session.beginTransaction();   

	    CustomerAccount ca = new CustomerAccount();
	    ca.setName("RAMU");
	    ca.setDescription("New Customer");
	    ca.setDate("02-05-2026");
	    ca.setStatus(true);

	    session.persist(ca);  

	    t.commit();   

	    System.out.println("Customer Added Successfully");

	    session.close();
	    sf.close();
	}
	public void updateClient()
	{
	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");

	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter Customer ID: ");
	    int id = sc.nextInt();

	    CustomerAccount ca = session.find(CustomerAccount.class, id);

	    if (ca != null)
	    {
	        Transaction t = session.beginTransaction();  

	        System.out.println("Enter New Name: ");
	        String name = sc.next();

	        System.out.println("Enter Status (true/false): ");
	        boolean status = sc.nextBoolean();

	        ca.setName(name);
	        ca.setStatus(status);

	        t.commit();   

	        System.out.println("Customer Updated Successfully");
	    }
	    else
	    {
	        System.out.println("Customer ID Not Found");
	    }

	    session.close();
	    sf.close();
	}
	
}
