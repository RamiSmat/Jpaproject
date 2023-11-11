package com.examen.dao.interfaces.impl;

import com.examen.bibliotheque.util.JpaUtil;
import com.examen.dao.interfaces.VideoDao;
import com.examen.entities.Video;

public class VideoDaoImpl implements VideoDao {
	public void ajouterVideo(Video video) {
		JpaUtil jpautli = new JpaUtil();
		jpautli.getEntityTransaction().begin();
		jpautli.getEntitymanager().persist(video);
		jpautli.getEntityTransaction().commit();
		jpautli.closeEntityManager();
	}
}
