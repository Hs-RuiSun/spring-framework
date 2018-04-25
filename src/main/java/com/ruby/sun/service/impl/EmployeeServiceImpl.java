package com.ruby.sun.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruby.sun.bean.Employee;
import com.ruby.sun.dao.impl.EmployeeDaoImpl;
import com.ruby.sun.util.HibernateUtil;

@Service
public class EmployeeServiceImpl{
	public EmployeeDaoImpl employeeDao;
	
	public EmployeeServiceImpl(EmployeeDaoImpl employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public Employee add(Employee employee) {
		return null;
	}

	public List<Employee> list() {
		return null;
	}
	
	public Employee find(long id) {
		return employeeDao.find(id);
	}

}
