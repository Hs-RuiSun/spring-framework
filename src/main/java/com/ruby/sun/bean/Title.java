package com.ruby.sun.bean;
// Generated 12-Apr-2018 1:36:38 PM by Hibernate Tools 5.2.8.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Titles generated by hbm2java
 */
@Entity
@Table(name = "titles", catalog = "employees")
public class Title implements java.io.Serializable {

	private TitlesId id;
	private Employee employees;
	private Date toDate;

	public Title() {
	}

	public Title(TitlesId id, Employee employees) {
		this.id = id;
		this.employees = employees;
	}

	public Title(TitlesId id, Employee employees, Date toDate) {
		this.id = id;
		this.employees = employees;
		this.toDate = toDate;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "empNo", column = @Column(name = "emp_no", nullable = false)),
			@AttributeOverride(name = "title", column = @Column(name = "title", nullable = false, length = 50)),
			@AttributeOverride(name = "fromDate", column = @Column(name = "from_date", nullable = false, length = 10)) })
	public TitlesId getId() {
		return this.id;
	}

	public void setId(TitlesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_no", nullable = false, insertable = false, updatable = false)
	public Employee getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employee employees) {
		this.employees = employees;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "to_date", length = 10)
	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}
