package com.te.hibernate.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Employee_info")
public class EmpDetails {
	
	@Id
	@Column(name="emp_Id")
	private Integer empId;
	@Column(name="emp_Name")
	private String ename;
	@Column(name="emp_Address")
	private String eaddress;
	@Column(name="emp_Password")
	private String epassword;
	
	
	
	

}
