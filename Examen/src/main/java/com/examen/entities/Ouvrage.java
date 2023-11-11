package com.examen.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Ouvrage")
public class Ouvrage {
	@Id
	@GeneratedValue
	@Column(name="titre")
	private String titre;
	@Column(name="dateCreation")
	private String dateCreation;
	@Column(name="exist")
	private boolean exist;
	
	
	public Ouvrage() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Ouvrage [titre=" + titre + ", dateCreation=" + dateCreation + ", exist="
				+ exist + "]";
	}


	public Ouvrage(String titre, String dateCreation, boolean exist) {
		super();
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.exist = exist;
	}


	/**
	 * @return the idOuvrage
	 */


	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	/**
	 * @return the dateCreation
	 */
	public String getDateCreation() {
		return dateCreation;
	}
	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	/**
	 * @return the exist
	 */
	public boolean isExist() {
		return exist;
	}
	/**
	 * @param exist the exist to set
	 */
	public void setExist(boolean exist) {
		this.exist = exist;
	}
	
	
}
