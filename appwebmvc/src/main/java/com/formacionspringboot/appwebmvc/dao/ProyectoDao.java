package com.formacionspringboot.appwebmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.formacionspringboot.appwebmvc.entity.Proyecto;

@Repository
public interface ProyectoDao extends JpaRepository<Proyecto, Long> {

}
