package com.formacionspringboot.appwebmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionspringboot.appwebmvc.dao.ProyectoDao;
import com.formacionspringboot.appwebmvc.entity.Proyecto;

@Service
public class ProyectoServiceImpl implements ProyectoService {
	@Autowired
	private ProyectoDao proyectosDao;

	@Override
	public List<Proyecto> listarTodosLosProyectos() {
		return proyectosDao.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		return proyectosDao.save(proyecto);
	}

	@Override
	public Proyecto obtenerProyectoPorId(Long id) {
		return proyectosDao.findById(id).get();
	}

	@Override
	public void eliminarProyecto(Long id) {
		proyectosDao.deleteById(id);
	}
}
