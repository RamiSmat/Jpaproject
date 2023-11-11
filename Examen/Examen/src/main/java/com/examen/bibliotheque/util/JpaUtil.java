package com.examen.bibliotheque.util;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class JpaUtil {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("examen");
	EntityManager em = emf.createEntityManager();
	public EntityManager getEntitymanager() {
		return em;
	}
	public EntityTransaction getEntityTransaction() {
		return em.getTransaction();
		}
	public EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}
	public void closeEntityManager() {
		 em.close();

	}
}
