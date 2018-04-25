package com.ruby.sun.service.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.ruby.sun.bean.Employee;
import com.ruby.sun.dao.impl.EmployeeDaoImpl;

public class EmployeeServiceTest {
	@Mock
	private EmployeeDaoImpl employeeDao;
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	@InjectMocks
	private EmployeeServiceImpl employeeService;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		employeeService = new EmployeeServiceImpl(employeeDao);
	}

	@Test
	public void testFind() {
		Mockito.when(employeeDao.find(1L)).thenReturn(new Employee("ruby", "sun"));
		
		Employee employee = employeeService.find(1L);
		Assert.assertEquals("ruby", employee.getFirstName());
		Assert.assertEquals("sun", employee.getLastName());
		//what's the purpose of verify the method calling parameters?
		Mockito.verify(employeeDao).find(1L);  
	}

}
