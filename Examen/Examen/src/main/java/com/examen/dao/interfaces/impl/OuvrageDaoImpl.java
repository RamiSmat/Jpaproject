package com.examen.dao.interfaces.impl;



//import java.util.List;

//import javax.persistence.TypedQuery;

//import javax.persistence.Query;

import com.examen.bibliotheque.util.JpaUtil;
import com.examen.dao.interfaces.OuvrageDao;
import com.examen.entities.Ouvrage;


public class OuvrageDaoImpl implements OuvrageDao {

	@Override
	public void ajoutOuvrage(Ouvrage ouvrage) {
		JpaUtil jpautli = new JpaUtil();
		jpautli.getEntityTransaction().begin();
		jpautli.getEntitymanager().persist(ouvrage);
		jpautli.getEntityTransaction().commit();
	}

	@Override
	public void suppOuvrage(Ouvrage ouvrage) {
		JpaUtil jpautli = new JpaUtil();
		jpautli.getEntityTransaction().begin();
		Ouvrage ouvr = jpautli.getEntitymanager().find(Ouvrage.class,ouvrage.getTitre());
		if (ouvr != null) {
			jpautli.getEntitymanager().remove(ouvr);
		}
		else {
			System.out.println("Ouvrage Introuvable");
		}
		//Query query = jpautli.getEntitymanager().createQuery("");
		jpautli.getEntityTransaction().commit();
		jpautli.closeEntityManager();
	}

	@Override
	public Ouvrage rechercheOuvrage(String titre) {
		JpaUtil jpautli = new JpaUtil();
		jpautli.getEntityTransaction().begin();
		Ouvrage ouvrage=  jpautli.getEntitymanager().find(Ouvrage.class, titre);
		jpautli.getEntityTransaction().commit();
		jpautli.closeEntityManager();
		if (ouvrage!=null) {
			return ouvrage;
		}
		else {
			return null;
		}

	}

	@Override
	public void updateOuvrage(Ouvrage ouvrage) {
		JpaUtil jpautli = new JpaUtil();
		jpautli.getEntityTransaction().begin();
		jpautli.getEntitymanager().merge(ouvrage);
		jpautli.getEntityTransaction().commit();
		jpautli.closeEntityManager();

		
	}
	
}
