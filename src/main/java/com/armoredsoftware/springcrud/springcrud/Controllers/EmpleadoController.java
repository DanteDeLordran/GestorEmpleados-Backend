package com.armoredsoftware.springcrud.springcrud.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.armoredsoftware.springcrud.springcrud.Models.Empleado;
import com.armoredsoftware.springcrud.springcrud.Services.EmpleadoService;

@RestController
@RequestMapping("/api/v1")
public class EmpleadoController {
    
    @Autowired
    EmpleadoService empleadoService;

    //   http://localhost:8080/api/v1/empleados
    @GetMapping("/empleados")
    public List<Empleado> getAllEmployees(){
        return empleadoService.getAllEmployees();
    }

    //   http://localhost:8080/api/v1/empleado
    @PostMapping("/empleado")
    public Empleado saveNewEmployee( Empleado empleado ){
        return empleadoService.saveNewEmployee(empleado);
    }

}
