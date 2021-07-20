package com.fonfriadev.projectjpa.dao;

import java.util.List;

import com.fonfriadev.projectjpa.entity.Disquera;

public interface DisqueraDAO {

	void guardar(Disquera disquera);
	void actualizar(Disquera disquera);
	void eliminar(Disquera disquera);
	List<Disquera> consultar();
	Disquera consultarPorId(int id);
}
