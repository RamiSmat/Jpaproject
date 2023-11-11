package com.examen.dao.interfaces.impl;

import com.examen.bibliotheque.util.JpaUtil;
import com.examen.dao.interfaces.LivreDao;
import com.examen.entities.Livre;

public class LivreDaoImpl implements LivreDao {
	public void ajouterLivre(Livre livre) {
		JpaUtil jpautli = new JpaUtil();
		jpautli.getEntityTransaction().begin();
		jpautli.getEntitymanager().persist(livre);
		jpautli.getEntityTransaction().commit();
		jpautli.closeEntityManager();
	}
}
