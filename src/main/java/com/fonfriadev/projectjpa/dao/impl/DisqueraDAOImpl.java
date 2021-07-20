package com.fonfriadev.projectjpa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fonfriadev.projectjpa.dao.DisqueraDAO;
import com.fonfriadev.projectjpa.entity.Disquera;

public class DisqueraDAOImpl implements DisqueraDAO {

	private static final EntityManagerFactory EMF = Persistence
												.createEntityManagerFactory("tiendaMusicalPU");
	private EntityManager em = EMF.createEntityManager();
	
	@Override
	public void guardar(Disquera disquera) {
		try {
			em.getTransaction().begin();
			em.persist(disquera);
			em.getTransaction().commit();
		} catch(Exception ex) {
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}

	@Override
	public void actualizar(Disquera disquera) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Disquera disquera) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Disquera> consultar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Disquera consultarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
