package com.armoredsoftware.springcrud.springcrud.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empleados")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( unique = true, nullable = false )
    private Long idEmpleado;

    @Column(name = "nombre_empleado", length = 35, nullable = false)
    private String nombreEmpleado;

    @Column( name = "apellido_empleado" , length = 35, nullable = false )
    private String apellidoEmpleado;

    @Column( name = "email_empleado" , length = 40, nullable = false , unique = true)
    private String emailEmpleado;

}
