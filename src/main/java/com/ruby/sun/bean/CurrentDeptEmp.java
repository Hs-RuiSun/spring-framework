package com.ruby.sun.bean;
// Generated 12-Apr-2018 1:36:38 PM by Hibernate Tools 5.2.8.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CurrentDeptEmp generated by hbm2java
 */
@Entity
@Table(name = "current_dept_emp", catalog = "employees")
public class CurrentDeptEmp implements java.io.Serializable {

	private CurrentDeptEmpId id;

	public CurrentDeptEmp() {
	}

	public CurrentDeptEmp(CurrentDeptEmpId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "empNo", column = @Column(name = "emp_no", nullable = false)),
			@AttributeOverride(name = "deptNo", column = @Column(name = "dept_no", nullable = false, length = 4)),
			@AttributeOverride(name = "fromDate", column = @Column(name = "from_date", length = 10)),
			@AttributeOverride(name = "toDate", column = @Column(name = "to_date", length = 10)) })
	public CurrentDeptEmpId getId() {
		return this.id;
	}

	public void setId(CurrentDeptEmpId id) {
		this.id = id;
	}

}
