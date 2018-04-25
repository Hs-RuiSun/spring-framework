package com.ruby.sun.service.impl;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.any;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.NotNull;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.ruby.sun.bean.Employee;
import com.ruby.sun.dao.impl.EmployeeDaoImpl;
import com.ruby.sun.util.HibernateUtil;

public class EmployeeDaoTest {
	@Mock	
	private SessionFactory mockedSessionFactory;
	@Mock	
	private Session mockedSession;
	@Mock	
	private Transaction mockedTransaction;
	@InjectMocks
	private EmployeeDaoImpl employeeDaoImpl;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		when(mockedSessionFactory.getCurrentSession()).thenReturn(mockedSession);
		when(mockedSessionFactory.openSession()).thenReturn(mockedSession);
		when(mockedSession.beginTransaction()).thenReturn(mockedTransaction);
	}
	
	@Test
	public void testAdd() {
		when(mockedSession.save(any(Employee.class))).thenReturn(new Employee());
		Employee employee = new Employee();
		assertThat(employeeDaoImpl.add(employee), is(notNullValue()));
		when(mockedSession.save(any(Employee.class))).thenAnswer(new Answer() {
			@Override
			public Object answer(InvocationOnMock invocation) throws Throwable {
				Object[] args = invocation.getArguments();
		        Object mock = invocation.getMock();
		        return "called with arguments: " + args;
			}
			
		});
	}
	
	public static void main(String[] args) {
	}
}
