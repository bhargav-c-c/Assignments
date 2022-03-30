package com.te.hibernatedemo.mysql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.employee.EmpDetails;

public class HibernateMySqlInsert {
	public static void main(String[] args) {
		EmpDetails details=new EmpDetails();
		details.setEmpId(100);
		details.setEname("Bhargav");
		details.setEaddress("Bangalore");
		details.setEpassword("1234");
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(details);
		entityTransaction.commit();
	}

}
