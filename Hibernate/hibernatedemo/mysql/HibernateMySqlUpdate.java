package com.te.hibernatedemo.mysql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.employee.EmpDetails;

public class HibernateMySqlUpdate {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		EmpDetails details = entityManager.find(EmpDetails.class, 100);
		if (details != null) {
			details.setEname("Rakesh");
		}

		entityTransaction.commit();

	}

}
