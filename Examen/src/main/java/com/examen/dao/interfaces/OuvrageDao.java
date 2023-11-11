package com.examen.dao.interfaces;

import com.examen.entities.Ouvrage;

public interface OuvrageDao {
	public void ajoutOuvrage(Ouvrage ouvrage);
	public void suppOuvrage(Ouvrage ouvrage);
	public Ouvrage rechercheOuvrage(String titre);
	public void updateOuvrage(Ouvrage ouvrage);
}
