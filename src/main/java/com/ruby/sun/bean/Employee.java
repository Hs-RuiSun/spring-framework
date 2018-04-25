package com.ruby.sun.bean;
// Generated 12-Apr-2018 1:36:38 PM by Hibernate Tools 5.2.8.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Employees generated by hbm2java
 */
@Entity
@Table(name = "employees", catalog = "employees")
public class Employee implements java.io.Serializable {

	private int empNo;
	private Date birthDate;
	private String firstName;
	private String lastName;
	private String gender;
	private Date hireDate;
	private Set titleses = new HashSet(0);
	private Set salarieses = new HashSet(0);
	private Set deptEmps = new HashSet(0);
	private Set deptManagers = new HashSet(0);

	public Employee() {
	}
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee(int empNo, Date birthDate, String firstName, String lastName, String gender, Date hireDate) {
		this.empNo = empNo;
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
	}

	public Employee(int empNo, Date birthDate, String firstName, String lastName, String gender, Date hireDate,
			Set titleses, Set salarieses, Set deptEmps, Set deptManagers) {
		this.empNo = empNo;
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
		this.titleses = titleses;
		this.salarieses = salarieses;
		this.deptEmps = deptEmps;
		this.deptManagers = deptManagers;
	}

	@Id

	@Column(name = "emp_no", unique = true, nullable = false)
	public int getEmpNo() {
		return this.empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "birth_date", nullable = false, length = 10)
	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Column(name = "first_name", nullable = false, length = 14)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false, length = 16)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "gender", nullable = false, length = 2)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "hire_date", nullable = false, length = 10)
	public Date getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
	public Set getTitleses() {
		return this.titleses;
	}

	public void setTitleses(Set titleses) {
		this.titleses = titleses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
	public Set getSalarieses() {
		return this.salarieses;
	}

	public void setSalarieses(Set salarieses) {
		this.salarieses = salarieses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
	public Set getDeptEmps() {
		return this.deptEmps;
	}

	public void setDeptEmps(Set deptEmps) {
		this.deptEmps = deptEmps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
	public Set getDeptManagers() {
		return this.deptManagers;
	}

	public void setDeptManagers(Set deptManagers) {
		this.deptManagers = deptManagers;
	}

}