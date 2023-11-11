package com.examen.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Abonne")
public class Abonne {
	@Id@Column(name="cin")
	private int cin;
	@Column(name="nom")
	private String nom;
	@Column(name="numAbonnement")
	private int numAbonnement;
	@Column(name="ouvrage")
	private Ouvrage ouvrage;
	
	public Abonne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Abonne(int cin, String nom, int numAbonnement, Ouvrage ouvrage) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.numAbonnement = numAbonnement;
		this.ouvrage = ouvrage;
	}
	@Override
	public String toString() {
		return "Abonne [cin=" + cin + ", nom=" + nom + ", numAbonnement=" + numAbonnement + ", ouvrage=" + ouvrage
				+ "]";
	}
	/**
	 * @return the cin
	 */
	public int getCin() {
		return cin;
	}
	/**
	 * @param cin the cin to set
	 */
	public void setCin(int cin) {
		this.cin = cin;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the numAbonnement
	 */
	public int getNumAbonnement() {
		return numAbonnement;
	}
	/**
	 * @param numAbonnement the numAbonnement to set
	 */
	public void setNumAbonnement(int numAbonnement) {
		this.numAbonnement = numAbonnement;
	}
	/**
	 * @return the ouvrage
	 */
	public Ouvrage getOuvrage() {
		return ouvrage;
	}
	/**
	 * @param ouvrage the ouvrage to set
	 */
	public void setOuvrage(Ouvrage ouvrage) {
		this.ouvrage = ouvrage;
	}
	
	
}
