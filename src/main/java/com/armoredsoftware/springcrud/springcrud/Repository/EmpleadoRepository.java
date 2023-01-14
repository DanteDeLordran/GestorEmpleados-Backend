package com.armoredsoftware.springcrud.springcrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.armoredsoftware.springcrud.springcrud.Models.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado,Long>{
    
}
