package com.armoredsoftware.springcrud.springcrud.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.armoredsoftware.springcrud.springcrud.Models.Empleado;
import com.armoredsoftware.springcrud.springcrud.Repository.EmpleadoRepository;

@Service
public class EmpleadoService {
    
    @Autowired
    EmpleadoRepository empleadoRepository;

    public List<Empleado> getAllEmployees(){
        return (List<Empleado>) empleadoRepository.findAll();
    }

    public Empleado saveNewEmployee( Empleado empleado ) {
        return empleadoRepository.save(empleado);
    }

    public Optional<Empleado> getEmployee( Empleado empleado ){
        return empleadoRepository.findById(empleado.getIdEmpleado());
    }

    public Optional<Empleado> getEmployeeById( Long id ){
        return empleadoRepository.findById(id);
    }

}
