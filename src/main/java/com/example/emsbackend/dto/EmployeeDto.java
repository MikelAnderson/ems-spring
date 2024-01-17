package com.example.emsbackend.dto;

import lombok.*;

 // no lleva la anotacion Entity porque nose va a guardar en la base de datos

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
