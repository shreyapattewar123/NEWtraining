package com.pack;

import java.util.Calendar;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pack.model.Customer;
import com.pack.util.HbUtil;

public class CustomerSaveDemo
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = null;
	    Transaction transaction = null;
	    try {
	      session = HbUtil.getSessionFactory().openSession();
	      transaction=session.getTransaction();
	        	  if(!transaction.isActive()) 
	      transaction.begin();
	      Customer customer = new Customer();
	      customer.setId(17);
	      customer.setFirstName("Nisha");
	      customer.setLastName("Rastogi");
	      customer.setEmail("rNisha@gmail.com");
	      session.save(customer);	
	      transaction.commit();
	    } catch (Exception e) {
	      if (transaction != null) {
	        transaction.rollback();
	      }
	      e.printStackTrace();
	    } finally {
	      if (session != null) {
	  	    HbUtil.shutdown();

	      }
	    }

	   // HbUtil.shutdown();
	  }
	}
