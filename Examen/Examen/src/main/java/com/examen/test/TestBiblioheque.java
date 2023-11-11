package com.examen.test;
import com.examen.entities.*;
import com.examen.bibliotheque.exception.BiblioException;
import com.examen.dao.interfaces.*;
import com.examen.dao.interfaces.impl.*;
public class TestBiblioheque {
public static void main(String[] args) {
	AbonneDao abonneDao= new AbonneDaoImpl();
	OuvrageDao ouvrageDao = new OuvrageDaoImpl();
	LivreDao livreDao =new LivreDaoImpl();
	VideoDao videoDao = new VideoDaoImpl();
	Abonne ab1= new Abonne("rekik", 56);
	Abonne ab5= new Abonne("amara", 80);
	Abonne ab11= new Abonne("frikha", 41);
	Ouvrage ouv1= new Ouvrage("java", "12/7/2000");
	Ouvrage ouv2= new Ouvrage("UML", "16/7/2004"); 
	Ouvrage ouv3= new Ouvrage("C++", "11/7/2008");
	Livre liv1 = new Livre("Comment devenir millionaire", "21/7/2018","chneider");
	Video vid1 = new Video("Le gerrier", "15/06/2015", "MG production", 3);
	abonneDao.ajoutAbonne(ab11);
	abonneDao.ajoutAbonne(ab1);
	abonneDao.ajoutAbonne(ab5); 
	ouvrageDao.ajoutOuvrage(ouv1);
	ouvrageDao.ajoutOuvrage(ouv2);
	ouvrageDao.ajoutOuvrage(ouv3);
	livreDao.ajouterLivre(liv1);
	videoDao.ajouterVideo(vid1);
	try {abonneDao.emprunter("java", 56);}
	catch (BiblioException e){
	System.out.println(e.getMessage());}
	try{
	abonneDao.rendre(56);}
	catch (BiblioException e){
	System.out.println(e.getMessage());}
	try{ abonneDao.emprunter("java", 80);}
	catch (BiblioException e){
	System.out.println(e.getMessage());
	}
	try {abonneDao.emprunter("Comment devenir millionaire", 
	41); }
	catch (BiblioException e){
	System.out.println(e.getMessage());}
	try {abonneDao.emprunter("Le gerrier", 41); }
	catch (BiblioException e){
	System.out.println(e.getMessage());}
	
	
}
}