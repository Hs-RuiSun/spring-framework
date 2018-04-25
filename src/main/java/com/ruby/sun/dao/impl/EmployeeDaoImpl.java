package com.ruby.sun.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ruby.sun.bean.Employee;

public class EmployeeDaoImpl{
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	
	public Employee add(Employee employee) {
		session = sessionFactory.getCurrentSession();
		transaction =session.beginTransaction();
		session.save(employee);
		transaction.commit();
		return null;
	}
	
	public Employee find(long id) {
		throw new UnsupportedOperationException();
	}
}
