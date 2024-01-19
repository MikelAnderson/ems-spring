package com.example.emsbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor //crea constructor sin argumentos
@AllArgsConstructor //constructor con todas las propiedades
@Entity //Clase que se va a pasar en la abase de datos
@Table(name="employees") //nombre que queremos para la tabla
public class Employee {
    @Id //campo obligatorio
    @GeneratedValue(strategy = GenerationType.IDENTITY) //se genera de forma automatica y se autoinvrementa
    private Long id;
    @Column(name="first_name") //se pone con guion bajo
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name= "email_id", nullable = false, unique = true) //no puede ser null (nullable=false) , unique= campo unico
    private String email;

}
