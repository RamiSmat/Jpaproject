package com.examen.dao.interfaces;

import com.examen.bibliotheque.exception.BiblioException;
import com.examen.entities.Abonne;

public interface AbonneDao {
	public void ajoutAbonne(Abonne abonne);
	public void suppAbonne(Abonne abonne);
	public Abonne rechercheAbonne(int identite);
	public void updateAbonne(Abonne abonne);
	public void emprunter(String titre, int identite) throws BiblioException;
	public void rendre(int identite) throws BiblioException;

	}
