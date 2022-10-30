package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("empUnit");
	
	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}
	
}
