package com.formacionspringboot.appwebmvc.service;

import java.util.List;

import com.formacionspringboot.appwebmvc.entity.Proyecto;

public interface ProyectoService {
	public List<Proyecto> listarTodosLosProyectos();

	public Proyecto guardarProyecto(Proyecto proyectos);

	public Proyecto obtenerProyectoPorId(Long id);

	public void eliminarProyecto(Long id);
}
