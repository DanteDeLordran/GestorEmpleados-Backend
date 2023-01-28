package com.armoredsoftware.springcrud.springcrud.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.armoredsoftware.springcrud.springcrud.Models.Empleado;
import com.armoredsoftware.springcrud.springcrud.Services.EmpleadoService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin( origins = "http://localhost:4200")
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
    public Empleado saveNewEmployee(@RequestBody Empleado empleado ){
        return empleadoService.saveNewEmployee(empleado);
    }

    //   http://localhost:8080/api/v1/empleado/{id}
    @GetMapping("/empleados/{id}")
    public ResponseEntity<Empleado> getEmployeeById( @PathVariable Long id){
        return empleadoService.getEmployeeById(id);
    }

    @PutMapping("/empleados/{id}")
    public ResponseEntity<Empleado> updateEmployee( @PathVariable Long id , @RequestBody Empleado empleado ){
        return empleadoService.updateEmployee(id, empleado);
    }

}
