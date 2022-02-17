package com.formacionspringboot.appwebmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formacionspringboot.appwebmvc.entity.Empleado;

@Repository
public interface EmpleadoDao extends JpaRepository<Empleado, Long>{

}
