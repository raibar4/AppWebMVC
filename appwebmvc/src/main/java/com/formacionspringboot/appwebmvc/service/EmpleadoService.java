package com.formacionspringboot.appwebmvc.service;

import java.util.List;

import com.formacionspringboot.appwebmvc.entity.Empleado;

public interface EmpleadoService {

	public List<Empleado> listarTodosLosEmpleados();
	
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado obtenerEmpleadoPorId(Long id);
	
	public void eliminarEmpleado(Long id);
}
