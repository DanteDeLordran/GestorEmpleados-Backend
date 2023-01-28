package com.armoredsoftware.springcrud.springcrud.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.armoredsoftware.springcrud.springcrud.Exceptions.ResourceNotFoundException;
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

    public ResponseEntity<Empleado> getEmployeeById( Long id ){
        Empleado respuesta = empleadoRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("No existe el empleado con el id : " + id));
        return ResponseEntity.ok(respuesta);
    }

    public ResponseEntity<Empleado> updateEmployee( Long id , Empleado empleado){
        Empleado respuesta = empleadoRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("No existe el empleado con el id : " + id));
        
        respuesta.setNombreEmpleado(empleado.getNombreEmpleado());
        respuesta.setApellidoEmpleado(empleado.getApellidoEmpleado());
        respuesta.setEmailEmpleado(empleado.getEmailEmpleado());

        Empleado updatedEmployee = empleadoRepository.save(respuesta);

        return ResponseEntity.ok(updatedEmployee);
    }

}
